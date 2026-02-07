-module(openapi_api).
-moduledoc """
This module offers an API for JSON schema validation, using `jesse` under the hood.

If validation is desired, a jesse state can be loaded using `prepare_validator/1`,
and request and response can be validated using `populate_request/3`
and `validate_response/4` respectively.

For example, the user-defined `Module:accept_callback/4` can be implemented as follows:
```
-spec accept_callback(
        Class :: openapi_api:class(),
        OperationID :: openapi_api:operation_id(),
        Req :: cowboy_req:req(),
        Context :: openapi_logic_handler:context()) ->
    {openapi_logic_handler:accept_callback_return(),
     cowboy_req:req(),
     openapi_logic_handler:context()}.
accept_callback(Class, OperationID, Req0, Context0) ->
    ValidatorState = openapi_api:prepare_validator(),
    case openapi_api:populate_request(OperationID, Req0, ValidatorState) of
        {ok, Model, Req1} ->
            Context1 = maps:merge(Context0, Model),
            case do_accept_callback(Class, OperationID, Req1, Context1) of
                {false, Req2, Context2} ->
                    {false, Req2, Context2};
                {{true, Code, Body}, Req2, Context2} ->
                    case validate_response(OperationID, Code, Body, ValidatorState) of
                        ok ->
                            process_response({ok, Code, Body}, Req2, Context2);
                        {error, Reason} ->
                            process_response({error, Reason}, Req2, Context2)
                    end
            end;
        {error, Reason, Req1} ->
            process_response({error, Reason}, Req1, Context0)
    end.
```
""".

-export([prepare_validator/0, prepare_validator/1, prepare_validator/2]).
-export([populate_request/3, validate_response/4]).

-ignore_xref([populate_request/3, validate_response/4]).
-ignore_xref([prepare_validator/0, prepare_validator/1, prepare_validator/2]).

-type class() ::
    'berries'
    | 'contests'
    | 'encounters'
    | 'evolution'
    | 'games'
    | 'items'
    | 'location'
    | 'machines'
    | 'moves'
    | 'pokemon'
    | 'utility'.


