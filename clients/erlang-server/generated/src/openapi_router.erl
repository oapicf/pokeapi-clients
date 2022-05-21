-module(openapi_router).

-export([get_paths/1, get_validator_state/0]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorMod :: module()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'AbilityList' => #{
            path => "/api/v2/ability/",
            method => <<"GET">>,
            handler => 'openapi_ability_handler'
        },
        'AbilityRead' => #{
            path => "/api/v2/ability/:id/",
            method => <<"GET">>,
            handler => 'openapi_ability_handler'
        },
        'BerryList' => #{
            path => "/api/v2/berry/",
            method => <<"GET">>,
            handler => 'openapi_berry_handler'
        },
        'BerryRead' => #{
            path => "/api/v2/berry/:id/",
            method => <<"GET">>,
            handler => 'openapi_berry_handler'
        },
        'BerryFirmnessList' => #{
            path => "/api/v2/berry-firmness/",
            method => <<"GET">>,
            handler => 'openapi_berry_firmness_handler'
        },
        'BerryFirmnessRead' => #{
            path => "/api/v2/berry-firmness/:id/",
            method => <<"GET">>,
            handler => 'openapi_berry_firmness_handler'
        },
        'BerryFlavorList' => #{
            path => "/api/v2/berry-flavor/",
            method => <<"GET">>,
            handler => 'openapi_berry_flavor_handler'
        },
        'BerryFlavorRead' => #{
            path => "/api/v2/berry-flavor/:id/",
            method => <<"GET">>,
            handler => 'openapi_berry_flavor_handler'
        },
        'CharacteristicList' => #{
            path => "/api/v2/characteristic/",
            method => <<"GET">>,
            handler => 'openapi_characteristic_handler'
        },
        'CharacteristicRead' => #{
            path => "/api/v2/characteristic/:id/",
            method => <<"GET">>,
            handler => 'openapi_characteristic_handler'
        },
        'ContestEffectList' => #{
            path => "/api/v2/contest-effect/",
            method => <<"GET">>,
            handler => 'openapi_contest_effect_handler'
        },
        'ContestEffectRead' => #{
            path => "/api/v2/contest-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_contest_effect_handler'
        },
        'ContestTypeList' => #{
            path => "/api/v2/contest-type/",
            method => <<"GET">>,
            handler => 'openapi_contest_type_handler'
        },
        'ContestTypeRead' => #{
            path => "/api/v2/contest-type/:id/",
            method => <<"GET">>,
            handler => 'openapi_contest_type_handler'
        },
        'EggGroupList' => #{
            path => "/api/v2/egg-group/",
            method => <<"GET">>,
            handler => 'openapi_egg_group_handler'
        },
        'EggGroupRead' => #{
            path => "/api/v2/egg-group/:id/",
            method => <<"GET">>,
            handler => 'openapi_egg_group_handler'
        },
        'EncounterConditionList' => #{
            path => "/api/v2/encounter-condition/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_handler'
        },
        'EncounterConditionRead' => #{
            path => "/api/v2/encounter-condition/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_handler'
        },
        'EncounterConditionValueList' => #{
            path => "/api/v2/encounter-condition-value/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_value_handler'
        },
        'EncounterConditionValueRead' => #{
            path => "/api/v2/encounter-condition-value/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounter_condition_value_handler'
        },
        'EncounterMethodList' => #{
            path => "/api/v2/encounter-method/",
            method => <<"GET">>,
            handler => 'openapi_encounter_method_handler'
        },
        'EncounterMethodRead' => #{
            path => "/api/v2/encounter-method/:id/",
            method => <<"GET">>,
            handler => 'openapi_encounter_method_handler'
        },
        'EvolutionChainList' => #{
            path => "/api/v2/evolution-chain/",
            method => <<"GET">>,
            handler => 'openapi_evolution_chain_handler'
        },
        'EvolutionChainRead' => #{
            path => "/api/v2/evolution-chain/:id/",
            method => <<"GET">>,
            handler => 'openapi_evolution_chain_handler'
        },
        'EvolutionTriggerList' => #{
            path => "/api/v2/evolution-trigger/",
            method => <<"GET">>,
            handler => 'openapi_evolution_trigger_handler'
        },
        'EvolutionTriggerRead' => #{
            path => "/api/v2/evolution-trigger/:id/",
            method => <<"GET">>,
            handler => 'openapi_evolution_trigger_handler'
        },
        'GenderList' => #{
            path => "/api/v2/gender/",
            method => <<"GET">>,
            handler => 'openapi_gender_handler'
        },
        'GenderRead' => #{
            path => "/api/v2/gender/:id/",
            method => <<"GET">>,
            handler => 'openapi_gender_handler'
        },
        'GenerationList' => #{
            path => "/api/v2/generation/",
            method => <<"GET">>,
            handler => 'openapi_generation_handler'
        },
        'GenerationRead' => #{
            path => "/api/v2/generation/:id/",
            method => <<"GET">>,
            handler => 'openapi_generation_handler'
        },
        'GrowthRateList' => #{
            path => "/api/v2/growth-rate/",
            method => <<"GET">>,
            handler => 'openapi_growth_rate_handler'
        },
        'GrowthRateRead' => #{
            path => "/api/v2/growth-rate/:id/",
            method => <<"GET">>,
            handler => 'openapi_growth_rate_handler'
        },
        'ItemList' => #{
            path => "/api/v2/item/",
            method => <<"GET">>,
            handler => 'openapi_item_handler'
        },
        'ItemRead' => #{
            path => "/api/v2/item/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_handler'
        },
        'ItemAttributeList' => #{
            path => "/api/v2/item-attribute/",
            method => <<"GET">>,
            handler => 'openapi_item_attribute_handler'
        },
        'ItemAttributeRead' => #{
            path => "/api/v2/item-attribute/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_attribute_handler'
        },
        'ItemCategoryList' => #{
            path => "/api/v2/item-category/",
            method => <<"GET">>,
            handler => 'openapi_item_category_handler'
        },
        'ItemCategoryRead' => #{
            path => "/api/v2/item-category/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_category_handler'
        },
        'ItemFlingEffectList' => #{
            path => "/api/v2/item-fling-effect/",
            method => <<"GET">>,
            handler => 'openapi_item_fling_effect_handler'
        },
        'ItemFlingEffectRead' => #{
            path => "/api/v2/item-fling-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_fling_effect_handler'
        },
        'ItemPocketList' => #{
            path => "/api/v2/item-pocket/",
            method => <<"GET">>,
            handler => 'openapi_item_pocket_handler'
        },
        'ItemPocketRead' => #{
            path => "/api/v2/item-pocket/:id/",
            method => <<"GET">>,
            handler => 'openapi_item_pocket_handler'
        },
        'LanguageList' => #{
            path => "/api/v2/language/",
            method => <<"GET">>,
            handler => 'openapi_language_handler'
        },
        'LanguageRead' => #{
            path => "/api/v2/language/:id/",
            method => <<"GET">>,
            handler => 'openapi_language_handler'
        },
        'LocationList' => #{
            path => "/api/v2/location/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
        'LocationRead' => #{
            path => "/api/v2/location/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
        'LocationAreaList' => #{
            path => "/api/v2/location-area/",
            method => <<"GET">>,
            handler => 'openapi_location_area_handler'
        },
        'LocationAreaRead' => #{
            path => "/api/v2/location-area/:id/",
            method => <<"GET">>,
            handler => 'openapi_location_area_handler'
        },
        'MachineList' => #{
            path => "/api/v2/machine/",
            method => <<"GET">>,
            handler => 'openapi_machine_handler'
        },
        'MachineRead' => #{
            path => "/api/v2/machine/:id/",
            method => <<"GET">>,
            handler => 'openapi_machine_handler'
        },
        'MoveList' => #{
            path => "/api/v2/move/",
            method => <<"GET">>,
            handler => 'openapi_move_handler'
        },
        'MoveRead' => #{
            path => "/api/v2/move/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_handler'
        },
        'MoveAilmentList' => #{
            path => "/api/v2/move-ailment/",
            method => <<"GET">>,
            handler => 'openapi_move_ailment_handler'
        },
        'MoveAilmentRead' => #{
            path => "/api/v2/move-ailment/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_ailment_handler'
        },
        'MoveBattleStyleList' => #{
            path => "/api/v2/move-battle-style/",
            method => <<"GET">>,
            handler => 'openapi_move_battle_style_handler'
        },
        'MoveBattleStyleRead' => #{
            path => "/api/v2/move-battle-style/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_battle_style_handler'
        },
        'MoveCategoryList' => #{
            path => "/api/v2/move-category/",
            method => <<"GET">>,
            handler => 'openapi_move_category_handler'
        },
        'MoveCategoryRead' => #{
            path => "/api/v2/move-category/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_category_handler'
        },
        'MoveDamageClassList' => #{
            path => "/api/v2/move-damage-class/",
            method => <<"GET">>,
            handler => 'openapi_move_damage_class_handler'
        },
        'MoveDamageClassRead' => #{
            path => "/api/v2/move-damage-class/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_damage_class_handler'
        },
        'MoveLearnMethodList' => #{
            path => "/api/v2/move-learn-method/",
            method => <<"GET">>,
            handler => 'openapi_move_learn_method_handler'
        },
        'MoveLearnMethodRead' => #{
            path => "/api/v2/move-learn-method/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_learn_method_handler'
        },
        'MoveTargetList' => #{
            path => "/api/v2/move-target/",
            method => <<"GET">>,
            handler => 'openapi_move_target_handler'
        },
        'MoveTargetRead' => #{
            path => "/api/v2/move-target/:id/",
            method => <<"GET">>,
            handler => 'openapi_move_target_handler'
        },
        'NatureList' => #{
            path => "/api/v2/nature/",
            method => <<"GET">>,
            handler => 'openapi_nature_handler'
        },
        'NatureRead' => #{
            path => "/api/v2/nature/:id/",
            method => <<"GET">>,
            handler => 'openapi_nature_handler'
        },
        'PalParkAreaList' => #{
            path => "/api/v2/pal-park-area/",
            method => <<"GET">>,
            handler => 'openapi_pal_park_area_handler'
        },
        'PalParkAreaRead' => #{
            path => "/api/v2/pal-park-area/:id/",
            method => <<"GET">>,
            handler => 'openapi_pal_park_area_handler'
        },
        'PokeathlonStatList' => #{
            path => "/api/v2/pokeathlon-stat/",
            method => <<"GET">>,
            handler => 'openapi_pokeathlon_stat_handler'
        },
        'PokeathlonStatRead' => #{
            path => "/api/v2/pokeathlon-stat/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokeathlon_stat_handler'
        },
        'PokedexList' => #{
            path => "/api/v2/pokedex/",
            method => <<"GET">>,
            handler => 'openapi_pokedex_handler'
        },
        'PokedexRead' => #{
            path => "/api/v2/pokedex/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokedex_handler'
        },
        'PokemonList' => #{
            path => "/api/v2/pokemon/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
        'PokemonRead' => #{
            path => "/api/v2/pokemon/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_handler'
        },
        'PokemonColorList' => #{
            path => "/api/v2/pokemon-color/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_color_handler'
        },
        'PokemonColorRead' => #{
            path => "/api/v2/pokemon-color/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_color_handler'
        },
        'PokemonFormList' => #{
            path => "/api/v2/pokemon-form/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_form_handler'
        },
        'PokemonFormRead' => #{
            path => "/api/v2/pokemon-form/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_form_handler'
        },
        'PokemonHabitatList' => #{
            path => "/api/v2/pokemon-habitat/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_habitat_handler'
        },
        'PokemonHabitatRead' => #{
            path => "/api/v2/pokemon-habitat/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_habitat_handler'
        },
        'PokemonShapeList' => #{
            path => "/api/v2/pokemon-shape/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_shape_handler'
        },
        'PokemonShapeRead' => #{
            path => "/api/v2/pokemon-shape/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_shape_handler'
        },
        'PokemonSpeciesList' => #{
            path => "/api/v2/pokemon-species/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_species_handler'
        },
        'PokemonSpeciesRead' => #{
            path => "/api/v2/pokemon-species/:id/",
            method => <<"GET">>,
            handler => 'openapi_pokemon_species_handler'
        },
        'RegionList' => #{
            path => "/api/v2/region/",
            method => <<"GET">>,
            handler => 'openapi_region_handler'
        },
        'RegionRead' => #{
            path => "/api/v2/region/:id/",
            method => <<"GET">>,
            handler => 'openapi_region_handler'
        },
        'StatList' => #{
            path => "/api/v2/stat/",
            method => <<"GET">>,
            handler => 'openapi_stat_handler'
        },
        'StatRead' => #{
            path => "/api/v2/stat/:id/",
            method => <<"GET">>,
            handler => 'openapi_stat_handler'
        },
        'SuperContestEffectList' => #{
            path => "/api/v2/super-contest-effect/",
            method => <<"GET">>,
            handler => 'openapi_super_contest_effect_handler'
        },
        'SuperContestEffectRead' => #{
            path => "/api/v2/super-contest-effect/:id/",
            method => <<"GET">>,
            handler => 'openapi_super_contest_effect_handler'
        },
        'TypeList' => #{
            path => "/api/v2/type/",
            method => <<"GET">>,
            handler => 'openapi_type_handler'
        },
        'TypeRead' => #{
            path => "/api/v2/type/:id/",
            method => <<"GET">>,
            handler => 'openapi_type_handler'
        },
        'VersionList' => #{
            path => "/api/v2/version/",
            method => <<"GET">>,
            handler => 'openapi_version_handler'
        },
        'VersionRead' => #{
            path => "/api/v2/version/:id/",
            method => <<"GET">>,
            handler => 'openapi_version_handler'
        },
        'VersionGroupList' => #{
            path => "/api/v2/version-group/",
            method => <<"GET">>,
            handler => 'openapi_version_group_handler'
        },
        'VersionGroupRead' => #{
            path => "/api/v2/version-group/:id/",
            method => <<"GET">>,
            handler => 'openapi_version_group_handler'
        }
    }.

get_validator_state() ->
    persistent_term:get({?MODULE, validator_state}).


prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    JesseState = jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]),
    persistent_term:put({?MODULE, validator_state}, JesseState),
    ?MODULE.


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").
