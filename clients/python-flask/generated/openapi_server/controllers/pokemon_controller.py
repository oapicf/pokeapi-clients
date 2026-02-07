import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.ability_detail import AbilityDetail  # noqa: E501
from openapi_server.models.characteristic_detail import CharacteristicDetail  # noqa: E501
from openapi_server.models.egg_group_detail import EggGroupDetail  # noqa: E501
from openapi_server.models.gender_detail import GenderDetail  # noqa: E501
from openapi_server.models.growth_rate_detail import GrowthRateDetail  # noqa: E501
from openapi_server.models.move_damage_class_detail import MoveDamageClassDetail  # noqa: E501
from openapi_server.models.nature_detail import NatureDetail  # noqa: E501
from openapi_server.models.paginated_ability_summary_list import PaginatedAbilitySummaryList  # noqa: E501
from openapi_server.models.paginated_characteristic_summary_list import PaginatedCharacteristicSummaryList  # noqa: E501
from openapi_server.models.paginated_egg_group_summary_list import PaginatedEggGroupSummaryList  # noqa: E501
from openapi_server.models.paginated_gender_summary_list import PaginatedGenderSummaryList  # noqa: E501
from openapi_server.models.paginated_growth_rate_summary_list import PaginatedGrowthRateSummaryList  # noqa: E501
from openapi_server.models.paginated_move_damage_class_summary_list import PaginatedMoveDamageClassSummaryList  # noqa: E501
from openapi_server.models.paginated_nature_summary_list import PaginatedNatureSummaryList  # noqa: E501
from openapi_server.models.paginated_pokeathlon_stat_summary_list import PaginatedPokeathlonStatSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_color_summary_list import PaginatedPokemonColorSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_form_summary_list import PaginatedPokemonFormSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_habitat_summary_list import PaginatedPokemonHabitatSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_shape_summary_list import PaginatedPokemonShapeSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_species_summary_list import PaginatedPokemonSpeciesSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_summary_list import PaginatedPokemonSummaryList  # noqa: E501
from openapi_server.models.paginated_stat_summary_list import PaginatedStatSummaryList  # noqa: E501
from openapi_server.models.paginated_type_summary_list import PaginatedTypeSummaryList  # noqa: E501
from openapi_server.models.pokeathlon_stat_detail import PokeathlonStatDetail  # noqa: E501
from openapi_server.models.pokemon_color_detail import PokemonColorDetail  # noqa: E501
from openapi_server.models.pokemon_detail import PokemonDetail  # noqa: E501
from openapi_server.models.pokemon_form_detail import PokemonFormDetail  # noqa: E501
from openapi_server.models.pokemon_habitat_detail import PokemonHabitatDetail  # noqa: E501
from openapi_server.models.pokemon_shape_detail import PokemonShapeDetail  # noqa: E501
from openapi_server.models.pokemon_species_detail import PokemonSpeciesDetail  # noqa: E501
from openapi_server.models.stat_detail import StatDetail  # noqa: E501
from openapi_server.models.type_detail import TypeDetail  # noqa: E501
from openapi_server import util


