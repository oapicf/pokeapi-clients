from typing import List, Dict
from aiohttp import web

from openapi_server.models.berry_detail import BerryDetail
from openapi_server.models.berry_firmness_detail import BerryFirmnessDetail
from openapi_server.models.berry_flavor_detail import BerryFlavorDetail
from openapi_server.models.paginated_berry_firmness_summary_list import PaginatedBerryFirmnessSummaryList
from openapi_server.models.paginated_berry_flavor_summary_list import PaginatedBerryFlavorSummaryList
from openapi_server.models.paginated_berry_summary_list import PaginatedBerrySummaryList
from openapi_server import util


async def berry_firmness_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List berry firmness

    Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def berry_firmness_retrieve(request: web.Request, id) -> web.Response:
    """Get berry by firmness

    Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def berry_flavor_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List berry flavors

    Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def berry_flavor_retrieve(request: web.Request, id) -> web.Response:
    """Get berries by flavor

    Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def berry_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List berries

    Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def berry_retrieve(request: web.Request, id) -> web.Response:
    """Get a berry

    Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
