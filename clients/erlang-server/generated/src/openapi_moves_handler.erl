-module(openapi_moves_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/api/v2/move-ailment/`, OperationId: `move_ailment_list`:
List move meta ailments.
Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

- `GET` to `/api/v2/move-ailment/:id/`, OperationId: `move_ailment_retrieve`:
Get move meta ailment.
Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

- `GET` to `/api/v2/move-battle-style/`, OperationId: `move_battle_style_list`:
List move battle styles.
Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

- `GET` to `/api/v2/move-battle-style/:id/`, OperationId: `move_battle_style_retrieve`:
Get move battle style.
Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

- `GET` to `/api/v2/move-category/`, OperationId: `move_category_list`:
List move meta categories.
Very general categories that loosely group move effects.

- `GET` to `/api/v2/move-category/:id/`, OperationId: `move_category_retrieve`:
Get move meta category.
Very general categories that loosely group move effects.

- `GET` to `/api/v2/move-learn-method/`, OperationId: `move_learn_method_list`:
List move learn methods.
Methods by which Pokémon can learn moves.

- `GET` to `/api/v2/move-learn-method/:id/`, OperationId: `move_learn_method_retrieve`:
Get move learn method.
Methods by which Pokémon can learn moves.

- `GET` to `/api/v2/move/`, OperationId: `move_list`:
List moves.
Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

- `GET` to `/api/v2/move/:id/`, OperationId: `move_retrieve`:
Get move.
Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

- `GET` to `/api/v2/move-target/`, OperationId: `move_target_list`:
List move targets.
Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

- `GET` to `/api/v2/move-target/:id/`, OperationId: `move_target_retrieve`:
Get move target.
Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

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

-type class() :: 'moves'.

-type operation_id() ::
    'move_ailment_list' %% List move meta ailments
    | 'move_ailment_retrieve' %% Get move meta ailment
    | 'move_battle_style_list' %% List move battle styles
    | 'move_battle_style_retrieve' %% Get move battle style
    | 'move_category_list' %% List move meta categories
    | 'move_category_retrieve' %% Get move meta category
    | 'move_learn_method_list' %% List move learn methods
    | 'move_learn_method_retrieve' %% Get move learn method
    | 'move_list' %% List moves
    | 'move_retrieve' %% Get move
    | 'move_target_list' %% List move targets
    | 'move_target_retrieve'. %% Get move target


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
allowed_methods(Req, #state{operation_id = 'move_ailment_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_ailment_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_battle_style_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_battle_style_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_category_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_category_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_learn_method_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_learn_method_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_target_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'move_target_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'move_ailment_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_ailment_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_battle_style_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_battle_style_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_category_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_category_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_learn_method_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_learn_method_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_target_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'move_target_retrieve' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'move_ailment_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_ailment_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_battle_style_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_battle_style_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_category_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_category_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_learn_method_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_learn_method_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_target_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'move_target_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'move_ailment_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_ailment_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_battle_style_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_battle_style_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_category_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_category_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_learn_method_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_learn_method_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_target_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'move_target_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'move_ailment_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_ailment_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_battle_style_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_battle_style_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_category_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_category_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_learn_method_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_learn_method_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_target_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'move_target_retrieve'} = State) ->
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
    {Res, Req1, Context1} = Handler(moves, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(moves, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
