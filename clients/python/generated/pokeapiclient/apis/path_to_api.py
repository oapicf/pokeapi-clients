import typing_extensions

from pokeapiclient.paths import PathValues
from pokeapiclient.apis.paths.api_v2_ability_ import ApiV2Ability
from pokeapiclient.apis.paths.api_v2_ability_id_ import ApiV2AbilityId
from pokeapiclient.apis.paths.api_v2_berry_firmness_ import ApiV2BerryFirmness
from pokeapiclient.apis.paths.api_v2_berry_firmness_id_ import ApiV2BerryFirmnessId
from pokeapiclient.apis.paths.api_v2_berry_flavor_ import ApiV2BerryFlavor
from pokeapiclient.apis.paths.api_v2_berry_flavor_id_ import ApiV2BerryFlavorId
from pokeapiclient.apis.paths.api_v2_berry_ import ApiV2Berry
from pokeapiclient.apis.paths.api_v2_berry_id_ import ApiV2BerryId
from pokeapiclient.apis.paths.api_v2_characteristic_ import ApiV2Characteristic
from pokeapiclient.apis.paths.api_v2_characteristic_id_ import ApiV2CharacteristicId
from pokeapiclient.apis.paths.api_v2_contest_effect_ import ApiV2ContestEffect
from pokeapiclient.apis.paths.api_v2_contest_effect_id_ import ApiV2ContestEffectId
from pokeapiclient.apis.paths.api_v2_contest_type_ import ApiV2ContestType
from pokeapiclient.apis.paths.api_v2_contest_type_id_ import ApiV2ContestTypeId
from pokeapiclient.apis.paths.api_v2_egg_group_ import ApiV2EggGroup
from pokeapiclient.apis.paths.api_v2_egg_group_id_ import ApiV2EggGroupId
from pokeapiclient.apis.paths.api_v2_encounter_condition_value_ import ApiV2EncounterConditionValue
from pokeapiclient.apis.paths.api_v2_encounter_condition_value_id_ import ApiV2EncounterConditionValueId
from pokeapiclient.apis.paths.api_v2_encounter_condition_ import ApiV2EncounterCondition
from pokeapiclient.apis.paths.api_v2_encounter_condition_id_ import ApiV2EncounterConditionId
from pokeapiclient.apis.paths.api_v2_encounter_method_ import ApiV2EncounterMethod
from pokeapiclient.apis.paths.api_v2_encounter_method_id_ import ApiV2EncounterMethodId
from pokeapiclient.apis.paths.api_v2_evolution_chain_ import ApiV2EvolutionChain
from pokeapiclient.apis.paths.api_v2_evolution_chain_id_ import ApiV2EvolutionChainId
from pokeapiclient.apis.paths.api_v2_evolution_trigger_ import ApiV2EvolutionTrigger
from pokeapiclient.apis.paths.api_v2_evolution_trigger_id_ import ApiV2EvolutionTriggerId
from pokeapiclient.apis.paths.api_v2_gender_ import ApiV2Gender
from pokeapiclient.apis.paths.api_v2_gender_id_ import ApiV2GenderId
from pokeapiclient.apis.paths.api_v2_generation_ import ApiV2Generation
from pokeapiclient.apis.paths.api_v2_generation_id_ import ApiV2GenerationId
from pokeapiclient.apis.paths.api_v2_growth_rate_ import ApiV2GrowthRate
from pokeapiclient.apis.paths.api_v2_growth_rate_id_ import ApiV2GrowthRateId
from pokeapiclient.apis.paths.api_v2_item_attribute_ import ApiV2ItemAttribute
from pokeapiclient.apis.paths.api_v2_item_attribute_id_ import ApiV2ItemAttributeId
from pokeapiclient.apis.paths.api_v2_item_category_ import ApiV2ItemCategory
from pokeapiclient.apis.paths.api_v2_item_category_id_ import ApiV2ItemCategoryId
from pokeapiclient.apis.paths.api_v2_item_fling_effect_ import ApiV2ItemFlingEffect
from pokeapiclient.apis.paths.api_v2_item_fling_effect_id_ import ApiV2ItemFlingEffectId
from pokeapiclient.apis.paths.api_v2_item_pocket_ import ApiV2ItemPocket
from pokeapiclient.apis.paths.api_v2_item_pocket_id_ import ApiV2ItemPocketId
from pokeapiclient.apis.paths.api_v2_item_ import ApiV2Item
from pokeapiclient.apis.paths.api_v2_item_id_ import ApiV2ItemId
from pokeapiclient.apis.paths.api_v2_language_ import ApiV2Language
from pokeapiclient.apis.paths.api_v2_language_id_ import ApiV2LanguageId
from pokeapiclient.apis.paths.api_v2_location_area_ import ApiV2LocationArea
from pokeapiclient.apis.paths.api_v2_location_area_id_ import ApiV2LocationAreaId
from pokeapiclient.apis.paths.api_v2_location_ import ApiV2Location
from pokeapiclient.apis.paths.api_v2_location_id_ import ApiV2LocationId
from pokeapiclient.apis.paths.api_v2_machine_ import ApiV2Machine
from pokeapiclient.apis.paths.api_v2_machine_id_ import ApiV2MachineId
from pokeapiclient.apis.paths.api_v2_move_ailment_ import ApiV2MoveAilment
from pokeapiclient.apis.paths.api_v2_move_ailment_id_ import ApiV2MoveAilmentId
from pokeapiclient.apis.paths.api_v2_move_battle_style_ import ApiV2MoveBattleStyle
from pokeapiclient.apis.paths.api_v2_move_battle_style_id_ import ApiV2MoveBattleStyleId
from pokeapiclient.apis.paths.api_v2_move_category_ import ApiV2MoveCategory
from pokeapiclient.apis.paths.api_v2_move_category_id_ import ApiV2MoveCategoryId
from pokeapiclient.apis.paths.api_v2_move_damage_class_ import ApiV2MoveDamageClass
from pokeapiclient.apis.paths.api_v2_move_damage_class_id_ import ApiV2MoveDamageClassId
from pokeapiclient.apis.paths.api_v2_move_learn_method_ import ApiV2MoveLearnMethod
from pokeapiclient.apis.paths.api_v2_move_learn_method_id_ import ApiV2MoveLearnMethodId
from pokeapiclient.apis.paths.api_v2_move_target_ import ApiV2MoveTarget
from pokeapiclient.apis.paths.api_v2_move_target_id_ import ApiV2MoveTargetId
from pokeapiclient.apis.paths.api_v2_move_ import ApiV2Move
from pokeapiclient.apis.paths.api_v2_move_id_ import ApiV2MoveId
from pokeapiclient.apis.paths.api_v2_nature_ import ApiV2Nature
from pokeapiclient.apis.paths.api_v2_nature_id_ import ApiV2NatureId
from pokeapiclient.apis.paths.api_v2_pal_park_area_ import ApiV2PalParkArea
from pokeapiclient.apis.paths.api_v2_pal_park_area_id_ import ApiV2PalParkAreaId
from pokeapiclient.apis.paths.api_v2_pokeathlon_stat_ import ApiV2PokeathlonStat
from pokeapiclient.apis.paths.api_v2_pokeathlon_stat_id_ import ApiV2PokeathlonStatId
from pokeapiclient.apis.paths.api_v2_pokedex_ import ApiV2Pokedex
from pokeapiclient.apis.paths.api_v2_pokedex_id_ import ApiV2PokedexId
from pokeapiclient.apis.paths.api_v2_pokemon_color_ import ApiV2PokemonColor
from pokeapiclient.apis.paths.api_v2_pokemon_color_id_ import ApiV2PokemonColorId
from pokeapiclient.apis.paths.api_v2_pokemon_form_ import ApiV2PokemonForm
from pokeapiclient.apis.paths.api_v2_pokemon_form_id_ import ApiV2PokemonFormId
from pokeapiclient.apis.paths.api_v2_pokemon_habitat_ import ApiV2PokemonHabitat
from pokeapiclient.apis.paths.api_v2_pokemon_habitat_id_ import ApiV2PokemonHabitatId
from pokeapiclient.apis.paths.api_v2_pokemon_shape_ import ApiV2PokemonShape
from pokeapiclient.apis.paths.api_v2_pokemon_shape_id_ import ApiV2PokemonShapeId
from pokeapiclient.apis.paths.api_v2_pokemon_species_ import ApiV2PokemonSpecies
from pokeapiclient.apis.paths.api_v2_pokemon_species_id_ import ApiV2PokemonSpeciesId
from pokeapiclient.apis.paths.api_v2_pokemon_ import ApiV2Pokemon
from pokeapiclient.apis.paths.api_v2_pokemon_id_ import ApiV2PokemonId
from pokeapiclient.apis.paths.api_v2_region_ import ApiV2Region
from pokeapiclient.apis.paths.api_v2_region_id_ import ApiV2RegionId
from pokeapiclient.apis.paths.api_v2_stat_ import ApiV2Stat
from pokeapiclient.apis.paths.api_v2_stat_id_ import ApiV2StatId
from pokeapiclient.apis.paths.api_v2_super_contest_effect_ import ApiV2SuperContestEffect
from pokeapiclient.apis.paths.api_v2_super_contest_effect_id_ import ApiV2SuperContestEffectId
from pokeapiclient.apis.paths.api_v2_type_ import ApiV2Type
from pokeapiclient.apis.paths.api_v2_type_id_ import ApiV2TypeId
from pokeapiclient.apis.paths.api_v2_version_group_ import ApiV2VersionGroup
from pokeapiclient.apis.paths.api_v2_version_group_id_ import ApiV2VersionGroupId
from pokeapiclient.apis.paths.api_v2_version_ import ApiV2Version
from pokeapiclient.apis.paths.api_v2_version_id_ import ApiV2VersionId

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.API_V2_ABILITY_: ApiV2Ability,
        PathValues.API_V2_ABILITY_ID_: ApiV2AbilityId,
        PathValues.API_V2_BERRYFIRMNESS_: ApiV2BerryFirmness,
        PathValues.API_V2_BERRYFIRMNESS_ID_: ApiV2BerryFirmnessId,
        PathValues.API_V2_BERRYFLAVOR_: ApiV2BerryFlavor,
        PathValues.API_V2_BERRYFLAVOR_ID_: ApiV2BerryFlavorId,
        PathValues.API_V2_BERRY_: ApiV2Berry,
        PathValues.API_V2_BERRY_ID_: ApiV2BerryId,
        PathValues.API_V2_CHARACTERISTIC_: ApiV2Characteristic,
        PathValues.API_V2_CHARACTERISTIC_ID_: ApiV2CharacteristicId,
        PathValues.API_V2_CONTESTEFFECT_: ApiV2ContestEffect,
        PathValues.API_V2_CONTESTEFFECT_ID_: ApiV2ContestEffectId,
        PathValues.API_V2_CONTESTTYPE_: ApiV2ContestType,
        PathValues.API_V2_CONTESTTYPE_ID_: ApiV2ContestTypeId,
        PathValues.API_V2_EGGGROUP_: ApiV2EggGroup,
        PathValues.API_V2_EGGGROUP_ID_: ApiV2EggGroupId,
        PathValues.API_V2_ENCOUNTERCONDITIONVALUE_: ApiV2EncounterConditionValue,
        PathValues.API_V2_ENCOUNTERCONDITIONVALUE_ID_: ApiV2EncounterConditionValueId,
        PathValues.API_V2_ENCOUNTERCONDITION_: ApiV2EncounterCondition,
        PathValues.API_V2_ENCOUNTERCONDITION_ID_: ApiV2EncounterConditionId,
        PathValues.API_V2_ENCOUNTERMETHOD_: ApiV2EncounterMethod,
        PathValues.API_V2_ENCOUNTERMETHOD_ID_: ApiV2EncounterMethodId,
        PathValues.API_V2_EVOLUTIONCHAIN_: ApiV2EvolutionChain,
        PathValues.API_V2_EVOLUTIONCHAIN_ID_: ApiV2EvolutionChainId,
        PathValues.API_V2_EVOLUTIONTRIGGER_: ApiV2EvolutionTrigger,
        PathValues.API_V2_EVOLUTIONTRIGGER_ID_: ApiV2EvolutionTriggerId,
        PathValues.API_V2_GENDER_: ApiV2Gender,
        PathValues.API_V2_GENDER_ID_: ApiV2GenderId,
        PathValues.API_V2_GENERATION_: ApiV2Generation,
        PathValues.API_V2_GENERATION_ID_: ApiV2GenerationId,
        PathValues.API_V2_GROWTHRATE_: ApiV2GrowthRate,
        PathValues.API_V2_GROWTHRATE_ID_: ApiV2GrowthRateId,
        PathValues.API_V2_ITEMATTRIBUTE_: ApiV2ItemAttribute,
        PathValues.API_V2_ITEMATTRIBUTE_ID_: ApiV2ItemAttributeId,
        PathValues.API_V2_ITEMCATEGORY_: ApiV2ItemCategory,
        PathValues.API_V2_ITEMCATEGORY_ID_: ApiV2ItemCategoryId,
        PathValues.API_V2_ITEMFLINGEFFECT_: ApiV2ItemFlingEffect,
        PathValues.API_V2_ITEMFLINGEFFECT_ID_: ApiV2ItemFlingEffectId,
        PathValues.API_V2_ITEMPOCKET_: ApiV2ItemPocket,
        PathValues.API_V2_ITEMPOCKET_ID_: ApiV2ItemPocketId,
        PathValues.API_V2_ITEM_: ApiV2Item,
        PathValues.API_V2_ITEM_ID_: ApiV2ItemId,
        PathValues.API_V2_LANGUAGE_: ApiV2Language,
        PathValues.API_V2_LANGUAGE_ID_: ApiV2LanguageId,
        PathValues.API_V2_LOCATIONAREA_: ApiV2LocationArea,
        PathValues.API_V2_LOCATIONAREA_ID_: ApiV2LocationAreaId,
        PathValues.API_V2_LOCATION_: ApiV2Location,
        PathValues.API_V2_LOCATION_ID_: ApiV2LocationId,
        PathValues.API_V2_MACHINE_: ApiV2Machine,
        PathValues.API_V2_MACHINE_ID_: ApiV2MachineId,
        PathValues.API_V2_MOVEAILMENT_: ApiV2MoveAilment,
        PathValues.API_V2_MOVEAILMENT_ID_: ApiV2MoveAilmentId,
        PathValues.API_V2_MOVEBATTLESTYLE_: ApiV2MoveBattleStyle,
        PathValues.API_V2_MOVEBATTLESTYLE_ID_: ApiV2MoveBattleStyleId,
        PathValues.API_V2_MOVECATEGORY_: ApiV2MoveCategory,
        PathValues.API_V2_MOVECATEGORY_ID_: ApiV2MoveCategoryId,
        PathValues.API_V2_MOVEDAMAGECLASS_: ApiV2MoveDamageClass,
        PathValues.API_V2_MOVEDAMAGECLASS_ID_: ApiV2MoveDamageClassId,
        PathValues.API_V2_MOVELEARNMETHOD_: ApiV2MoveLearnMethod,
        PathValues.API_V2_MOVELEARNMETHOD_ID_: ApiV2MoveLearnMethodId,
        PathValues.API_V2_MOVETARGET_: ApiV2MoveTarget,
        PathValues.API_V2_MOVETARGET_ID_: ApiV2MoveTargetId,
        PathValues.API_V2_MOVE_: ApiV2Move,
        PathValues.API_V2_MOVE_ID_: ApiV2MoveId,
        PathValues.API_V2_NATURE_: ApiV2Nature,
        PathValues.API_V2_NATURE_ID_: ApiV2NatureId,
        PathValues.API_V2_PALPARKAREA_: ApiV2PalParkArea,
        PathValues.API_V2_PALPARKAREA_ID_: ApiV2PalParkAreaId,
        PathValues.API_V2_POKEATHLONSTAT_: ApiV2PokeathlonStat,
        PathValues.API_V2_POKEATHLONSTAT_ID_: ApiV2PokeathlonStatId,
        PathValues.API_V2_POKEDEX_: ApiV2Pokedex,
        PathValues.API_V2_POKEDEX_ID_: ApiV2PokedexId,
        PathValues.API_V2_POKEMONCOLOR_: ApiV2PokemonColor,
        PathValues.API_V2_POKEMONCOLOR_ID_: ApiV2PokemonColorId,
        PathValues.API_V2_POKEMONFORM_: ApiV2PokemonForm,
        PathValues.API_V2_POKEMONFORM_ID_: ApiV2PokemonFormId,
        PathValues.API_V2_POKEMONHABITAT_: ApiV2PokemonHabitat,
        PathValues.API_V2_POKEMONHABITAT_ID_: ApiV2PokemonHabitatId,
        PathValues.API_V2_POKEMONSHAPE_: ApiV2PokemonShape,
        PathValues.API_V2_POKEMONSHAPE_ID_: ApiV2PokemonShapeId,
        PathValues.API_V2_POKEMONSPECIES_: ApiV2PokemonSpecies,
        PathValues.API_V2_POKEMONSPECIES_ID_: ApiV2PokemonSpeciesId,
        PathValues.API_V2_POKEMON_: ApiV2Pokemon,
        PathValues.API_V2_POKEMON_ID_: ApiV2PokemonId,
        PathValues.API_V2_REGION_: ApiV2Region,
        PathValues.API_V2_REGION_ID_: ApiV2RegionId,
        PathValues.API_V2_STAT_: ApiV2Stat,
        PathValues.API_V2_STAT_ID_: ApiV2StatId,
        PathValues.API_V2_SUPERCONTESTEFFECT_: ApiV2SuperContestEffect,
        PathValues.API_V2_SUPERCONTESTEFFECT_ID_: ApiV2SuperContestEffectId,
        PathValues.API_V2_TYPE_: ApiV2Type,
        PathValues.API_V2_TYPE_ID_: ApiV2TypeId,
        PathValues.API_V2_VERSIONGROUP_: ApiV2VersionGroup,
        PathValues.API_V2_VERSIONGROUP_ID_: ApiV2VersionGroupId,
        PathValues.API_V2_VERSION_: ApiV2Version,
        PathValues.API_V2_VERSION_ID_: ApiV2VersionId,
    }
)

