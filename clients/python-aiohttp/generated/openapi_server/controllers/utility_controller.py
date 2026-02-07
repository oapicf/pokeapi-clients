from typing import List, Dict
from aiohttp import web

from openapi_server.models.language_detail import LanguageDetail
from openapi_server.models.paginated_language_summary_list import PaginatedLanguageSummaryList
from openapi_server import util


async def language_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List languages

    Languages for translations of API resource information.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def language_retrieve(request: web.Request, id) -> web.Response:
    """Get language

    Languages for translations of API resource information.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
