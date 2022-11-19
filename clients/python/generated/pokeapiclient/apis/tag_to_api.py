import typing_extensions

from pokeapiclient.apis.tags import TagValues
from pokeapiclient.apis.tags.ability_api import AbilityApi
from pokeapiclient.apis.tags.berry_api import BerryApi
from pokeapiclient.apis.tags.berry_firmness_api import BerryFirmnessApi
from pokeapiclient.apis.tags.berry_flavor_api import BerryFlavorApi
from pokeapiclient.apis.tags.characteristic_api import CharacteristicApi
from pokeapiclient.apis.tags.contest_effect_api import ContestEffectApi
from pokeapiclient.apis.tags.contest_type_api import ContestTypeApi
from pokeapiclient.apis.tags.egg_group_api import EggGroupApi
from pokeapiclient.apis.tags.encounter_condition_api import EncounterConditionApi
from pokeapiclient.apis.tags.encounter_condition_value_api import EncounterConditionValueApi
from pokeapiclient.apis.tags.encounter_method_api import EncounterMethodApi
from pokeapiclient.apis.tags.evolution_chain_api import EvolutionChainApi
from pokeapiclient.apis.tags.evolution_trigger_api import EvolutionTriggerApi
from pokeapiclient.apis.tags.gender_api import GenderApi
from pokeapiclient.apis.tags.generation_api import GenerationApi
from pokeapiclient.apis.tags.growth_rate_api import GrowthRateApi
from pokeapiclient.apis.tags.item_api import ItemApi
from pokeapiclient.apis.tags.item_attribute_api import ItemAttributeApi
from pokeapiclient.apis.tags.item_category_api import ItemCategoryApi
from pokeapiclient.apis.tags.item_fling_effect_api import ItemFlingEffectApi
from pokeapiclient.apis.tags.item_pocket_api import ItemPocketApi
from pokeapiclient.apis.tags.language_api import LanguageApi
from pokeapiclient.apis.tags.location_api import LocationApi
from pokeapiclient.apis.tags.location_area_api import LocationAreaApi
from pokeapiclient.apis.tags.machine_api import MachineApi
from pokeapiclient.apis.tags.move_api import MoveApi
from pokeapiclient.apis.tags.move_ailment_api import MoveAilmentApi
from pokeapiclient.apis.tags.move_battle_style_api import MoveBattleStyleApi
from pokeapiclient.apis.tags.move_category_api import MoveCategoryApi
from pokeapiclient.apis.tags.move_damage_class_api import MoveDamageClassApi
from pokeapiclient.apis.tags.move_learn_method_api import MoveLearnMethodApi
from pokeapiclient.apis.tags.move_target_api import MoveTargetApi
from pokeapiclient.apis.tags.nature_api import NatureApi
from pokeapiclient.apis.tags.pal_park_area_api import PalParkAreaApi
from pokeapiclient.apis.tags.pokeathlon_stat_api import PokeathlonStatApi
from pokeapiclient.apis.tags.pokedex_api import PokedexApi
from pokeapiclient.apis.tags.pokemon_api import PokemonApi
from pokeapiclient.apis.tags.pokemon_color_api import PokemonColorApi
from pokeapiclient.apis.tags.pokemon_form_api import PokemonFormApi
from pokeapiclient.apis.tags.pokemon_habitat_api import PokemonHabitatApi
from pokeapiclient.apis.tags.pokemon_shape_api import PokemonShapeApi
from pokeapiclient.apis.tags.pokemon_species_api import PokemonSpeciesApi
from pokeapiclient.apis.tags.region_api import RegionApi
from pokeapiclient.apis.tags.stat_api import StatApi
from pokeapiclient.apis.tags.super_contest_effect_api import SuperContestEffectApi
from pokeapiclient.apis.tags.type_api import TypeApi
from pokeapiclient.apis.tags.version_api import VersionApi
from pokeapiclient.apis.tags.version_group_api import VersionGroupApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.ABILITY: AbilityApi,
        TagValues.BERRY: BerryApi,
        TagValues.BERRYFIRMNESS: BerryFirmnessApi,
        TagValues.BERRYFLAVOR: BerryFlavorApi,
        TagValues.CHARACTERISTIC: CharacteristicApi,
        TagValues.CONTESTEFFECT: ContestEffectApi,
        TagValues.CONTESTTYPE: ContestTypeApi,
        TagValues.EGGGROUP: EggGroupApi,
        TagValues.ENCOUNTERCONDITION: EncounterConditionApi,
        TagValues.ENCOUNTERCONDITIONVALUE: EncounterConditionValueApi,
        TagValues.ENCOUNTERMETHOD: EncounterMethodApi,
        TagValues.EVOLUTIONCHAIN: EvolutionChainApi,
        TagValues.EVOLUTIONTRIGGER: EvolutionTriggerApi,
        TagValues.GENDER: GenderApi,
        TagValues.GENERATION: GenerationApi,
        TagValues.GROWTHRATE: GrowthRateApi,
        TagValues.ITEM: ItemApi,
        TagValues.ITEMATTRIBUTE: ItemAttributeApi,
        TagValues.ITEMCATEGORY: ItemCategoryApi,
        TagValues.ITEMFLINGEFFECT: ItemFlingEffectApi,
        TagValues.ITEMPOCKET: ItemPocketApi,
        TagValues.LANGUAGE: LanguageApi,
        TagValues.LOCATION: LocationApi,
        TagValues.LOCATIONAREA: LocationAreaApi,
        TagValues.MACHINE: MachineApi,
        TagValues.MOVE: MoveApi,
        TagValues.MOVEAILMENT: MoveAilmentApi,
        TagValues.MOVEBATTLESTYLE: MoveBattleStyleApi,
        TagValues.MOVECATEGORY: MoveCategoryApi,
        TagValues.MOVEDAMAGECLASS: MoveDamageClassApi,
        TagValues.MOVELEARNMETHOD: MoveLearnMethodApi,
        TagValues.MOVETARGET: MoveTargetApi,
        TagValues.NATURE: NatureApi,
        TagValues.PALPARKAREA: PalParkAreaApi,
        TagValues.POKEATHLONSTAT: PokeathlonStatApi,
        TagValues.POKEDEX: PokedexApi,
        TagValues.POKEMON: PokemonApi,
        TagValues.POKEMONCOLOR: PokemonColorApi,
        TagValues.POKEMONFORM: PokemonFormApi,
        TagValues.POKEMONHABITAT: PokemonHabitatApi,
        TagValues.POKEMONSHAPE: PokemonShapeApi,
        TagValues.POKEMONSPECIES: PokemonSpeciesApi,
        TagValues.REGION: RegionApi,
        TagValues.STAT: StatApi,
        TagValues.SUPERCONTESTEFFECT: SuperContestEffectApi,
        TagValues.TYPE: TypeApi,
        TagValues.VERSION: VersionApi,
        TagValues.VERSIONGROUP: VersionGroupApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.ABILITY: AbilityApi,
        TagValues.BERRY: BerryApi,
        TagValues.BERRYFIRMNESS: BerryFirmnessApi,
        TagValues.BERRYFLAVOR: BerryFlavorApi,
        TagValues.CHARACTERISTIC: CharacteristicApi,
        TagValues.CONTESTEFFECT: ContestEffectApi,
        TagValues.CONTESTTYPE: ContestTypeApi,
        TagValues.EGGGROUP: EggGroupApi,
        TagValues.ENCOUNTERCONDITION: EncounterConditionApi,
        TagValues.ENCOUNTERCONDITIONVALUE: EncounterConditionValueApi,
        TagValues.ENCOUNTERMETHOD: EncounterMethodApi,
        TagValues.EVOLUTIONCHAIN: EvolutionChainApi,
        TagValues.EVOLUTIONTRIGGER: EvolutionTriggerApi,
        TagValues.GENDER: GenderApi,
        TagValues.GENERATION: GenerationApi,
        TagValues.GROWTHRATE: GrowthRateApi,
        TagValues.ITEM: ItemApi,
        TagValues.ITEMATTRIBUTE: ItemAttributeApi,
        TagValues.ITEMCATEGORY: ItemCategoryApi,
        TagValues.ITEMFLINGEFFECT: ItemFlingEffectApi,
        TagValues.ITEMPOCKET: ItemPocketApi,
        TagValues.LANGUAGE: LanguageApi,
        TagValues.LOCATION: LocationApi,
        TagValues.LOCATIONAREA: LocationAreaApi,
        TagValues.MACHINE: MachineApi,
        TagValues.MOVE: MoveApi,
        TagValues.MOVEAILMENT: MoveAilmentApi,
        TagValues.MOVEBATTLESTYLE: MoveBattleStyleApi,
        TagValues.MOVECATEGORY: MoveCategoryApi,
        TagValues.MOVEDAMAGECLASS: MoveDamageClassApi,
        TagValues.MOVELEARNMETHOD: MoveLearnMethodApi,
        TagValues.MOVETARGET: MoveTargetApi,
        TagValues.NATURE: NatureApi,
        TagValues.PALPARKAREA: PalParkAreaApi,
        TagValues.POKEATHLONSTAT: PokeathlonStatApi,
        TagValues.POKEDEX: PokedexApi,
        TagValues.POKEMON: PokemonApi,
        TagValues.POKEMONCOLOR: PokemonColorApi,
        TagValues.POKEMONFORM: PokemonFormApi,
        TagValues.POKEMONHABITAT: PokemonHabitatApi,
        TagValues.POKEMONSHAPE: PokemonShapeApi,
        TagValues.POKEMONSPECIES: PokemonSpeciesApi,
        TagValues.REGION: RegionApi,
        TagValues.STAT: StatApi,
        TagValues.SUPERCONTESTEFFECT: SuperContestEffectApi,
        TagValues.TYPE: TypeApi,
        TagValues.VERSION: VersionApi,
        TagValues.VERSIONGROUP: VersionGroupApi,
    }
)