-type operation_id() ::
    'berry_firmness_list' | %% List berry firmness
    'berry_firmness_retrieve' | %% Get berry by firmness
    'berry_flavor_list' | %% List berry flavors
    'berry_flavor_retrieve' | %% Get berries by flavor
    'berry_list' | %% List berries
    'berry_retrieve' | %% Get a berry
    'contest_effect_list' | %% List contest effects
    'contest_effect_retrieve' | %% Get contest effect
    'contest_type_list' | %% List contest types
    'contest_type_retrieve' | %% Get contest type
    'super_contest_effect_list' | %% List super contest effects
    'super_contest_effect_retrieve' | %% Get super contest effect
    'encounter_condition_list' | %% List encounter conditions
    'encounter_condition_retrieve' | %% Get encounter condition
    'encounter_condition_value_list' | %% List encounter condition values
    'encounter_condition_value_retrieve' | %% Get encounter condition value
    'encounter_method_list' | %% List encounter methods
    'encounter_method_retrieve' | %% Get encounter method
    'pokemon_encounters_retrieve' | %% Get pokemon encounter
    'evolution_chain_list' | %% List evolution chains
    'evolution_chain_retrieve' | %% Get evolution chain
    'evolution_trigger_list' | %% List evolution triggers
    'evolution_trigger_retrieve' | %% Get evolution trigger
    'generation_list' | %% List genrations
    'generation_retrieve' | %% Get genration
    'pokedex_list' | %% List pokedex
    'pokedex_retrieve' | %% Get pokedex
    'version_group_list' | %% List version groups
    'version_group_retrieve' | %% Get version group
    'version_list' | %% List versions
    'version_retrieve' | %% Get version
    'item_attribute_list' | %% List item attributes
    'item_attribute_retrieve' | %% Get item attribute
    'item_category_list' | %% List item categories
    'item_category_retrieve' | %% Get item category
    'item_fling_effect_list' | %% List item fling effects
    'item_fling_effect_retrieve' | %% Get item fling effect
    'item_list' | %% List items
    'item_pocket_list' | %% List item pockets
    'item_pocket_retrieve' | %% Get item pocket
    'item_retrieve' | %% Get item
    'location_area_list' | %% List location areas
    'location_area_retrieve' | %% Get location area
    'location_list' | %% List locations
    'location_retrieve' | %% Get location
    'pal_park_area_list' | %% List pal park areas
    'pal_park_area_retrieve' | %% Get pal park area
    'region_list' | %% List regions
    'region_retrieve' | %% Get region
    'machine_list' | %% List machines
    'machine_retrieve' | %% Get machine
    'move_ailment_list' | %% List move meta ailments
    'move_ailment_retrieve' | %% Get move meta ailment
    'move_battle_style_list' | %% List move battle styles
    'move_battle_style_retrieve' | %% Get move battle style
    'move_category_list' | %% List move meta categories
    'move_category_retrieve' | %% Get move meta category
    'move_learn_method_list' | %% List move learn methods
    'move_learn_method_retrieve' | %% Get move learn method
    'move_list' | %% List moves
    'move_retrieve' | %% Get move
    'move_target_list' | %% List move targets
    'move_target_retrieve' | %% Get move target
    'ability_list' | %% 
    'ability_retrieve' | %% 
    'characteristic_list' | %% List charecterictics
    'characteristic_retrieve' | %% Get characteristic
    'egg_group_list' | %% List egg groups
    'egg_group_retrieve' | %% Get egg group
    'gender_list' | %% List genders
    'gender_retrieve' | %% Get gender
    'growth_rate_list' | %% List growth rates
    'growth_rate_retrieve' | %% Get growth rate
    'move_damage_class_list' | %% List move damage classes
    'move_damage_class_retrieve' | %% Get move damage class
    'nature_list' | %% List natures
    'nature_retrieve' | %% Get nature
    'pokeathlon_stat_list' | %% List pokeathlon stats
    'pokeathlon_stat_retrieve' | %% Get pokeathlon stat
    'pokemon_color_list' | %% List pokemon colors
    'pokemon_color_retrieve' | %% Get pokemon color
    'pokemon_form_list' | %% List pokemon forms
    'pokemon_form_retrieve' | %% Get pokemon form
    'pokemon_habitat_list' | %% List pokemom habitas
    'pokemon_habitat_retrieve' | %% Get pokemom habita
    'pokemon_list' | %% List pokemon
    'pokemon_retrieve' | %% Get pokemon
    'pokemon_shape_list' | %% List pokemon shapes
    'pokemon_shape_retrieve' | %% Get pokemon shape
    'pokemon_species_list' | %% List pokemon species
    'pokemon_species_retrieve' | %% Get pokemon species
    'stat_list' | %% List stats
    'stat_retrieve' | %% Get stat
    'type_list' | %% List types
    'type_retrieve' | %% Get types
    'language_list' | %% List languages
    'language_retrieve' | %% Get language
    {error, unknown_operation}.

-type request_param() :: atom().

-export_type([class/0, operation_id/0]).

-dialyzer({nowarn_function, [validate_response_body/4]}).

-type rule() ::
    {type, binary} |
    {type, byte} |
    {type, integer} |
    {type, float} |
    {type, boolean} |
    {type, date} |
    {type, datetime} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    {schema, object | list, binary()} |
    schema |
    required |
    not_required.

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator() -> jesse_state:state().
prepare_validator() ->
    prepare_validator(<<"http://json-schema.org/draft-06/schema#">>).

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator(binary()) -> jesse_state:state().
prepare_validator(SchemaVer) ->
    prepare_validator(get_openapi_path(), SchemaVer).

-doc """
Loads the JSON schema and the desired validation draft into a `t:jesse_state:state/0`.
""".
-spec prepare_validator(file:name_all(), binary()) -> jesse_state:state().
prepare_validator(OpenApiPath, SchemaVer) ->
    {ok, FileContents} = file:read_file(OpenApiPath),
    R = json:decode(FileContents),
    jesse_state:new(R, [{default_schema_ver, SchemaVer}]).

-doc """
Automatically loads the entire body from the cowboy req
and validates the JSON body against the schema.
""".
-spec populate_request(
        OperationID :: operation_id(),
        Req :: cowboy_req:req(),
        ValidatorState :: jesse_state:state()) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.
populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

-doc """
Validates that the provided `Code` and `Body` comply with the `ValidatorState` schema
for the `OperationID` operation.
""".
-spec validate_response(
        OperationID :: operation_id(),
        Code :: 200..599,
        Body :: jesse:json_term(),
        ValidatorState :: jesse_state:state()) ->
    ok | {ok, term()} | [ok | {ok, term()}] | no_return().
