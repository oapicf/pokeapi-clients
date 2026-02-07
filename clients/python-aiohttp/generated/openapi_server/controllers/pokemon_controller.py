from typing import List, Dict
from aiohttp import web

from openapi_server.models.ability_detail import AbilityDetail
from openapi_server.models.characteristic_detail import CharacteristicDetail
from openapi_server.models.egg_group_detail import EggGroupDetail
from openapi_server.models.gender_detail import GenderDetail
from openapi_server.models.growth_rate_detail import GrowthRateDetail
from openapi_server.models.move_damage_class_detail import MoveDamageClassDetail
from openapi_server.models.nature_detail import NatureDetail
from openapi_server.models.paginated_ability_summary_list import PaginatedAbilitySummaryList
from openapi_server.models.paginated_characteristic_summary_list import PaginatedCharacteristicSummaryList
from openapi_server.models.paginated_egg_group_summary_list import PaginatedEggGroupSummaryList
from openapi_server.models.paginated_gender_summary_list import PaginatedGenderSummaryList
from openapi_server.models.paginated_growth_rate_summary_list import PaginatedGrowthRateSummaryList
from openapi_server.models.paginated_move_damage_class_summary_list import PaginatedMoveDamageClassSummaryList
from openapi_server.models.paginated_nature_summary_list import PaginatedNatureSummaryList
from openapi_server.models.paginated_pokeathlon_stat_summary_list import PaginatedPokeathlonStatSummaryList
from openapi_server.models.paginated_pokemon_color_summary_list import PaginatedPokemonColorSummaryList
from openapi_server.models.paginated_pokemon_form_summary_list import PaginatedPokemonFormSummaryList
from openapi_server.models.paginated_pokemon_habitat_summary_list import PaginatedPokemonHabitatSummaryList
from openapi_server.models.paginated_pokemon_shape_summary_list import PaginatedPokemonShapeSummaryList
from openapi_server.models.paginated_pokemon_species_summary_list import PaginatedPokemonSpeciesSummaryList
from openapi_server.models.paginated_pokemon_summary_list import PaginatedPokemonSummaryList
from openapi_server.models.paginated_stat_summary_list import PaginatedStatSummaryList
from openapi_server.models.paginated_type_summary_list import PaginatedTypeSummaryList
from openapi_server.models.pokeathlon_stat_detail import PokeathlonStatDetail
from openapi_server.models.pokemon_color_detail import PokemonColorDetail
from openapi_server.models.pokemon_detail import PokemonDetail
from openapi_server.models.pokemon_form_detail import PokemonFormDetail
from openapi_server.models.pokemon_habitat_detail import PokemonHabitatDetail
from openapi_server.models.pokemon_shape_detail import PokemonShapeDetail
from openapi_server.models.pokemon_species_detail import PokemonSpeciesDetail
from openapi_server.models.stat_detail import StatDetail
from openapi_server.models.type_detail import TypeDetail
from openapi_server import util


async def ability_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """ability_list

    Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def ability_retrieve(request: web.Request, id) -> web.Response:
    """ability_retrieve

    Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def characteristic_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List charecterictics

    Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def characteristic_retrieve(request: web.Request, id) -> web.Response:
    """Get characteristic

    Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def egg_group_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List egg groups

    Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def egg_group_retrieve(request: web.Request, id) -> web.Response:
    """Get egg group

    Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def gender_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List genders

    Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def gender_retrieve(request: web.Request, id) -> web.Response:
    """Get gender

    Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def growth_rate_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List growth rates

    Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def growth_rate_retrieve(request: web.Request, id) -> web.Response:
    """Get growth rate

    Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def move_damage_class_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List move damage classes

    Damage classes moves can have, e.g. physical, special, or non-damaging.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def move_damage_class_retrieve(request: web.Request, id) -> web.Response:
    """Get move damage class

    Damage classes moves can have, e.g. physical, special, or non-damaging.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def nature_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List natures

    Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def nature_retrieve(request: web.Request, id) -> web.Response:
    """Get nature

    Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokeathlon_stat_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokeathlon stats

    Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokeathlon_stat_retrieve(request: web.Request, id) -> web.Response:
    """Get pokeathlon stat

    Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokemon_color_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokemon colors

    Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokemon_color_retrieve(request: web.Request, id) -> web.Response:
    """Get pokemon color

    Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokemon_form_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokemon forms

    Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokemon_form_retrieve(request: web.Request, id) -> web.Response:
    """Get pokemon form

    Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokemon_habitat_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokemom habitas

    Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokemon_habitat_retrieve(request: web.Request, id) -> web.Response:
    """Get pokemom habita

    Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokemon_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokemon

    Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokemon_retrieve(request: web.Request, id) -> web.Response:
    """Get pokemon

    Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokemon_shape_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokemon shapes

    Shapes used for sorting Pokémon in a Pokédex.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokemon_shape_retrieve(request: web.Request, id) -> web.Response:
    """Get pokemon shape

    Shapes used for sorting Pokémon in a Pokédex.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokemon_species_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokemon species

    A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokemon_species_retrieve(request: web.Request, id) -> web.Response:
    """Get pokemon species

    A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def stat_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List stats

    Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def stat_retrieve(request: web.Request, id) -> web.Response:
    """Get stat

    Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def type_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List types

    Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def type_retrieve(request: web.Request, id) -> web.Response:
    """Get types

    Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
