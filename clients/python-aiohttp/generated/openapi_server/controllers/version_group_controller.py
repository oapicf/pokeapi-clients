from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def version_group_list(request: web.Request, limit=None, offset=None) -> web.Response:
    """version_group_list

    

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    """
    return web.Response(status=200)


async def version_group_read(request: web.Request, id) -> web.Response:
    """version_group_read

    

    :param id: 
    :type id: int

    """
    return web.Response(status=200)
