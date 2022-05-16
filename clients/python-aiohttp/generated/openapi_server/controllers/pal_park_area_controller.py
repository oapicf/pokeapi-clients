from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def pal_park_area_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """pal_park_area_list

    

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    """
    return web.Response(status=200)


async def pal_park_area_read(request: web.Request, id) -> web.Response:
    """pal_park_area_read

    

    :param id: 
    :type id: int

    """
    return web.Response(status=200)
