from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def growth_rate_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """growth_rate_list

    

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    """
    return web.Response(status=200)


async def growth_rate_read(request: web.Request, id) -> web.Response:
    """growth_rate_read

    

    :param id: 
    :type id: int

    """
    return web.Response(status=200)
