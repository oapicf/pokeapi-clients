-module(openapi_location_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/api/v2/location-area/`, OperationId: `location_area_list`:
List location areas.
Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

- `GET` to `/api/v2/location-area/:id/`, OperationId: `location_area_retrieve`:
Get location area.
Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

- `GET` to `/api/v2/location/`, OperationId: `location_list`:
List locations.
Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

- `GET` to `/api/v2/location/:id/`, OperationId: `location_retrieve`:
Get location.
Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

- `GET` to `/api/v2/pal-park-area/`, OperationId: `pal_park_area_list`:
List pal park areas.
Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

- `GET` to `/api/v2/pal-park-area/:id/`, OperationId: `pal_park_area_retrieve`:
Get pal park area.
Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

- `GET` to `/api/v2/region/`, OperationId: `region_list`:
List regions.
A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

- `GET` to `/api/v2/region/:id/`, OperationId: `region_retrieve`:
Get region.
A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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

-type class() :: 'location'.

-type operation_id() ::
    'location_area_list' %% List location areas
    | 'location_area_retrieve' %% Get location area
    | 'location_list' %% List locations
    | 'location_retrieve' %% Get location
    | 'pal_park_area_list' %% List pal park areas
    | 'pal_park_area_retrieve' %% Get pal park area
    | 'region_list' %% List regions
    | 'region_retrieve'. %% Get region


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
allowed_methods(Req, #state{operation_id = 'location_area_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'location_area_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'location_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'location_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pal_park_area_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'pal_park_area_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'region_list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'region_retrieve'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'location_area_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'location_area_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'location_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'location_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pal_park_area_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'pal_park_area_retrieve' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'region_list' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'region_retrieve' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'location_area_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'location_area_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'location_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'location_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pal_park_area_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'pal_park_area_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'region_list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'region_retrieve'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'location_area_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'location_area_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'location_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'location_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pal_park_area_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'pal_park_area_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'region_list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'region_retrieve'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'location_area_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'location_area_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'location_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'location_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pal_park_area_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'pal_park_area_retrieve'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'region_list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'region_retrieve'} = State) ->
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
    {Res, Req1, Context1} = Handler(location, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(location, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
