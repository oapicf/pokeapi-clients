from typing import List, Dict
from aiohttp import web

from openapi_server.models.location_area_detail import LocationAreaDetail
from openapi_server.models.location_detail import LocationDetail
from openapi_server.models.paginated_location_area_summary_list import PaginatedLocationAreaSummaryList
from openapi_server.models.paginated_location_summary_list import PaginatedLocationSummaryList
from openapi_server.models.paginated_pal_park_area_summary_list import PaginatedPalParkAreaSummaryList
from openapi_server.models.paginated_region_summary_list import PaginatedRegionSummaryList
from openapi_server.models.pal_park_area_detail import PalParkAreaDetail
from openapi_server.models.region_detail import RegionDetail
from openapi_server import util


async def location_area_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """List location areas

    Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int

    """
    return web.Response(status=200)


async def location_area_retrieve(request: web.Request, id) -> web.Response:
    """Get location area

    Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

    :param id: A unique integer value identifying this location area.
    :type id: int

    """
    return web.Response(status=200)


async def location_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List locations

    Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def location_retrieve(request: web.Request, id) -> web.Response:
    """Get location

    Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def pal_park_area_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List pal park areas

    Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def pal_park_area_retrieve(request: web.Request, id) -> web.Response:
    """Get pal park area

    Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def region_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List regions

    A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def region_retrieve(request: web.Request, id) -> web.Response:
    """Get region

    A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
