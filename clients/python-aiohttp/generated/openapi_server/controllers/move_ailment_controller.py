from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def move_ailment_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """move_ailment_list

    

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    """
    return web.Response(status=200)


async def move_ailment_read(request: web.Request, id) -> web.Response:
    """move_ailment_read

    

    :param id: 
    :type id: int

    """
    return web.Response(status=200)
