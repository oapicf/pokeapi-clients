from typing import List, Dict
from aiohttp import web

from openapi_server.models.machine_detail import MachineDetail
from openapi_server.models.paginated_machine_summary_list import PaginatedMachineSummaryList
from openapi_server import util


async def machine_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List machines

    Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def machine_retrieve(request: web.Request, id) -> web.Response:
    """Get machine

    Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