validate_response('berry_firmness_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedBerryFirmnessSummaryList', 'PaginatedBerryFirmnessSummaryList', Body, ValidatorState);
validate_response('berry_firmness_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('BerryFirmnessDetail', 'BerryFirmnessDetail', Body, ValidatorState);
validate_response('berry_flavor_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedBerryFlavorSummaryList', 'PaginatedBerryFlavorSummaryList', Body, ValidatorState);
validate_response('berry_flavor_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('BerryFlavorDetail', 'BerryFlavorDetail', Body, ValidatorState);
validate_response('berry_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedBerrySummaryList', 'PaginatedBerrySummaryList', Body, ValidatorState);
validate_response('berry_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('BerryDetail', 'BerryDetail', Body, ValidatorState);
validate_response('contest_effect_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedContestEffectSummaryList', 'PaginatedContestEffectSummaryList', Body, ValidatorState);
validate_response('contest_effect_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('ContestEffectDetail', 'ContestEffectDetail', Body, ValidatorState);
validate_response('contest_type_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedContestTypeSummaryList', 'PaginatedContestTypeSummaryList', Body, ValidatorState);
validate_response('contest_type_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('ContestTypeDetail', 'ContestTypeDetail', Body, ValidatorState);
validate_response('super_contest_effect_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedSuperContestEffectSummaryList', 'PaginatedSuperContestEffectSummaryList', Body, ValidatorState);
validate_response('super_contest_effect_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('SuperContestEffectDetail', 'SuperContestEffectDetail', Body, ValidatorState);
validate_response('encounter_condition_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedEncounterConditionSummaryList', 'PaginatedEncounterConditionSummaryList', Body, ValidatorState);
validate_response('encounter_condition_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('EncounterConditionDetail', 'EncounterConditionDetail', Body, ValidatorState);
validate_response('encounter_condition_value_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedEncounterConditionValueSummaryList', 'PaginatedEncounterConditionValueSummaryList', Body, ValidatorState);
validate_response('encounter_condition_value_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('EncounterConditionValueDetail', 'EncounterConditionValueDetail', Body, ValidatorState);
validate_response('encounter_method_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedEncounterMethodSummaryList', 'PaginatedEncounterMethodSummaryList', Body, ValidatorState);
validate_response('encounter_method_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('EncounterMethodDetail', 'EncounterMethodDetail', Body, ValidatorState);
validate_response('pokemon_encounters_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('list', 'pokemon_encounters_retrieve_200_response_inner', Body, ValidatorState);
validate_response('evolution_chain_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedEvolutionChainSummaryList', 'PaginatedEvolutionChainSummaryList', Body, ValidatorState);
validate_response('evolution_chain_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('EvolutionChainDetail', 'EvolutionChainDetail', Body, ValidatorState);
validate_response('evolution_trigger_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedEvolutionTriggerSummaryList', 'PaginatedEvolutionTriggerSummaryList', Body, ValidatorState);
validate_response('evolution_trigger_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('EvolutionTriggerDetail', 'EvolutionTriggerDetail', Body, ValidatorState);
validate_response('generation_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedGenerationSummaryList', 'PaginatedGenerationSummaryList', Body, ValidatorState);
validate_response('generation_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('GenerationDetail', 'GenerationDetail', Body, ValidatorState);
validate_response('pokedex_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokedexSummaryList', 'PaginatedPokedexSummaryList', Body, ValidatorState);
validate_response('pokedex_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokedexDetail', 'PokedexDetail', Body, ValidatorState);
validate_response('version_group_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedVersionGroupSummaryList', 'PaginatedVersionGroupSummaryList', Body, ValidatorState);
validate_response('version_group_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('VersionGroupDetail', 'VersionGroupDetail', Body, ValidatorState);
validate_response('version_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedVersionSummaryList', 'PaginatedVersionSummaryList', Body, ValidatorState);
validate_response('version_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('VersionDetail', 'VersionDetail', Body, ValidatorState);
validate_response('item_attribute_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedItemAttributeSummaryList', 'PaginatedItemAttributeSummaryList', Body, ValidatorState);
validate_response('item_attribute_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('ItemAttributeDetail', 'ItemAttributeDetail', Body, ValidatorState);
validate_response('item_category_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedItemCategorySummaryList', 'PaginatedItemCategorySummaryList', Body, ValidatorState);
validate_response('item_category_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('ItemCategoryDetail', 'ItemCategoryDetail', Body, ValidatorState);
validate_response('item_fling_effect_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedItemFlingEffectSummaryList', 'PaginatedItemFlingEffectSummaryList', Body, ValidatorState);
validate_response('item_fling_effect_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('ItemFlingEffectDetail', 'ItemFlingEffectDetail', Body, ValidatorState);
validate_response('item_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedItemSummaryList', 'PaginatedItemSummaryList', Body, ValidatorState);
validate_response('item_pocket_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedItemPocketSummaryList', 'PaginatedItemPocketSummaryList', Body, ValidatorState);
validate_response('item_pocket_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('ItemPocketDetail', 'ItemPocketDetail', Body, ValidatorState);
validate_response('item_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('ItemDetail', 'ItemDetail', Body, ValidatorState);
validate_response('location_area_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedLocationAreaSummaryList', 'PaginatedLocationAreaSummaryList', Body, ValidatorState);
validate_response('location_area_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('LocationAreaDetail', 'LocationAreaDetail', Body, ValidatorState);
validate_response('location_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedLocationSummaryList', 'PaginatedLocationSummaryList', Body, ValidatorState);
validate_response('location_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('LocationDetail', 'LocationDetail', Body, ValidatorState);
validate_response('pal_park_area_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPalParkAreaSummaryList', 'PaginatedPalParkAreaSummaryList', Body, ValidatorState);
validate_response('pal_park_area_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PalParkAreaDetail', 'PalParkAreaDetail', Body, ValidatorState);
validate_response('region_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedRegionSummaryList', 'PaginatedRegionSummaryList', Body, ValidatorState);
validate_response('region_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('RegionDetail', 'RegionDetail', Body, ValidatorState);
validate_response('machine_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMachineSummaryList', 'PaginatedMachineSummaryList', Body, ValidatorState);
validate_response('machine_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MachineDetail', 'MachineDetail', Body, ValidatorState);
validate_response('move_ailment_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMoveMetaAilmentSummaryList', 'PaginatedMoveMetaAilmentSummaryList', Body, ValidatorState);
validate_response('move_ailment_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MoveMetaAilmentDetail', 'MoveMetaAilmentDetail', Body, ValidatorState);
validate_response('move_battle_style_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMoveBattleStyleSummaryList', 'PaginatedMoveBattleStyleSummaryList', Body, ValidatorState);
validate_response('move_battle_style_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MoveBattleStyleDetail', 'MoveBattleStyleDetail', Body, ValidatorState);
validate_response('move_category_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMoveMetaCategorySummaryList', 'PaginatedMoveMetaCategorySummaryList', Body, ValidatorState);
validate_response('move_category_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MoveMetaCategoryDetail', 'MoveMetaCategoryDetail', Body, ValidatorState);
validate_response('move_learn_method_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMoveLearnMethodSummaryList', 'PaginatedMoveLearnMethodSummaryList', Body, ValidatorState);
validate_response('move_learn_method_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MoveLearnMethodDetail', 'MoveLearnMethodDetail', Body, ValidatorState);
validate_response('move_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMoveSummaryList', 'PaginatedMoveSummaryList', Body, ValidatorState);
validate_response('move_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MoveDetail', 'MoveDetail', Body, ValidatorState);
validate_response('move_target_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMoveTargetSummaryList', 'PaginatedMoveTargetSummaryList', Body, ValidatorState);
validate_response('move_target_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MoveTargetDetail', 'MoveTargetDetail', Body, ValidatorState);
validate_response('ability_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedAbilitySummaryList', 'PaginatedAbilitySummaryList', Body, ValidatorState);
validate_response('ability_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('AbilityDetail', 'AbilityDetail', Body, ValidatorState);
validate_response('characteristic_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedCharacteristicSummaryList', 'PaginatedCharacteristicSummaryList', Body, ValidatorState);
validate_response('characteristic_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('CharacteristicDetail', 'CharacteristicDetail', Body, ValidatorState);
validate_response('egg_group_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedEggGroupSummaryList', 'PaginatedEggGroupSummaryList', Body, ValidatorState);
validate_response('egg_group_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('EggGroupDetail', 'EggGroupDetail', Body, ValidatorState);
validate_response('gender_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedGenderSummaryList', 'PaginatedGenderSummaryList', Body, ValidatorState);
validate_response('gender_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('GenderDetail', 'GenderDetail', Body, ValidatorState);
validate_response('growth_rate_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedGrowthRateSummaryList', 'PaginatedGrowthRateSummaryList', Body, ValidatorState);
validate_response('growth_rate_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('GrowthRateDetail', 'GrowthRateDetail', Body, ValidatorState);
validate_response('move_damage_class_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedMoveDamageClassSummaryList', 'PaginatedMoveDamageClassSummaryList', Body, ValidatorState);
validate_response('move_damage_class_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('MoveDamageClassDetail', 'MoveDamageClassDetail', Body, ValidatorState);
validate_response('nature_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedNatureSummaryList', 'PaginatedNatureSummaryList', Body, ValidatorState);
validate_response('nature_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('NatureDetail', 'NatureDetail', Body, ValidatorState);
validate_response('pokeathlon_stat_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokeathlonStatSummaryList', 'PaginatedPokeathlonStatSummaryList', Body, ValidatorState);
validate_response('pokeathlon_stat_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokeathlonStatDetail', 'PokeathlonStatDetail', Body, ValidatorState);
validate_response('pokemon_color_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokemonColorSummaryList', 'PaginatedPokemonColorSummaryList', Body, ValidatorState);
validate_response('pokemon_color_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokemonColorDetail', 'PokemonColorDetail', Body, ValidatorState);
validate_response('pokemon_form_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokemonFormSummaryList', 'PaginatedPokemonFormSummaryList', Body, ValidatorState);
validate_response('pokemon_form_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokemonFormDetail', 'PokemonFormDetail', Body, ValidatorState);
validate_response('pokemon_habitat_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokemonHabitatSummaryList', 'PaginatedPokemonHabitatSummaryList', Body, ValidatorState);
validate_response('pokemon_habitat_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokemonHabitatDetail', 'PokemonHabitatDetail', Body, ValidatorState);
validate_response('pokemon_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokemonSummaryList', 'PaginatedPokemonSummaryList', Body, ValidatorState);
validate_response('pokemon_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokemonDetail', 'PokemonDetail', Body, ValidatorState);
validate_response('pokemon_shape_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokemonShapeSummaryList', 'PaginatedPokemonShapeSummaryList', Body, ValidatorState);
validate_response('pokemon_shape_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokemonShapeDetail', 'PokemonShapeDetail', Body, ValidatorState);
validate_response('pokemon_species_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedPokemonSpeciesSummaryList', 'PaginatedPokemonSpeciesSummaryList', Body, ValidatorState);
validate_response('pokemon_species_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('PokemonSpeciesDetail', 'PokemonSpeciesDetail', Body, ValidatorState);
validate_response('stat_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedStatSummaryList', 'PaginatedStatSummaryList', Body, ValidatorState);
validate_response('stat_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('StatDetail', 'StatDetail', Body, ValidatorState);
validate_response('type_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedTypeSummaryList', 'PaginatedTypeSummaryList', Body, ValidatorState);
validate_response('type_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('TypeDetail', 'TypeDetail', Body, ValidatorState);
validate_response('language_list', 200, Body, ValidatorState) ->
    validate_response_body('PaginatedLanguageSummaryList', 'PaginatedLanguageSummaryList', Body, ValidatorState);
validate_response('language_retrieve', 200, Body, ValidatorState) ->
    validate_response_body('LanguageDetail', 'LanguageDetail', Body, ValidatorState);
validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

%%%
-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].
request_params('berry_firmness_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('berry_firmness_retrieve') ->
    [
        'id'
    ];
request_params('berry_flavor_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('berry_flavor_retrieve') ->
    [
        'id'
    ];
request_params('berry_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('berry_retrieve') ->
    [
        'id'
    ];
request_params('contest_effect_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('contest_effect_retrieve') ->
    [
        'id'
    ];
request_params('contest_type_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('contest_type_retrieve') ->
    [
        'id'
    ];
request_params('super_contest_effect_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('super_contest_effect_retrieve') ->
    [
        'id'
    ];
request_params('encounter_condition_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('encounter_condition_retrieve') ->
    [
        'id'
    ];
request_params('encounter_condition_value_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('encounter_condition_value_retrieve') ->
    [
        'id'
    ];
request_params('encounter_method_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('encounter_method_retrieve') ->
    [
        'id'
    ];
request_params('pokemon_encounters_retrieve') ->
    [
        'pokemon_id'
    ];
request_params('evolution_chain_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('evolution_chain_retrieve') ->
    [
        'id'
    ];
request_params('evolution_trigger_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('evolution_trigger_retrieve') ->
    [
        'id'
    ];
request_params('generation_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('generation_retrieve') ->
    [
        'id'
    ];
request_params('pokedex_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokedex_retrieve') ->
    [
        'id'
    ];
request_params('version_group_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('version_group_retrieve') ->
    [
        'id'
    ];
request_params('version_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('version_retrieve') ->
    [
        'id'
    ];
request_params('item_attribute_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('item_attribute_retrieve') ->
    [
        'id'
    ];
request_params('item_category_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('item_category_retrieve') ->
    [
        'id'
    ];
request_params('item_fling_effect_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('item_fling_effect_retrieve') ->
    [
        'id'
    ];
request_params('item_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('item_pocket_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('item_pocket_retrieve') ->
    [
        'id'
    ];
request_params('item_retrieve') ->
    [
        'id'
    ];
request_params('location_area_list') ->
    [
        'limit',
        'offset'
    ];
request_params('location_area_retrieve') ->
    [
        'id'
    ];
request_params('location_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('location_retrieve') ->
    [
        'id'
    ];
request_params('pal_park_area_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pal_park_area_retrieve') ->
    [
        'id'
    ];
request_params('region_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('region_retrieve') ->
    [
        'id'
    ];
request_params('machine_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('machine_retrieve') ->
    [
        'id'
    ];
request_params('move_ailment_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('move_ailment_retrieve') ->
    [
        'id'
    ];
request_params('move_battle_style_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('move_battle_style_retrieve') ->
    [
        'id'
    ];
request_params('move_category_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('move_category_retrieve') ->
    [
        'id'
    ];
request_params('move_learn_method_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('move_learn_method_retrieve') ->
    [
        'id'
    ];
request_params('move_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('move_retrieve') ->
    [
        'id'
    ];
request_params('move_target_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('move_target_retrieve') ->
    [
        'id'
    ];
request_params('ability_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('ability_retrieve') ->
    [
        'id'
    ];
request_params('characteristic_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('characteristic_retrieve') ->
    [
        'id'
    ];
request_params('egg_group_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('egg_group_retrieve') ->
    [
        'id'
    ];
request_params('gender_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('gender_retrieve') ->
    [
        'id'
    ];
request_params('growth_rate_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('growth_rate_retrieve') ->
    [
        'id'
    ];
request_params('move_damage_class_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('move_damage_class_retrieve') ->
    [
        'id'
    ];
request_params('nature_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('nature_retrieve') ->
    [
        'id'
    ];
request_params('pokeathlon_stat_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokeathlon_stat_retrieve') ->
    [
        'id'
    ];
request_params('pokemon_color_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokemon_color_retrieve') ->
    [
        'id'
    ];
request_params('pokemon_form_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokemon_form_retrieve') ->
    [
        'id'
    ];
request_params('pokemon_habitat_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokemon_habitat_retrieve') ->
    [
        'id'
    ];
request_params('pokemon_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokemon_retrieve') ->
    [
        'id'
    ];
request_params('pokemon_shape_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokemon_shape_retrieve') ->
    [
        'id'
    ];
request_params('pokemon_species_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('pokemon_species_retrieve') ->
    [
        'id'
    ];
request_params('stat_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('stat_retrieve') ->
    [
        'id'
    ];
request_params('type_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('type_retrieve') ->
    [
        'id'
    ];
request_params('language_list') ->
    [
        'limit',
        'offset',
        'q'
    ];
request_params('language_retrieve') ->
    [
        'id'
    ];
request_params(_) ->
    error(unknown_operation).

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) ->
    #{source => qs_val | binding | header | body, rules => [rule()]}.
request_param_info('berry_firmness_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('berry_firmness_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('berry_firmness_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('berry_firmness_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('berry_flavor_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('berry_flavor_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('berry_flavor_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('berry_flavor_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('berry_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('berry_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('berry_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('berry_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('contest_effect_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('contest_effect_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('contest_effect_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('contest_effect_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('contest_type_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('contest_type_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('contest_type_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('contest_type_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('super_contest_effect_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('super_contest_effect_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('super_contest_effect_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('super_contest_effect_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('encounter_condition_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('encounter_condition_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('encounter_condition_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('encounter_condition_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('encounter_condition_value_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('encounter_condition_value_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('encounter_condition_value_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('encounter_condition_value_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('encounter_method_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('encounter_method_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('encounter_method_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('encounter_method_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokemon_encounters_retrieve', 'pokemon_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            {pattern, "^\\d+$"},
            required
        ]
    };
request_param_info('evolution_chain_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('evolution_chain_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('evolution_chain_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('evolution_chain_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('evolution_trigger_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('evolution_trigger_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('evolution_trigger_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('evolution_trigger_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('generation_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('generation_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('generation_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('generation_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokedex_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokedex_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokedex_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokedex_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('version_group_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('version_group_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('version_group_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('version_group_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('version_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('version_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('version_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('version_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('item_attribute_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_attribute_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_attribute_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('item_attribute_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('item_category_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_category_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_category_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('item_category_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('item_fling_effect_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_fling_effect_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_fling_effect_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('item_fling_effect_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('item_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('item_pocket_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_pocket_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('item_pocket_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('item_pocket_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('item_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('location_area_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('location_area_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('location_area_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('location_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('location_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('location_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('location_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pal_park_area_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pal_park_area_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pal_park_area_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pal_park_area_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('region_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('region_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('region_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('region_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('machine_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('machine_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('machine_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('machine_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('move_ailment_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_ailment_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_ailment_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('move_ailment_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('move_battle_style_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_battle_style_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_battle_style_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('move_battle_style_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('move_category_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_category_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_category_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('move_category_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('move_learn_method_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_learn_method_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_learn_method_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('move_learn_method_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('move_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('move_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('move_target_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_target_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_target_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('move_target_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('ability_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('ability_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('ability_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('ability_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('characteristic_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('characteristic_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('characteristic_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('characteristic_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('egg_group_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('egg_group_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('egg_group_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('egg_group_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('gender_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('gender_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('gender_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('gender_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('growth_rate_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('growth_rate_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('growth_rate_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('growth_rate_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('move_damage_class_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_damage_class_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('move_damage_class_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('move_damage_class_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('nature_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('nature_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('nature_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('nature_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokeathlon_stat_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokeathlon_stat_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokeathlon_stat_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokeathlon_stat_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokemon_color_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_color_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_color_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokemon_color_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokemon_form_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_form_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_form_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokemon_form_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokemon_habitat_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_habitat_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_habitat_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokemon_habitat_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokemon_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokemon_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokemon_shape_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_shape_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_shape_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokemon_shape_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('pokemon_species_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_species_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('pokemon_species_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('pokemon_species_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('stat_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('stat_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('stat_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('stat_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('type_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('type_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('type_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('type_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('language_list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('language_list', 'offset') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('language_list', 'q') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('language_retrieve', 'id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request_params(
        operation_id(), [request_param()], cowboy_req:req(), jesse_state:state(), map()) ->
    {ok, map(), cowboy_req:req()} | {error, _, cowboy_req:req()}.
populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};
populate_request_params(OperationID, [ReqParamName | T], Req0, ValidatorState, Model0) ->
    case populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) of
        {ok, V, Req} ->
            Model = Model0#{ReqParamName => V},
            populate_request_params(OperationID, T, Req, ValidatorState, Model);
        Error ->
            Error
    end.

-spec populate_request_param(
        operation_id(), request_param(), cowboy_req:req(), jesse_state:state()) ->
    {ok, term(), cowboy_req:req()} | {error, term(), cowboy_req:req()}.
populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, ReqParamName),
    case get_value(Source, ReqParamName, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, ReqParamName, Value, ValidatorState) of
                {ok, Result} -> {ok, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

validate_response_body(list, ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, Item, ReturnBaseType, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, Body, ReturnBaseType, ValidatorState).

-spec validate(rule(), term(), request_param(), jesse_state:state()) ->
    ok | {ok, term()}.
validate(required, undefined, ReqParamName, _) ->
    validation_error(required, ReqParamName, undefined);
validate(required, _Value, _, _) ->
    ok;
validate(not_required, _Value, _, _) ->
    ok;
validate(_, undefined, _, _) ->
    ok;
validate({type, boolean}, Value, _, _) when is_boolean(Value) ->
    ok;
validate({type, integer}, Value, _, _) when is_integer(Value) ->
    ok;
validate({type, float}, Value, _, _) when is_float(Value) ->
    ok;
validate({type, binary}, Value, _, _) when is_binary(Value) ->
    ok;
validate({max, Max}, Value, _, _) when Value =< Max ->
    ok;
validate({min, Min}, Value, _, _) when Min =< Value ->
    ok;
validate({exclusive_max, Max}, Value, _, _) when Value < Max ->
    ok;
validate({exclusive_min, Min}, Value, _, _) when Min < Value ->
    ok;
validate({max_length, MaxLength}, Value, _, _) when is_binary(Value), byte_size(Value) =< MaxLength ->
    ok;
validate({min_length, MinLength}, Value, _, _) when is_binary(Value), MinLength =< byte_size(Value) ->
    ok;
validate(Rule = {type, byte}, Value, ReqParamName, _) when is_binary(Value) ->
    try base64:decode(Value) of
        Decoded -> {ok, Decoded}
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, boolean}, Value, ReqParamName, _) when is_binary(Value) ->
    case to_binary(string:lowercase(Value)) of
        <<"true">> -> {ok, true};
        <<"false">> -> {ok, false};
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, integer}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_integer(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, float}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, date}, Value, ReqParamName, _) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, datetime}, Value, ReqParamName, _) ->
    try calendar:rfc3339_to_system_time(binary_to_list(Value)) of
        _ -> ok
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {enum, Values}, Value, ReqParamName, _) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, ReqParamName, Value)
        end
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {pattern, Pattern}, Value, ReqParamName, _) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(schema, Value, ReqParamName, ValidatorState) ->
    Definition = iolist_to_binary(["#/components/schemas/", atom_to_binary(ReqParamName, utf8)]),
    validate({schema, object, Definition}, Value, ReqParamName, ValidatorState);
validate({schema, list, Definition}, Value, ReqParamName, ValidatorState) ->
    lists:foreach(
      fun(Item) ->
              validate({schema, object, Definition}, Item, ReqParamName, ValidatorState)
      end, Value);
validate(Rule = {schema, object, Definition}, Value, ReqParamName, ValidatorState) ->
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, ReqParamName, Value, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, ReqParamName, Value, Info)
    end;
validate(Rule, Value, ReqParamName, _) ->
    validation_error(Rule, ReqParamName, Value).

-spec validation_error(rule(), request_param(), term()) -> no_return().
validation_error(ViolatedRule, Name, Value) ->
    validation_error(ViolatedRule, Name, Value, #{}).

-spec validation_error(rule(), request_param(), term(), Info :: #{_ := _}) -> no_return().
validation_error(ViolatedRule, Name, Value, Info) ->
    throw({wrong_param, Name, Value, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, request_param(), cowboy_req:req()) ->
    {any(), cowboy_req:req()} |
    {error, any(), cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = read_entire_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;
get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = get_opt(to_qs(Name), QS),
    {Value, Req};
get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value = maps:get(to_header(Name), Headers, undefined),
    {Value, Req};
get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(Name, Req),
    {Value, Req}.

-spec read_entire_body(cowboy_req:req()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Req) ->
    read_entire_body(Req, []).

-spec read_entire_body(cowboy_req:req(), iodata()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Request, Acc) -> % {
    case cowboy_req:read_body(Request) of
        {ok, Data, NewRequest} ->
            {ok, iolist_to_binary(lists:reverse([Data | Acc])), NewRequest};
        {more, Data, NewRequest} ->
            read_entire_body(NewRequest, [Data | Acc])
    end.

prepare_body(<<>>) ->
    <<>>;
prepare_body(Body) ->
    try
        json:decode(Body)
    catch
        error:Error ->
            {error, {invalid_json, Body, Error}}
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

-spec prepare_param([rule()], request_param(), term(), jesse_state:state()) ->
    {ok, term()} | {error, Reason :: any()}.
prepare_param(Rules, ReqParamName, Value, ValidatorState) ->
    Fun = fun(Rule, Acc) ->
        case validate(Rule, Acc, ReqParamName, ValidatorState) of
            ok -> Acc;
            {ok, Prepared} -> Prepared
        end
    end,
    try
        Result = lists:foldl(Fun, Value, Rules),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

-spec to_binary(iodata()) -> binary().
to_binary(V) when is_binary(V)  -> V;
to_binary(V) when is_list(V)    -> iolist_to_binary(V).

-spec to_header(request_param()) -> binary().
to_header(Name) ->
    to_binary(string:lowercase(atom_to_binary(Name, utf8))).

-spec to_qs(request_param()) -> binary().
to_qs(Name) ->
    atom_to_binary(Name, utf8).

-spec get_opt(any(), []) -> any().
get_opt(Key, Opts) ->
    get_opt(Key, Opts, undefined).

-spec get_opt(any(), [], any()) -> any().
get_opt(Key, Opts, Default) ->
    case lists:keyfind(Key, 1, Opts) of
        {_, Value} -> Value;
        false -> Default
    end.

get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(priv_dir(AppName), "openapi.json").

-include_lib("kernel/include/file.hrl").

-spec priv_dir(Application :: atom()) -> file:name_all().
priv_dir(AppName) ->
    case code:priv_dir(AppName) of
        Value when is_list(Value) ->
            Value ++ "/";
        _Error ->
            select_priv_dir([filename:join(["apps", atom_to_list(AppName), "priv"]), "priv"])
     end.

select_priv_dir(Paths) ->
    case lists:dropwhile(fun test_priv_dir/1, Paths) of
        [Path | _] -> Path;
        _          -> exit(no_priv_dir)
    end.

test_priv_dir(Path) ->
    case file:read_file_info(Path) of
        {ok, #file_info{type = directory}} ->
            false;
        _ ->
            true
    end.
