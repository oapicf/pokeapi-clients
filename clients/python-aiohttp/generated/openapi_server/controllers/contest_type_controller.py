from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def contest_type_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """contest_type_list

    

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    """
    return web.Response(status=200)


async def contest_type_read(request: web.Request, id) -> web.Response:
    """contest_type_read

    

    :param id: 
    :type id: int

    """
    return web.Response(status=200)
