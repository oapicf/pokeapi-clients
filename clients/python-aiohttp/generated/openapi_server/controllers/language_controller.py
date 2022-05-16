from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def language_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """language_list

    

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    """
    return web.Response(status=200)


async def language_read(request: web.Request, id) -> web.Response:
    """language_read

    

    :param id: 
    :type id: int

    """
    return web.Response(status=200)
