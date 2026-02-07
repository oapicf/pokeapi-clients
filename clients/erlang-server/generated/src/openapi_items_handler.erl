-module(openapi_items_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/api/v2/item-attribute/`, OperationId: `item_attribute_list`:
List item attributes.
Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

- `GET` to `/api/v2/item-attribute/:id/`, OperationId: `item_attribute_retrieve`:
Get item attribute.
Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

- `GET` to `/api/v2/item-category/`, OperationId: `item_category_list`:
List item categories.
Item categories determine where items will be placed in the players bag.

- `GET` to `/api/v2/item-category/:id/`, OperationId: `item_category_retrieve`:
Get item category.
Item categories determine where items will be placed in the players bag.

- `GET` to `/api/v2/item-fling-effect/`, OperationId: `item_fling_effect_list`:
List item fling effects.
The various effects of the move\&quot;Fling\&quot; when used with different items.

- `GET` to `/api/v2/item-fling-effect/:id/`, OperationId: `item_fling_effect_retrieve`:
Get item fling effect.
The various effects of the move\&quot;Fling\&quot; when used with different items.

- `GET` to `/api/v2/item/`, OperationId: `item_list`:
List items.
An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

- `GET` to `/api/v2/item-pocket/`, OperationId: `item_pocket_list`:
List item pockets.
Pockets within the players bag used for storing items by category.

- `GET` to `/api/v2/item-pocket/:id/`, OperationId: `item_pocket_retrieve`:
Get item pocket.
Pockets within the players bag used for storing items by category.

- `GET` to `/api/v2/item/:id/`, OperationId: `item_retrieve`:
Get item.
An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

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

-type class() :: 'items'.

-type operation_id() ::
    'item_attribute_list' %% List item attributes
    | 'item_attribute_retrieve' %% Get item attribute
    | 'item_category_list' %% List item categories
    | 'item_category_retrieve' %% Get item category
    | 'item_fling_effect_list' %% List item fling effects
    | 'item_fling_effect_retrieve' %% Get item fling effect
    | 'item_list' %% List items
    | 'item_pocket_list' %% List item pockets
    | 'item_pocket_retrieve' %% Get item pocket
    | 'item_retrieve'. %% Get item


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
allowed_methods(Req, #state{operation_id = 'item_attribute_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_attribute_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_category_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_category_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_fling_effect_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_fling_effect_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_pocket_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_pocket_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'item_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'item_attribute_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_attribute_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_category_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_category_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_fling_effect_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_fling_effect_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_pocket_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_pocket_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'item_retrieve' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'item_attribute_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_attribute_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_category_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_category_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_fling_effect_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_fling_effect_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_pocket_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_pocket_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'item_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'item_attribute_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_attribute_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_category_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_category_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_fling_effect_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_fling_effect_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_pocket_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_pocket_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'item_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'item_attribute_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_attribute_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_category_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_category_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_fling_effect_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_fling_effect_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_pocket_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_pocket_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'item_retrieve'} = State) ->
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
    {Res, Req1, Context1} = Handler(items, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(items, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
