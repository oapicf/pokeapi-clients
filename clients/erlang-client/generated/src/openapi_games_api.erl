-module(openapi_games_api).

-export([generation_list/1, generation_list/2,
         generation_retrieve/2, generation_retrieve/3,
         pokedex_list/1, pokedex_list/2,
         pokedex_retrieve/2, pokedex_retrieve/3,
         version_group_list/1, version_group_list/2,
         version_group_retrieve/2, version_group_retrieve/3,
         version_list/1, version_list/2,
         version_retrieve/2, version_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List genrations
%% A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
-spec generation_list(ctx:ctx()) -> {ok, openapi_paginated_generation_summary_list:openapi_paginated_generation_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
generation_list(Ctx) ->
    generation_list(Ctx, #{}).

-spec generation_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_generation_summary_list:openapi_paginated_generation_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
generation_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/generation/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get genration
%% A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
-spec generation_retrieve(ctx:ctx(), binary()) -> {ok, openapi_generation_detail:openapi_generation_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
generation_retrieve(Ctx, Id) ->
    generation_retrieve(Ctx, Id, #{}).

-spec generation_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_generation_detail:openapi_generation_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
generation_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/generation/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokedex
%% A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
-spec pokedex_list(ctx:ctx()) -> {ok, openapi_paginated_pokedex_summary_list:openapi_paginated_pokedex_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokedex_list(Ctx) ->
    pokedex_list(Ctx, #{}).

-spec pokedex_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokedex_summary_list:openapi_paginated_pokedex_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokedex_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokedex/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokedex
%% A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
-spec pokedex_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokedex_detail:openapi_pokedex_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokedex_retrieve(Ctx, Id) ->
    pokedex_retrieve(Ctx, Id, #{}).

-spec pokedex_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokedex_detail:openapi_pokedex_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokedex_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokedex/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List version groups
%% Version groups categorize highly similar versions of the games.
-spec version_group_list(ctx:ctx()) -> {ok, openapi_paginated_version_group_summary_list:openapi_paginated_version_group_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_group_list(Ctx) ->
    version_group_list(Ctx, #{}).

-spec version_group_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_version_group_summary_list:openapi_paginated_version_group_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_group_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/version-group/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get version group
%% Version groups categorize highly similar versions of the games.
-spec version_group_retrieve(ctx:ctx(), binary()) -> {ok, openapi_version_group_detail:openapi_version_group_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_group_retrieve(Ctx, Id) ->
    version_group_retrieve(Ctx, Id, #{}).

-spec version_group_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_version_group_detail:openapi_version_group_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_group_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/version-group/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List versions
%% Versions of the games, e.g., Red, Blue or Yellow.
-spec version_list(ctx:ctx()) -> {ok, openapi_paginated_version_summary_list:openapi_paginated_version_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_list(Ctx) ->
    version_list(Ctx, #{}).

-spec version_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_version_summary_list:openapi_paginated_version_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/version/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get version
%% Versions of the games, e.g., Red, Blue or Yellow.
-spec version_retrieve(ctx:ctx(), binary()) -> {ok, openapi_version_detail:openapi_version_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_retrieve(Ctx, Id) ->
    version_retrieve(Ctx, Id, #{}).

-spec version_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_version_detail:openapi_version_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
version_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/version/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


