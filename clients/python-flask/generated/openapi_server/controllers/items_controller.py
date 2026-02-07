import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.item_attribute_detail import ItemAttributeDetail  # noqa: E501
from openapi_server.models.item_category_detail import ItemCategoryDetail  # noqa: E501
from openapi_server.models.item_detail import ItemDetail  # noqa: E501
from openapi_server.models.item_fling_effect_detail import ItemFlingEffectDetail  # noqa: E501
from openapi_server.models.item_pocket_detail import ItemPocketDetail  # noqa: E501
from openapi_server.models.paginated_item_attribute_summary_list import PaginatedItemAttributeSummaryList  # noqa: E501
from openapi_server.models.paginated_item_category_summary_list import PaginatedItemCategorySummaryList  # noqa: E501
from openapi_server.models.paginated_item_fling_effect_summary_list import PaginatedItemFlingEffectSummaryList  # noqa: E501
from openapi_server.models.paginated_item_pocket_summary_list import PaginatedItemPocketSummaryList  # noqa: E501
from openapi_server.models.paginated_item_summary_list import PaginatedItemSummaryList  # noqa: E501
from openapi_server import util


def item_attribute_list(limit=None, offset=None, q=None):  # noqa: E501
    """List item attributes

    Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedItemAttributeSummaryList, Tuple[PaginatedItemAttributeSummaryList, int], Tuple[PaginatedItemAttributeSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_attribute_retrieve(id):  # noqa: E501
    """Get item attribute

    Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[ItemAttributeDetail, Tuple[ItemAttributeDetail, int], Tuple[ItemAttributeDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_category_list(limit=None, offset=None, q=None):  # noqa: E501
    """List item categories

    Item categories determine where items will be placed in the players bag. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedItemCategorySummaryList, Tuple[PaginatedItemCategorySummaryList, int], Tuple[PaginatedItemCategorySummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_category_retrieve(id):  # noqa: E501
    """Get item category

    Item categories determine where items will be placed in the players bag. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[ItemCategoryDetail, Tuple[ItemCategoryDetail, int], Tuple[ItemCategoryDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_fling_effect_list(limit=None, offset=None, q=None):  # noqa: E501
    """List item fling effects

    The various effects of the move\&quot;Fling\&quot; when used with different items. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedItemFlingEffectSummaryList, Tuple[PaginatedItemFlingEffectSummaryList, int], Tuple[PaginatedItemFlingEffectSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_fling_effect_retrieve(id):  # noqa: E501
    """Get item fling effect

    The various effects of the move\&quot;Fling\&quot; when used with different items. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[ItemFlingEffectDetail, Tuple[ItemFlingEffectDetail, int], Tuple[ItemFlingEffectDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_list(limit=None, offset=None, q=None):  # noqa: E501
    """List items

    An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedItemSummaryList, Tuple[PaginatedItemSummaryList, int], Tuple[PaginatedItemSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_pocket_list(limit=None, offset=None, q=None):  # noqa: E501
    """List item pockets

    Pockets within the players bag used for storing items by category. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedItemPocketSummaryList, Tuple[PaginatedItemPocketSummaryList, int], Tuple[PaginatedItemPocketSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_pocket_retrieve(id):  # noqa: E501
    """Get item pocket

    Pockets within the players bag used for storing items by category. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[ItemPocketDetail, Tuple[ItemPocketDetail, int], Tuple[ItemPocketDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def item_retrieve(id):  # noqa: E501
    """Get item

    An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[ItemDetail, Tuple[ItemDetail, int], Tuple[ItemDetail, int, Dict[str, str]]
    """
    return 'do some magic!'
