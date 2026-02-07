from typing import List, Dict
from aiohttp import web

from openapi_server.models.item_attribute_detail import ItemAttributeDetail
from openapi_server.models.item_category_detail import ItemCategoryDetail
from openapi_server.models.item_detail import ItemDetail
from openapi_server.models.item_fling_effect_detail import ItemFlingEffectDetail
from openapi_server.models.item_pocket_detail import ItemPocketDetail
from openapi_server.models.paginated_item_attribute_summary_list import PaginatedItemAttributeSummaryList
from openapi_server.models.paginated_item_category_summary_list import PaginatedItemCategorySummaryList
from openapi_server.models.paginated_item_fling_effect_summary_list import PaginatedItemFlingEffectSummaryList
from openapi_server.models.paginated_item_pocket_summary_list import PaginatedItemPocketSummaryList
from openapi_server.models.paginated_item_summary_list import PaginatedItemSummaryList
from openapi_server import util


async def item_attribute_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List item attributes

    Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def item_attribute_retrieve(request: web.Request, id) -> web.Response:
    """Get item attribute

    Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def item_category_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List item categories

    Item categories determine where items will be placed in the players bag.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def item_category_retrieve(request: web.Request, id) -> web.Response:
    """Get item category

    Item categories determine where items will be placed in the players bag.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def item_fling_effect_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List item fling effects

    The various effects of the move\&quot;Fling\&quot; when used with different items.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def item_fling_effect_retrieve(request: web.Request, id) -> web.Response:
    """Get item fling effect

    The various effects of the move\&quot;Fling\&quot; when used with different items.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def item_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List items

    An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def item_pocket_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List item pockets

    Pockets within the players bag used for storing items by category.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def item_pocket_retrieve(request: web.Request, id) -> web.Response:
    """Get item pocket

    Pockets within the players bag used for storing items by category.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def item_retrieve(request: web.Request, id) -> web.Response:
    """Get item

    An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