path_to_api = PathToApi(
    {
        PathValues.API_V2_ABILITY_: ApiV2Ability,
        PathValues.API_V2_ABILITY_ID_: ApiV2AbilityId,
        PathValues.API_V2_BERRYFIRMNESS_: ApiV2BerryFirmness,
        PathValues.API_V2_BERRYFIRMNESS_ID_: ApiV2BerryFirmnessId,
        PathValues.API_V2_BERRYFLAVOR_: ApiV2BerryFlavor,
        PathValues.API_V2_BERRYFLAVOR_ID_: ApiV2BerryFlavorId,
        PathValues.API_V2_BERRY_: ApiV2Berry,
        PathValues.API_V2_BERRY_ID_: ApiV2BerryId,
        PathValues.API_V2_CHARACTERISTIC_: ApiV2Characteristic,
        PathValues.API_V2_CHARACTERISTIC_ID_: ApiV2CharacteristicId,
        PathValues.API_V2_CONTESTEFFECT_: ApiV2ContestEffect,
        PathValues.API_V2_CONTESTEFFECT_ID_: ApiV2ContestEffectId,
        PathValues.API_V2_CONTESTTYPE_: ApiV2ContestType,
        PathValues.API_V2_CONTESTTYPE_ID_: ApiV2ContestTypeId,
        PathValues.API_V2_EGGGROUP_: ApiV2EggGroup,
        PathValues.API_V2_EGGGROUP_ID_: ApiV2EggGroupId,
        PathValues.API_V2_ENCOUNTERCONDITIONVALUE_: ApiV2EncounterConditionValue,
        PathValues.API_V2_ENCOUNTERCONDITIONVALUE_ID_: ApiV2EncounterConditionValueId,
        PathValues.API_V2_ENCOUNTERCONDITION_: ApiV2EncounterCondition,
        PathValues.API_V2_ENCOUNTERCONDITION_ID_: ApiV2EncounterConditionId,
        PathValues.API_V2_ENCOUNTERMETHOD_: ApiV2EncounterMethod,
        PathValues.API_V2_ENCOUNTERMETHOD_ID_: ApiV2EncounterMethodId,
        PathValues.API_V2_EVOLUTIONCHAIN_: ApiV2EvolutionChain,
        PathValues.API_V2_EVOLUTIONCHAIN_ID_: ApiV2EvolutionChainId,
        PathValues.API_V2_EVOLUTIONTRIGGER_: ApiV2EvolutionTrigger,
        PathValues.API_V2_EVOLUTIONTRIGGER_ID_: ApiV2EvolutionTriggerId,
        PathValues.API_V2_GENDER_: ApiV2Gender,
        PathValues.API_V2_GENDER_ID_: ApiV2GenderId,
        PathValues.API_V2_GENERATION_: ApiV2Generation,
        PathValues.API_V2_GENERATION_ID_: ApiV2GenerationId,
        PathValues.API_V2_GROWTHRATE_: ApiV2GrowthRate,
        PathValues.API_V2_GROWTHRATE_ID_: ApiV2GrowthRateId,
        PathValues.API_V2_ITEMATTRIBUTE_: ApiV2ItemAttribute,
        PathValues.API_V2_ITEMATTRIBUTE_ID_: ApiV2ItemAttributeId,
        PathValues.API_V2_ITEMCATEGORY_: ApiV2ItemCategory,
        PathValues.API_V2_ITEMCATEGORY_ID_: ApiV2ItemCategoryId,
        PathValues.API_V2_ITEMFLINGEFFECT_: ApiV2ItemFlingEffect,
        PathValues.API_V2_ITEMFLINGEFFECT_ID_: ApiV2ItemFlingEffectId,
        PathValues.API_V2_ITEMPOCKET_: ApiV2ItemPocket,
        PathValues.API_V2_ITEMPOCKET_ID_: ApiV2ItemPocketId,
        PathValues.API_V2_ITEM_: ApiV2Item,
        PathValues.API_V2_ITEM_ID_: ApiV2ItemId,
        PathValues.API_V2_LANGUAGE_: ApiV2Language,
        PathValues.API_V2_LANGUAGE_ID_: ApiV2LanguageId,
        PathValues.API_V2_LOCATIONAREA_: ApiV2LocationArea,
        PathValues.API_V2_LOCATIONAREA_ID_: ApiV2LocationAreaId,
        PathValues.API_V2_LOCATION_: ApiV2Location,
        PathValues.API_V2_LOCATION_ID_: ApiV2LocationId,
        PathValues.API_V2_MACHINE_: ApiV2Machine,
        PathValues.API_V2_MACHINE_ID_: ApiV2MachineId,
        PathValues.API_V2_MOVEAILMENT_: ApiV2MoveAilment,
        PathValues.API_V2_MOVEAILMENT_ID_: ApiV2MoveAilmentId,
        PathValues.API_V2_MOVEBATTLESTYLE_: ApiV2MoveBattleStyle,
        PathValues.API_V2_MOVEBATTLESTYLE_ID_: ApiV2MoveBattleStyleId,
        PathValues.API_V2_MOVECATEGORY_: ApiV2MoveCategory,
        PathValues.API_V2_MOVECATEGORY_ID_: ApiV2MoveCategoryId,
        PathValues.API_V2_MOVEDAMAGECLASS_: ApiV2MoveDamageClass,
        PathValues.API_V2_MOVEDAMAGECLASS_ID_: ApiV2MoveDamageClassId,
        PathValues.API_V2_MOVELEARNMETHOD_: ApiV2MoveLearnMethod,
        PathValues.API_V2_MOVELEARNMETHOD_ID_: ApiV2MoveLearnMethodId,
        PathValues.API_V2_MOVETARGET_: ApiV2MoveTarget,
        PathValues.API_V2_MOVETARGET_ID_: ApiV2MoveTargetId,
        PathValues.API_V2_MOVE_: ApiV2Move,
        PathValues.API_V2_MOVE_ID_: ApiV2MoveId,
        PathValues.API_V2_NATURE_: ApiV2Nature,
        PathValues.API_V2_NATURE_ID_: ApiV2NatureId,
        PathValues.API_V2_PALPARKAREA_: ApiV2PalParkArea,
        PathValues.API_V2_PALPARKAREA_ID_: ApiV2PalParkAreaId,
        PathValues.API_V2_POKEATHLONSTAT_: ApiV2PokeathlonStat,
        PathValues.API_V2_POKEATHLONSTAT_ID_: ApiV2PokeathlonStatId,
        PathValues.API_V2_POKEDEX_: ApiV2Pokedex,
        PathValues.API_V2_POKEDEX_ID_: ApiV2PokedexId,
        PathValues.API_V2_POKEMONCOLOR_: ApiV2PokemonColor,
        PathValues.API_V2_POKEMONCOLOR_ID_: ApiV2PokemonColorId,
        PathValues.API_V2_POKEMONFORM_: ApiV2PokemonForm,
        PathValues.API_V2_POKEMONFORM_ID_: ApiV2PokemonFormId,
        PathValues.API_V2_POKEMONHABITAT_: ApiV2PokemonHabitat,
        PathValues.API_V2_POKEMONHABITAT_ID_: ApiV2PokemonHabitatId,
        PathValues.API_V2_POKEMONSHAPE_: ApiV2PokemonShape,
        PathValues.API_V2_POKEMONSHAPE_ID_: ApiV2PokemonShapeId,
        PathValues.API_V2_POKEMONSPECIES_: ApiV2PokemonSpecies,
        PathValues.API_V2_POKEMONSPECIES_ID_: ApiV2PokemonSpeciesId,
        PathValues.API_V2_POKEMON_: ApiV2Pokemon,
        PathValues.API_V2_POKEMON_ID_: ApiV2PokemonId,
        PathValues.API_V2_REGION_: ApiV2Region,
        PathValues.API_V2_REGION_ID_: ApiV2RegionId,
        PathValues.API_V2_STAT_: ApiV2Stat,
        PathValues.API_V2_STAT_ID_: ApiV2StatId,
        PathValues.API_V2_SUPERCONTESTEFFECT_: ApiV2SuperContestEffect,
        PathValues.API_V2_SUPERCONTESTEFFECT_ID_: ApiV2SuperContestEffectId,
        PathValues.API_V2_TYPE_: ApiV2Type,
        PathValues.API_V2_TYPE_ID_: ApiV2TypeId,
        PathValues.API_V2_VERSIONGROUP_: ApiV2VersionGroup,
        PathValues.API_V2_VERSIONGROUP_ID_: ApiV2VersionGroupId,
        PathValues.API_V2_VERSION_: ApiV2Version,
        PathValues.API_V2_VERSION_ID_: ApiV2VersionId,
    }
)
