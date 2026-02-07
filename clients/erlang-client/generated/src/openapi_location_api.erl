-module(openapi_location_api).

-export([location_area_list/1, location_area_list/2,
         location_area_retrieve/2, location_area_retrieve/3,
         location_list/1, location_list/2,
         location_retrieve/2, location_retrieve/3,
         pal_park_area_list/1, pal_park_area_list/2,
         pal_park_area_retrieve/2, pal_park_area_retrieve/3,
         region_list/1, region_list/2,
         region_retrieve/2, region_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List location areas
%% Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
-spec location_area_list(ctx:ctx()) -> {ok, openapi_paginated_location_area_summary_list:openapi_paginated_location_area_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_area_list(Ctx) ->
    location_area_list(Ctx, #{}).

-spec location_area_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_location_area_summary_list:openapi_paginated_location_area_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_area_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/location-area/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get location area
%% Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
-spec location_area_retrieve(ctx:ctx(), integer()) -> {ok, openapi_location_area_detail:openapi_location_area_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_area_retrieve(Ctx, Id) ->
    location_area_retrieve(Ctx, Id, #{}).

-spec location_area_retrieve(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_location_area_detail:openapi_location_area_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_area_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/location-area/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List locations
%% Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
-spec location_list(ctx:ctx()) -> {ok, openapi_paginated_location_summary_list:openapi_paginated_location_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_list(Ctx) ->
    location_list(Ctx, #{}).

-spec location_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_location_summary_list:openapi_paginated_location_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/location/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get location
%% Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
-spec location_retrieve(ctx:ctx(), binary()) -> {ok, openapi_location_detail:openapi_location_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_retrieve(Ctx, Id) ->
    location_retrieve(Ctx, Id, #{}).

-spec location_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_location_detail:openapi_location_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
location_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/location/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pal park areas
%% Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
-spec pal_park_area_list(ctx:ctx()) -> {ok, openapi_paginated_pal_park_area_summary_list:openapi_paginated_pal_park_area_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pal_park_area_list(Ctx) ->
    pal_park_area_list(Ctx, #{}).

-spec pal_park_area_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pal_park_area_summary_list:openapi_paginated_pal_park_area_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pal_park_area_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pal-park-area/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pal park area
%% Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
-spec pal_park_area_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pal_park_area_detail:openapi_pal_park_area_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pal_park_area_retrieve(Ctx, Id) ->
    pal_park_area_retrieve(Ctx, Id, #{}).

-spec pal_park_area_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pal_park_area_detail:openapi_pal_park_area_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pal_park_area_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pal-park-area/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List regions
%% A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
-spec region_list(ctx:ctx()) -> {ok, openapi_paginated_region_summary_list:openapi_paginated_region_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
region_list(Ctx) ->
    region_list(Ctx, #{}).

-spec region_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_region_summary_list:openapi_paginated_region_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
region_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/region/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get region
%% A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
-spec region_retrieve(ctx:ctx(), binary()) -> {ok, openapi_region_detail:openapi_region_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
region_retrieve(Ctx, Id) ->
    region_retrieve(Ctx, Id, #{}).

-spec region_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_region_detail:openapi_region_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
region_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/region/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


