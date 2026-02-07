-module(openapi_pokemon_api).

-export([ability_list/1, ability_list/2,
         ability_retrieve/2, ability_retrieve/3,
         characteristic_list/1, characteristic_list/2,
         characteristic_retrieve/2, characteristic_retrieve/3,
         egg_group_list/1, egg_group_list/2,
         egg_group_retrieve/2, egg_group_retrieve/3,
         gender_list/1, gender_list/2,
         gender_retrieve/2, gender_retrieve/3,
         growth_rate_list/1, growth_rate_list/2,
         growth_rate_retrieve/2, growth_rate_retrieve/3,
         move_damage_class_list/1, move_damage_class_list/2,
         move_damage_class_retrieve/2, move_damage_class_retrieve/3,
         nature_list/1, nature_list/2,
         nature_retrieve/2, nature_retrieve/3,
         pokeathlon_stat_list/1, pokeathlon_stat_list/2,
         pokeathlon_stat_retrieve/2, pokeathlon_stat_retrieve/3,
         pokemon_color_list/1, pokemon_color_list/2,
         pokemon_color_retrieve/2, pokemon_color_retrieve/3,
         pokemon_form_list/1, pokemon_form_list/2,
         pokemon_form_retrieve/2, pokemon_form_retrieve/3,
         pokemon_habitat_list/1, pokemon_habitat_list/2,
         pokemon_habitat_retrieve/2, pokemon_habitat_retrieve/3,
         pokemon_list/1, pokemon_list/2,
         pokemon_retrieve/2, pokemon_retrieve/3,
         pokemon_shape_list/1, pokemon_shape_list/2,
         pokemon_shape_retrieve/2, pokemon_shape_retrieve/3,
         pokemon_species_list/1, pokemon_species_list/2,
         pokemon_species_retrieve/2, pokemon_species_retrieve/3,
         stat_list/1, stat_list/2,
         stat_retrieve/2, stat_retrieve/3,
         type_list/1, type_list/2,
         type_retrieve/2, type_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc 
%% Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
-spec ability_list(ctx:ctx()) -> {ok, openapi_paginated_ability_summary_list:openapi_paginated_ability_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ability_list(Ctx) ->
    ability_list(Ctx, #{}).

-spec ability_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_ability_summary_list:openapi_paginated_ability_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ability_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/ability/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
-spec ability_retrieve(ctx:ctx(), binary()) -> {ok, openapi_ability_detail:openapi_ability_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ability_retrieve(Ctx, Id) ->
    ability_retrieve(Ctx, Id, #{}).

-spec ability_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ability_detail:openapi_ability_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ability_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/ability/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List charecterictics
%% Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
-spec characteristic_list(ctx:ctx()) -> {ok, openapi_paginated_characteristic_summary_list:openapi_paginated_characteristic_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
characteristic_list(Ctx) ->
    characteristic_list(Ctx, #{}).

-spec characteristic_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_characteristic_summary_list:openapi_paginated_characteristic_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
characteristic_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/characteristic/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get characteristic
%% Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
-spec characteristic_retrieve(ctx:ctx(), binary()) -> {ok, openapi_characteristic_detail:openapi_characteristic_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
characteristic_retrieve(Ctx, Id) ->
    characteristic_retrieve(Ctx, Id, #{}).

-spec characteristic_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_characteristic_detail:openapi_characteristic_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
characteristic_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/characteristic/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List egg groups
%% Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
-spec egg_group_list(ctx:ctx()) -> {ok, openapi_paginated_egg_group_summary_list:openapi_paginated_egg_group_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
egg_group_list(Ctx) ->
    egg_group_list(Ctx, #{}).

-spec egg_group_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_egg_group_summary_list:openapi_paginated_egg_group_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
egg_group_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/egg-group/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get egg group
%% Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
-spec egg_group_retrieve(ctx:ctx(), binary()) -> {ok, openapi_egg_group_detail:openapi_egg_group_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
egg_group_retrieve(Ctx, Id) ->
    egg_group_retrieve(Ctx, Id, #{}).

-spec egg_group_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_egg_group_detail:openapi_egg_group_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
egg_group_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/egg-group/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List genders
%% Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
-spec gender_list(ctx:ctx()) -> {ok, openapi_paginated_gender_summary_list:openapi_paginated_gender_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
gender_list(Ctx) ->
    gender_list(Ctx, #{}).

-spec gender_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_gender_summary_list:openapi_paginated_gender_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
gender_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/gender/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get gender
%% Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
-spec gender_retrieve(ctx:ctx(), binary()) -> {ok, openapi_gender_detail:openapi_gender_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
gender_retrieve(Ctx, Id) ->
    gender_retrieve(Ctx, Id, #{}).

-spec gender_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_gender_detail:openapi_gender_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
gender_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/gender/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List growth rates
%% Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
-spec growth_rate_list(ctx:ctx()) -> {ok, openapi_paginated_growth_rate_summary_list:openapi_paginated_growth_rate_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
growth_rate_list(Ctx) ->
    growth_rate_list(Ctx, #{}).

-spec growth_rate_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_growth_rate_summary_list:openapi_paginated_growth_rate_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
growth_rate_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/growth-rate/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get growth rate
%% Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
-spec growth_rate_retrieve(ctx:ctx(), binary()) -> {ok, openapi_growth_rate_detail:openapi_growth_rate_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
growth_rate_retrieve(Ctx, Id) ->
    growth_rate_retrieve(Ctx, Id, #{}).

-spec growth_rate_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_growth_rate_detail:openapi_growth_rate_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
growth_rate_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/growth-rate/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List move damage classes
%% Damage classes moves can have, e.g. physical, special, or non-damaging.
-spec move_damage_class_list(ctx:ctx()) -> {ok, openapi_paginated_move_damage_class_summary_list:openapi_paginated_move_damage_class_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_damage_class_list(Ctx) ->
    move_damage_class_list(Ctx, #{}).

-spec move_damage_class_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_move_damage_class_summary_list:openapi_paginated_move_damage_class_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_damage_class_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-damage-class/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get move damage class
%% Damage classes moves can have, e.g. physical, special, or non-damaging.
-spec move_damage_class_retrieve(ctx:ctx(), binary()) -> {ok, openapi_move_damage_class_detail:openapi_move_damage_class_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_damage_class_retrieve(Ctx, Id) ->
    move_damage_class_retrieve(Ctx, Id, #{}).

-spec move_damage_class_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_move_damage_class_detail:openapi_move_damage_class_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_damage_class_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-damage-class/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List natures
%% Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
-spec nature_list(ctx:ctx()) -> {ok, openapi_paginated_nature_summary_list:openapi_paginated_nature_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
nature_list(Ctx) ->
    nature_list(Ctx, #{}).

-spec nature_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_nature_summary_list:openapi_paginated_nature_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
nature_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/nature/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get nature
%% Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
-spec nature_retrieve(ctx:ctx(), binary()) -> {ok, openapi_nature_detail:openapi_nature_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
nature_retrieve(Ctx, Id) ->
    nature_retrieve(Ctx, Id, #{}).

-spec nature_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_nature_detail:openapi_nature_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
nature_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/nature/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokeathlon stats
%% Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
-spec pokeathlon_stat_list(ctx:ctx()) -> {ok, openapi_paginated_pokeathlon_stat_summary_list:openapi_paginated_pokeathlon_stat_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokeathlon_stat_list(Ctx) ->
    pokeathlon_stat_list(Ctx, #{}).

-spec pokeathlon_stat_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokeathlon_stat_summary_list:openapi_paginated_pokeathlon_stat_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokeathlon_stat_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokeathlon-stat/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokeathlon stat
%% Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
-spec pokeathlon_stat_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokeathlon_stat_detail:openapi_pokeathlon_stat_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokeathlon_stat_retrieve(Ctx, Id) ->
    pokeathlon_stat_retrieve(Ctx, Id, #{}).

-spec pokeathlon_stat_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokeathlon_stat_detail:openapi_pokeathlon_stat_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokeathlon_stat_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokeathlon-stat/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokemon colors
%% Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
-spec pokemon_color_list(ctx:ctx()) -> {ok, openapi_paginated_pokemon_color_summary_list:openapi_paginated_pokemon_color_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_color_list(Ctx) ->
    pokemon_color_list(Ctx, #{}).

-spec pokemon_color_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokemon_color_summary_list:openapi_paginated_pokemon_color_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_color_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-color/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokemon color
%% Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
-spec pokemon_color_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokemon_color_detail:openapi_pokemon_color_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_color_retrieve(Ctx, Id) ->
    pokemon_color_retrieve(Ctx, Id, #{}).

-spec pokemon_color_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokemon_color_detail:openapi_pokemon_color_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_color_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-color/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokemon forms
%% Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
-spec pokemon_form_list(ctx:ctx()) -> {ok, openapi_paginated_pokemon_form_summary_list:openapi_paginated_pokemon_form_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_form_list(Ctx) ->
    pokemon_form_list(Ctx, #{}).

-spec pokemon_form_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokemon_form_summary_list:openapi_paginated_pokemon_form_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_form_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-form/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokemon form
%% Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
-spec pokemon_form_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokemon_form_detail:openapi_pokemon_form_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_form_retrieve(Ctx, Id) ->
    pokemon_form_retrieve(Ctx, Id, #{}).

-spec pokemon_form_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokemon_form_detail:openapi_pokemon_form_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_form_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-form/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokemom habitas
%% Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
-spec pokemon_habitat_list(ctx:ctx()) -> {ok, openapi_paginated_pokemon_habitat_summary_list:openapi_paginated_pokemon_habitat_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_habitat_list(Ctx) ->
    pokemon_habitat_list(Ctx, #{}).

-spec pokemon_habitat_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokemon_habitat_summary_list:openapi_paginated_pokemon_habitat_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_habitat_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-habitat/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokemom habita
%% Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
-spec pokemon_habitat_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokemon_habitat_detail:openapi_pokemon_habitat_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_habitat_retrieve(Ctx, Id) ->
    pokemon_habitat_retrieve(Ctx, Id, #{}).

-spec pokemon_habitat_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokemon_habitat_detail:openapi_pokemon_habitat_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_habitat_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-habitat/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokemon
%% Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
-spec pokemon_list(ctx:ctx()) -> {ok, openapi_paginated_pokemon_summary_list:openapi_paginated_pokemon_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_list(Ctx) ->
    pokemon_list(Ctx, #{}).

-spec pokemon_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokemon_summary_list:openapi_paginated_pokemon_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokemon
%% Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
-spec pokemon_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokemon_detail:openapi_pokemon_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_retrieve(Ctx, Id) ->
    pokemon_retrieve(Ctx, Id, #{}).

-spec pokemon_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokemon_detail:openapi_pokemon_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokemon shapes
%% Shapes used for sorting Pokémon in a Pokédex.
-spec pokemon_shape_list(ctx:ctx()) -> {ok, openapi_paginated_pokemon_shape_summary_list:openapi_paginated_pokemon_shape_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_list(Ctx) ->
    pokemon_shape_list(Ctx, #{}).

-spec pokemon_shape_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokemon_shape_summary_list:openapi_paginated_pokemon_shape_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-shape/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokemon shape
%% Shapes used for sorting Pokémon in a Pokédex.
-spec pokemon_shape_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokemon_shape_detail:openapi_pokemon_shape_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_retrieve(Ctx, Id) ->
    pokemon_shape_retrieve(Ctx, Id, #{}).

-spec pokemon_shape_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokemon_shape_detail:openapi_pokemon_shape_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_shape_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-shape/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List pokemon species
%% A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
-spec pokemon_species_list(ctx:ctx()) -> {ok, openapi_paginated_pokemon_species_summary_list:openapi_paginated_pokemon_species_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_species_list(Ctx) ->
    pokemon_species_list(Ctx, #{}).

-spec pokemon_species_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_pokemon_species_summary_list:openapi_paginated_pokemon_species_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_species_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-species/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pokemon species
%% A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
-spec pokemon_species_retrieve(ctx:ctx(), binary()) -> {ok, openapi_pokemon_species_detail:openapi_pokemon_species_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_species_retrieve(Ctx, Id) ->
    pokemon_species_retrieve(Ctx, Id, #{}).

-spec pokemon_species_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pokemon_species_detail:openapi_pokemon_species_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
pokemon_species_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/pokemon-species/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List stats
%% Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
-spec stat_list(ctx:ctx()) -> {ok, openapi_paginated_stat_summary_list:openapi_paginated_stat_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
stat_list(Ctx) ->
    stat_list(Ctx, #{}).

-spec stat_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_stat_summary_list:openapi_paginated_stat_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
stat_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/stat/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get stat
%% Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
-spec stat_retrieve(ctx:ctx(), binary()) -> {ok, openapi_stat_detail:openapi_stat_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
stat_retrieve(Ctx, Id) ->
    stat_retrieve(Ctx, Id, #{}).

-spec stat_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_stat_detail:openapi_stat_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
stat_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/stat/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List types
%% Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
-spec type_list(ctx:ctx()) -> {ok, openapi_paginated_type_summary_list:openapi_paginated_type_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
type_list(Ctx) ->
    type_list(Ctx, #{}).

-spec type_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_type_summary_list:openapi_paginated_type_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
type_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/type/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get types
%% Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
-spec type_retrieve(ctx:ctx(), binary()) -> {ok, openapi_type_detail:openapi_type_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
type_retrieve(Ctx, Id) ->
    type_retrieve(Ctx, Id, #{}).

-spec type_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_type_detail:openapi_type_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
type_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/type/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


