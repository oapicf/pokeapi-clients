-module(openapi_evolution_api).

-export([evolution_chain_list/1, evolution_chain_list/2,
         evolution_chain_retrieve/2, evolution_chain_retrieve/3,
         evolution_trigger_list/1, evolution_trigger_list/2,
         evolution_trigger_retrieve/2, evolution_trigger_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List evolution chains
%% Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
-spec evolution_chain_list(ctx:ctx()) -> {ok, openapi_paginated_evolution_chain_summary_list:openapi_paginated_evolution_chain_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_chain_list(Ctx) ->
    evolution_chain_list(Ctx, #{}).

-spec evolution_chain_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_evolution_chain_summary_list:openapi_paginated_evolution_chain_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_chain_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/evolution-chain/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get evolution chain
%% Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
-spec evolution_chain_retrieve(ctx:ctx(), binary()) -> {ok, openapi_evolution_chain_detail:openapi_evolution_chain_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_chain_retrieve(Ctx, Id) ->
    evolution_chain_retrieve(Ctx, Id, #{}).

-spec evolution_chain_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_evolution_chain_detail:openapi_evolution_chain_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_chain_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/evolution-chain/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List evolution triggers
%% Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
-spec evolution_trigger_list(ctx:ctx()) -> {ok, openapi_paginated_evolution_trigger_summary_list:openapi_paginated_evolution_trigger_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_trigger_list(Ctx) ->
    evolution_trigger_list(Ctx, #{}).

-spec evolution_trigger_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_evolution_trigger_summary_list:openapi_paginated_evolution_trigger_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_trigger_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/evolution-trigger/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get evolution trigger
%% Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
-spec evolution_trigger_retrieve(ctx:ctx(), binary()) -> {ok, openapi_evolution_trigger_detail:openapi_evolution_trigger_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_trigger_retrieve(Ctx, Id) ->
    evolution_trigger_retrieve(Ctx, Id, #{}).

-spec evolution_trigger_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_evolution_trigger_detail:openapi_evolution_trigger_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
evolution_trigger_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/evolution-trigger/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


