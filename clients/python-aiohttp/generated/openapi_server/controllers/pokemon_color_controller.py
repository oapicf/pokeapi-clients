from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def pokemon_color_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """pokemon_color_list

    

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    """
    return web.Response(status=200)


async def pokemon_color_read(request: web.Request, id) -> web.Response:
    """pokemon_color_read

    

    :param id: 
    :type id: int

    """
    return web.Response(status=200)
