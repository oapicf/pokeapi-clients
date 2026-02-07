-module(openapi_encounters_api).

-export([encounter_condition_list/1, encounter_condition_list/2,
         encounter_condition_retrieve/2, encounter_condition_retrieve/3,
         encounter_condition_value_list/1, encounter_condition_value_list/2,
         encounter_condition_value_retrieve/2, encounter_condition_value_retrieve/3,
         encounter_method_list/1, encounter_method_list/2,
         encounter_method_retrieve/2, encounter_method_retrieve/3,
         pokemon_encounters_retrieve/2, pokemon_encounters_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List encounter conditions
%% Conditions which affect what pokemon might appear in the wild, e.g., day or night.
-spec encounter_condition_list(ctx:ctx()) -> {ok, openapi_paginated_encounter_condition_summary_list:openapi_paginated_encounter_condition_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_list(Ctx) ->
    encounter_condition_list(Ctx, #{}).

-spec encounter_condition_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_encounter_condition_summary_list:openapi_paginated_encounter_condition_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/encounter-condition/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get encounter condition
%% Conditions which affect what pokemon might appear in the wild, e.g., day or night.
-spec encounter_condition_retrieve(ctx:ctx(), binary()) -> {ok, openapi_encounter_condition_detail:openapi_encounter_condition_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_retrieve(Ctx, Id) ->
    encounter_condition_retrieve(Ctx, Id, #{}).

-spec encounter_condition_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_encounter_condition_detail:openapi_encounter_condition_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/encounter-condition/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List encounter condition values
%% Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
-spec encounter_condition_value_list(ctx:ctx()) -> {ok, openapi_paginated_encounter_condition_value_summary_list:openapi_paginated_encounter_condition_value_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_value_list(Ctx) ->
    encounter_condition_value_list(Ctx, #{}).

-spec encounter_condition_value_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_encounter_condition_value_summary_list:openapi_paginated_encounter_condition_value_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_value_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/encounter-condition-value/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get encounter condition value
%% Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
-spec encounter_condition_value_retrieve(ctx:ctx(), binary()) -> {ok, openapi_encounter_condition_value_detail:openapi_encounter_condition_value_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_value_retrieve(Ctx, Id) ->
    encounter_condition_value_retrieve(Ctx, Id, #{}).

-spec encounter_condition_value_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_encounter_condition_value_detail:openapi_encounter_condition_value_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_condition_value_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/encounter-condition-value/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List encounter methods
%% Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
-spec encounter_method_list(ctx:ctx()) -> {ok, openapi_paginated_encounter_method_summary_list:openapi_paginated_encounter_method_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_method_list(Ctx) ->
    encounter_method_list(Ctx, #{}).

-spec encounter_method_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_encounter_method_summary_list:openapi_paginated_encounter_method_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_method_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/encounter-method/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get encounter method
%% Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
-spec encounter_method_retrieve(ctx:ctx(), binary()) -> {ok, openapi_encounter_method_detail:openapi_encounter_method_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_method_retrieve(Ctx, Id) ->
    encounter_method_retrieve(Ctx, Id, #{}).

-spec encounter_method_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_encounter_method_detail:openapi_encounter_method_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
encounter_method_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/encounter-method/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokemon encounter
%% Handles Pokemon Encounters as a sub-resource.
-spec pokemon_encounters_retrieve(ctx:ctx(), binary()) -> {ok, [openapi_pokemon_encounters_retrieve_200_response_inner:openapi_pokemon_encounters_retrieve_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_encounters_retrieve(Ctx, PokemonId) ->
    pokemon_encounters_retrieve(Ctx, PokemonId, #{}).

-spec pokemon_encounters_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_pokemon_encounters_retrieve_200_response_inner:openapi_pokemon_encounters_retrieve_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_encounters_retrieve(Ctx, PokemonId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon/", PokemonId, "/encounters"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


