-module(openapi_pokemon_shape_api).

-export([pokemon_shape_list/1, pokemon_shape_list/2,
         pokemon_shape_read/2, pokemon_shape_read/3]).

-define(BASE_URL, <<"/api/v2">>).

%% @doc 
%% 
-spec pokemon_shape_list(ctx:ctx()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_list(Ctx) ->
    pokemon_shape_list(Ctx, #{}).

-spec pokemon_shape_list(ctx:ctx(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/api/v2/pokemon-shape/">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec pokemon_shape_read(ctx:ctx(), integer()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_read(Ctx, Id) ->
    pokemon_shape_read(Ctx, Id, #{}).

-spec pokemon_shape_read(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_read(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/api/v2/pokemon-shape/", Id, "/">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