def ability_list(limit=None, offset=None, q=None):  # noqa: E501
    """ability_list

    Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedAbilitySummaryList, Tuple[PaginatedAbilitySummaryList, int], Tuple[PaginatedAbilitySummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def ability_retrieve(id):  # noqa: E501
    """ability_retrieve

    Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[AbilityDetail, Tuple[AbilityDetail, int], Tuple[AbilityDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def characteristic_list(limit=None, offset=None, q=None):  # noqa: E501
    """List charecterictics

    Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedCharacteristicSummaryList, Tuple[PaginatedCharacteristicSummaryList, int], Tuple[PaginatedCharacteristicSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def characteristic_retrieve(id):  # noqa: E501
    """Get characteristic

    Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[CharacteristicDetail, Tuple[CharacteristicDetail, int], Tuple[CharacteristicDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def egg_group_list(limit=None, offset=None, q=None):  # noqa: E501
    """List egg groups

    Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedEggGroupSummaryList, Tuple[PaginatedEggGroupSummaryList, int], Tuple[PaginatedEggGroupSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def egg_group_retrieve(id):  # noqa: E501
    """Get egg group

    Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[EggGroupDetail, Tuple[EggGroupDetail, int], Tuple[EggGroupDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def gender_list(limit=None, offset=None, q=None):  # noqa: E501
    """List genders

    Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedGenderSummaryList, Tuple[PaginatedGenderSummaryList, int], Tuple[PaginatedGenderSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def gender_retrieve(id):  # noqa: E501
    """Get gender

    Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[GenderDetail, Tuple[GenderDetail, int], Tuple[GenderDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def growth_rate_list(limit=None, offset=None, q=None):  # noqa: E501
    """List growth rates

    Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedGrowthRateSummaryList, Tuple[PaginatedGrowthRateSummaryList, int], Tuple[PaginatedGrowthRateSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def growth_rate_retrieve(id):  # noqa: E501
    """Get growth rate

    Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[GrowthRateDetail, Tuple[GrowthRateDetail, int], Tuple[GrowthRateDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def move_damage_class_list(limit=None, offset=None, q=None):  # noqa: E501
    """List move damage classes

    Damage classes moves can have, e.g. physical, special, or non-damaging. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedMoveDamageClassSummaryList, Tuple[PaginatedMoveDamageClassSummaryList, int], Tuple[PaginatedMoveDamageClassSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def move_damage_class_retrieve(id):  # noqa: E501
    """Get move damage class

    Damage classes moves can have, e.g. physical, special, or non-damaging. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[MoveDamageClassDetail, Tuple[MoveDamageClassDetail, int], Tuple[MoveDamageClassDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def nature_list(limit=None, offset=None, q=None):  # noqa: E501
    """List natures

    Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedNatureSummaryList, Tuple[PaginatedNatureSummaryList, int], Tuple[PaginatedNatureSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def nature_retrieve(id):  # noqa: E501
    """Get nature

    Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[NatureDetail, Tuple[NatureDetail, int], Tuple[NatureDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokeathlon_stat_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokeathlon stats

    Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokeathlonStatSummaryList, Tuple[PaginatedPokeathlonStatSummaryList, int], Tuple[PaginatedPokeathlonStatSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokeathlon_stat_retrieve(id):  # noqa: E501
    """Get pokeathlon stat

    Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokeathlonStatDetail, Tuple[PokeathlonStatDetail, int], Tuple[PokeathlonStatDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_color_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokemon colors

    Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokemonColorSummaryList, Tuple[PaginatedPokemonColorSummaryList, int], Tuple[PaginatedPokemonColorSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_color_retrieve(id):  # noqa: E501
    """Get pokemon color

    Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokemonColorDetail, Tuple[PokemonColorDetail, int], Tuple[PokemonColorDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_form_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokemon forms

    Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokemonFormSummaryList, Tuple[PaginatedPokemonFormSummaryList, int], Tuple[PaginatedPokemonFormSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_form_retrieve(id):  # noqa: E501
    """Get pokemon form

    Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokemonFormDetail, Tuple[PokemonFormDetail, int], Tuple[PokemonFormDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_habitat_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokemom habitas

    Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokemonHabitatSummaryList, Tuple[PaginatedPokemonHabitatSummaryList, int], Tuple[PaginatedPokemonHabitatSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_habitat_retrieve(id):  # noqa: E501
    """Get pokemom habita

    Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokemonHabitatDetail, Tuple[PokemonHabitatDetail, int], Tuple[PokemonHabitatDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokemon

    Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokemonSummaryList, Tuple[PaginatedPokemonSummaryList, int], Tuple[PaginatedPokemonSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_retrieve(id):  # noqa: E501
    """Get pokemon

    Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokemonDetail, Tuple[PokemonDetail, int], Tuple[PokemonDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_shape_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokemon shapes

    Shapes used for sorting Pokémon in a Pokédex. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokemonShapeSummaryList, Tuple[PaginatedPokemonShapeSummaryList, int], Tuple[PaginatedPokemonShapeSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_shape_retrieve(id):  # noqa: E501
    """Get pokemon shape

    Shapes used for sorting Pokémon in a Pokédex. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokemonShapeDetail, Tuple[PokemonShapeDetail, int], Tuple[PokemonShapeDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_species_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokemon species

    A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokemonSpeciesSummaryList, Tuple[PaginatedPokemonSpeciesSummaryList, int], Tuple[PaginatedPokemonSpeciesSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokemon_species_retrieve(id):  # noqa: E501
    """Get pokemon species

    A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokemonSpeciesDetail, Tuple[PokemonSpeciesDetail, int], Tuple[PokemonSpeciesDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def stat_list(limit=None, offset=None, q=None):  # noqa: E501
    """List stats

    Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedStatSummaryList, Tuple[PaginatedStatSummaryList, int], Tuple[PaginatedStatSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def stat_retrieve(id):  # noqa: E501
    """Get stat

    Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[StatDetail, Tuple[StatDetail, int], Tuple[StatDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def type_list(limit=None, offset=None, q=None):  # noqa: E501
    """List types

    Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedTypeSummaryList, Tuple[PaginatedTypeSummaryList, int], Tuple[PaginatedTypeSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def type_retrieve(id):  # noqa: E501
    """Get types

    Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[TypeDetail, Tuple[TypeDetail, int], Tuple[TypeDetail, int, Dict[str, str]]
    """
    return 'do some magic!'
