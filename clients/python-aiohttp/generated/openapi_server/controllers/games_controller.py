from typing import List, Dict
from aiohttp import web

from openapi_server.models.generation_detail import GenerationDetail
from openapi_server.models.paginated_generation_summary_list import PaginatedGenerationSummaryList
from openapi_server.models.paginated_pokedex_summary_list import PaginatedPokedexSummaryList
from openapi_server.models.paginated_version_group_summary_list import PaginatedVersionGroupSummaryList
from openapi_server.models.paginated_version_summary_list import PaginatedVersionSummaryList
from openapi_server.models.pokedex_detail import PokedexDetail
from openapi_server.models.version_detail import VersionDetail
from openapi_server.models.version_group_detail import VersionGroupDetail
from openapi_server import util


async def generation_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List genrations

    A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def generation_retrieve(request: web.Request, id) -> web.Response:
    """Get genration

    A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pokedex_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pokedex

    A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pokedex_retrieve(request: web.Request, id) -> web.Response:
    """Get pokedex

    A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def version_group_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List version groups

    Version groups categorize highly similar versions of the games.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def version_group_retrieve(request: web.Request, id) -> web.Response:
    """Get version group

    Version groups categorize highly similar versions of the games.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def version_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List versions

    Versions of the games, e.g., Red, Blue or Yellow.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def version_retrieve(request: web.Request, id) -> web.Response:
    """Get version

    Versions of the games, e.g., Red, Blue or Yellow.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
