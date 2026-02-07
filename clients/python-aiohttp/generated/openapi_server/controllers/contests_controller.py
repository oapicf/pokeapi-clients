from typing import List, Dict
from aiohttp import web

from openapi_server.models.contest_effect_detail import ContestEffectDetail
from openapi_server.models.contest_type_detail import ContestTypeDetail
from openapi_server.models.paginated_contest_effect_summary_list import PaginatedContestEffectSummaryList
from openapi_server.models.paginated_contest_type_summary_list import PaginatedContestTypeSummaryList
from openapi_server.models.paginated_super_contest_effect_summary_list import PaginatedSuperContestEffectSummaryList
from openapi_server.models.super_contest_effect_detail import SuperContestEffectDetail
from openapi_server import util


async def contest_effect_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List contest effects

    Contest effects refer to the effects of moves when used in contests.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def contest_effect_retrieve(request: web.Request, id) -> web.Response:
    """Get contest effect

    Contest effects refer to the effects of moves when used in contests.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def contest_type_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List contest types

    Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def contest_type_retrieve(request: web.Request, id) -> web.Response:
    """Get contest type

    Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def super_contest_effect_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List super contest effects

    Super contest effects refer to the effects of moves when used in super contests.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def super_contest_effect_retrieve(request: web.Request, id) -> web.Response:
    """Get super contest effect

    Super contest effects refer to the effects of moves when used in super contests.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
