# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
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
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

class BaseItemsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseItemsApi.subclasses = BaseItemsApi.subclasses + (cls,)
    async def item_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedItemSummaryList:
        """An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area."""
        ...


    async def item_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> ItemDetail:
        """An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area."""
        ...


    async def item_category_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedItemCategorySummaryList:
        """Item categories determine where items will be placed in the players bag."""
        ...


    async def item_category_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> ItemCategoryDetail:
        """Item categories determine where items will be placed in the players bag."""
        ...


    async def item_attribute_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedItemAttributeSummaryList:
        """Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;."""
        ...


    async def item_attribute_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> ItemAttributeDetail:
        """Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;."""
        ...


    async def item_fling_effect_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedItemFlingEffectSummaryList:
        """The various effects of the move\&quot;Fling\&quot; when used with different items."""
        ...


    async def item_fling_effect_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> ItemFlingEffectDetail:
        """The various effects of the move\&quot;Fling\&quot; when used with different items."""
        ...


    async def item_pocket_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedItemPocketSummaryList:
        """Pockets within the players bag used for storing items by category."""
        ...


    async def item_pocket_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> ItemPocketDetail:
        """Pockets within the players bag used for storing items by category."""
        ...
