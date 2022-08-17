
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from pokeapiclient.api.ability_api import AbilityApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from pokeapiclient.api.ability_api import AbilityApi
from pokeapiclient.api.berry_api import BerryApi
from pokeapiclient.api.berry_firmness_api import BerryFirmnessApi
from pokeapiclient.api.berry_flavor_api import BerryFlavorApi
from pokeapiclient.api.characteristic_api import CharacteristicApi
from pokeapiclient.api.contest_effect_api import ContestEffectApi
from pokeapiclient.api.contest_type_api import ContestTypeApi
from pokeapiclient.api.egg_group_api import EggGroupApi
from pokeapiclient.api.encounter_condition_api import EncounterConditionApi
from pokeapiclient.api.encounter_condition_value_api import EncounterConditionValueApi
from pokeapiclient.api.encounter_method_api import EncounterMethodApi
from pokeapiclient.api.evolution_chain_api import EvolutionChainApi
from pokeapiclient.api.evolution_trigger_api import EvolutionTriggerApi
from pokeapiclient.api.gender_api import GenderApi
from pokeapiclient.api.generation_api import GenerationApi
from pokeapiclient.api.growth_rate_api import GrowthRateApi
from pokeapiclient.api.item_api import ItemApi
from pokeapiclient.api.item_attribute_api import ItemAttributeApi
from pokeapiclient.api.item_category_api import ItemCategoryApi
from pokeapiclient.api.item_fling_effect_api import ItemFlingEffectApi
from pokeapiclient.api.item_pocket_api import ItemPocketApi
from pokeapiclient.api.language_api import LanguageApi
from pokeapiclient.api.location_api import LocationApi
from pokeapiclient.api.location_area_api import LocationAreaApi
from pokeapiclient.api.machine_api import MachineApi
from pokeapiclient.api.move_api import MoveApi
from pokeapiclient.api.move_ailment_api import MoveAilmentApi
from pokeapiclient.api.move_battle_style_api import MoveBattleStyleApi
from pokeapiclient.api.move_category_api import MoveCategoryApi
from pokeapiclient.api.move_damage_class_api import MoveDamageClassApi
from pokeapiclient.api.move_learn_method_api import MoveLearnMethodApi
from pokeapiclient.api.move_target_api import MoveTargetApi
from pokeapiclient.api.nature_api import NatureApi
from pokeapiclient.api.pal_park_area_api import PalParkAreaApi
from pokeapiclient.api.pokeathlon_stat_api import PokeathlonStatApi
from pokeapiclient.api.pokedex_api import PokedexApi
from pokeapiclient.api.pokemon_api import PokemonApi
from pokeapiclient.api.pokemon_color_api import PokemonColorApi
from pokeapiclient.api.pokemon_form_api import PokemonFormApi
from pokeapiclient.api.pokemon_habitat_api import PokemonHabitatApi
from pokeapiclient.api.pokemon_shape_api import PokemonShapeApi
from pokeapiclient.api.pokemon_species_api import PokemonSpeciesApi
from pokeapiclient.api.region_api import RegionApi
from pokeapiclient.api.stat_api import StatApi
from pokeapiclient.api.super_contest_effect_api import SuperContestEffectApi
from pokeapiclient.api.type_api import TypeApi
from pokeapiclient.api.version_api import VersionApi
from pokeapiclient.api.version_group_api import VersionGroupApi
