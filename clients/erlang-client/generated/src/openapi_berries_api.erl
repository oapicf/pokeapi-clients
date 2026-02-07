-module(openapi_berries_api).

-export([berry_firmness_list/1, berry_firmness_list/2,
         berry_firmness_retrieve/2, berry_firmness_retrieve/3,
         berry_flavor_list/1, berry_flavor_list/2,
         berry_flavor_retrieve/2, berry_flavor_retrieve/3,
         berry_list/1, berry_list/2,
         berry_retrieve/2, berry_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List berry firmness
%% Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
-spec berry_firmness_list(ctx:ctx()) -> {ok, openapi_paginated_berry_firmness_summary_list:openapi_paginated_berry_firmness_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_firmness_list(Ctx) ->
    berry_firmness_list(Ctx, #{}).

-spec berry_firmness_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_berry_firmness_summary_list:openapi_paginated_berry_firmness_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_firmness_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/berry-firmness/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get berry by firmness
%% Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
-spec berry_firmness_retrieve(ctx:ctx(), binary()) -> {ok, openapi_berry_firmness_detail:openapi_berry_firmness_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_firmness_retrieve(Ctx, Id) ->
    berry_firmness_retrieve(Ctx, Id, #{}).

-spec berry_firmness_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_berry_firmness_detail:openapi_berry_firmness_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_firmness_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/berry-firmness/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List berry flavors
%% Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
-spec berry_flavor_list(ctx:ctx()) -> {ok, openapi_paginated_berry_flavor_summary_list:openapi_paginated_berry_flavor_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_flavor_list(Ctx) ->
    berry_flavor_list(Ctx, #{}).

-spec berry_flavor_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_berry_flavor_summary_list:openapi_paginated_berry_flavor_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_flavor_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/berry-flavor/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get berries by flavor
%% Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
-spec berry_flavor_retrieve(ctx:ctx(), binary()) -> {ok, openapi_berry_flavor_detail:openapi_berry_flavor_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_flavor_retrieve(Ctx, Id) ->
    berry_flavor_retrieve(Ctx, Id, #{}).

-spec berry_flavor_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_berry_flavor_detail:openapi_berry_flavor_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_flavor_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/berry-flavor/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List berries
%% Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
-spec berry_list(ctx:ctx()) -> {ok, openapi_paginated_berry_summary_list:openapi_paginated_berry_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_list(Ctx) ->
    berry_list(Ctx, #{}).

-spec berry_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_berry_summary_list:openapi_paginated_berry_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/berry/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a berry
%% Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
-spec berry_retrieve(ctx:ctx(), binary()) -> {ok, openapi_berry_detail:openapi_berry_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_retrieve(Ctx, Id) ->
    berry_retrieve(Ctx, Id, #{}).

-spec berry_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_berry_detail:openapi_berry_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
berry_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/berry/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


