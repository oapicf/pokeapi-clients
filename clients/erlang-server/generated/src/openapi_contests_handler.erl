-module(openapi_contests_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/api/v2/contest-effect/`, OperationId: `contest_effect_list`:
List contest effects.
Contest effects refer to the effects of moves when used in contests.

- `GET` to `/api/v2/contest-effect/:id/`, OperationId: `contest_effect_retrieve`:
Get contest effect.
Contest effects refer to the effects of moves when used in contests.

- `GET` to `/api/v2/contest-type/`, OperationId: `contest_type_list`:
List contest types.
Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

- `GET` to `/api/v2/contest-type/:id/`, OperationId: `contest_type_retrieve`:
Get contest type.
Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

- `GET` to `/api/v2/super-contest-effect/`, OperationId: `super_contest_effect_list`:
List super contest effects.
Super contest effects refer to the effects of moves when used in super contests.

- `GET` to `/api/v2/super-contest-effect/:id/`, OperationId: `super_contest_effect_retrieve`:
Get super contest effect.
Super contest effects refer to the effects of moves when used in super contests.

""".

-behaviour(cowboy_rest).

-include_lib("kernel/include/logger.hrl").

%% Cowboy REST callbacks
-export([init/2]).
-export([allowed_methods/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([valid_content_headers/2]).
-export([handle_type_accepted/2, handle_type_provided/2]).

-ignore_xref([handle_type_accepted/2, handle_type_provided/2]).

-export_type([class/0, operation_id/0]).

-type class() :: 'contests'.

-type operation_id() ::
    'contest_effect_list' %% List contest effects
    | 'contest_effect_retrieve' %% Get contest effect
    | 'contest_type_list' %% List contest types
    | 'contest_type_retrieve' %% Get contest type
    | 'super_contest_effect_list' %% List super contest effects
    | 'super_contest_effect_retrieve'. %% Get super contest effect


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_callback :: openapi_logic_handler:api_key_callback(),
         context = #{} :: openapi_logic_handler:context()}).

-type state() :: #state{}.

-spec init(cowboy_req:req(), openapi_router:init_opts()) ->
    {cowboy_rest, cowboy_req:req(), state()}.
init(Req, {Operations, Module}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),
    ?LOG_INFO(#{what => "Attempt to process operation",
                method => Method,
                operation_id => OperationID}),
    State = #state{operation_id = OperationID,
                   accept_callback = fun Module:accept_callback/4,
                   provide_callback = fun Module:provide_callback/4,
                   api_key_callback = fun Module:api_key_callback/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'contest_effect_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'contest_effect_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'contest_type_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'contest_type_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'super_contest_effect_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'super_contest_effect_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'contest_effect_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'contest_effect_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'contest_type_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'contest_type_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'super_contest_effect_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'super_contest_effect_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'contest_effect_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'contest_effect_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'contest_type_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'contest_type_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'super_contest_effect_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'super_contest_effect_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'contest_effect_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'contest_effect_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'contest_type_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'contest_type_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'super_contest_effect_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'super_contest_effect_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'contest_effect_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'contest_effect_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'contest_type_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'contest_type_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'super_contest_effect_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'super_contest_effect_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, State) ->
    {[], Req, State}.

-spec delete_resource(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
delete_resource(Req, State) ->
    {Res, Req1, State1} = handle_type_accepted(Req, State),
    {true =:= Res, Req1, State1}.

-spec handle_type_accepted(cowboy_req:req(), state()) ->
    { openapi_logic_handler:accept_callback_return(), cowboy_req:req(), state()}.
handle_type_accepted(Req, #state{operation_id = OperationID,
                                 accept_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(contests, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(contests, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
