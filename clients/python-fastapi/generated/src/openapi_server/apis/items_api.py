# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.items_api_base import BaseItemsApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from pydantic import Field
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.currency_detail import CurrencyDetail
from openapi_server.models.item_attribute_detail import ItemAttributeDetail
from openapi_server.models.item_category_detail import ItemCategoryDetail
from openapi_server.models.item_detail import ItemDetail
from openapi_server.models.item_fling_effect_detail import ItemFlingEffectDetail
from openapi_server.models.item_pocket_detail import ItemPocketDetail
from openapi_server.models.paginated_currency_summary_list import PaginatedCurrencySummaryList
from openapi_server.models.paginated_item_attribute_summary_list import PaginatedItemAttributeSummaryList
from openapi_server.models.paginated_item_category_summary_list import PaginatedItemCategorySummaryList
from openapi_server.models.paginated_item_fling_effect_summary_list import PaginatedItemFlingEffectSummaryList
from openapi_server.models.paginated_item_pocket_summary_list import PaginatedItemPocketSummaryList
from openapi_server.models.paginated_item_summary_list import PaginatedItemSummaryList

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/item/",
    responses={
        200: {"model": PaginatedItemSummaryList, "description": ""},
    },
    tags=["items"],
    summary="List items",
    response_model_by_alias=True,
)
async def item_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedItemSummaryList:
    """An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_list(limit, offset, q)


@router.get(
    "/api/v2/item/{id}/",
    responses={
        200: {"model": ItemDetail, "description": ""},
    },
    tags=["items"],
    summary="Get item",
    response_model_by_alias=True,
)
async def item_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> ItemDetail:
    """An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_retrieve(id)


@router.get(
    "/api/v2/item-category/",
    responses={
        200: {"model": PaginatedItemCategorySummaryList, "description": ""},
    },
    tags=["items"],
    summary="List item categories",
    response_model_by_alias=True,
)
async def item_category_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedItemCategorySummaryList:
    """Item categories determine where items will be placed in the players bag."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_category_list(limit, offset, q)


@router.get(
    "/api/v2/item-category/{id}/",
    responses={
        200: {"model": ItemCategoryDetail, "description": ""},
    },
    tags=["items"],
    summary="Get item category",
    response_model_by_alias=True,
)
async def item_category_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> ItemCategoryDetail:
    """Item categories determine where items will be placed in the players bag."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_category_retrieve(id)


@router.get(
    "/api/v2/item-attribute/",
    responses={
        200: {"model": PaginatedItemAttributeSummaryList, "description": ""},
    },
    tags=["items"],
    summary="List item attributes",
    response_model_by_alias=True,
)
async def item_attribute_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedItemAttributeSummaryList:
    """Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_attribute_list(limit, offset, q)


@router.get(
    "/api/v2/item-attribute/{id}/",
    responses={
        200: {"model": ItemAttributeDetail, "description": ""},
    },
    tags=["items"],
    summary="Get item attribute",
    response_model_by_alias=True,
)
async def item_attribute_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> ItemAttributeDetail:
    """Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_attribute_retrieve(id)


@router.get(
    "/api/v2/item-fling-effect/",
    responses={
        200: {"model": PaginatedItemFlingEffectSummaryList, "description": ""},
    },
    tags=["items"],
    summary="List item fling effects",
    response_model_by_alias=True,
)
async def item_fling_effect_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedItemFlingEffectSummaryList:
    """The various effects of the move\&quot;Fling\&quot; when used with different items."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_fling_effect_list(limit, offset, q)


@router.get(
    "/api/v2/item-fling-effect/{id}/",
    responses={
        200: {"model": ItemFlingEffectDetail, "description": ""},
    },
    tags=["items"],
    summary="Get item fling effect",
    response_model_by_alias=True,
)
async def item_fling_effect_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> ItemFlingEffectDetail:
    """The various effects of the move\&quot;Fling\&quot; when used with different items."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_fling_effect_retrieve(id)


@router.get(
    "/api/v2/item-pocket/",
    responses={
        200: {"model": PaginatedItemPocketSummaryList, "description": ""},
    },
    tags=["items"],
    summary="List item pockets",
    response_model_by_alias=True,
)
async def item_pocket_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedItemPocketSummaryList:
    """Pockets within the players bag used for storing items by category."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_pocket_list(limit, offset, q)


@router.get(
    "/api/v2/item-pocket/{id}/",
    responses={
        200: {"model": ItemPocketDetail, "description": ""},
    },
    tags=["items"],
    summary="Get item pocket",
    response_model_by_alias=True,
)
async def item_pocket_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> ItemPocketDetail:
    """Pockets within the players bag used for storing items by category."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().item_pocket_retrieve(id)


@router.get(
    "/api/v2/currency/",
    responses={
        200: {"model": PaginatedCurrencySummaryList, "description": ""},
    },
    tags=["items"],
    summary="List currencies",
    response_model_by_alias=True,
)
async def currency_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedCurrencySummaryList:
    """Currencies used to buy items."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().currency_list(limit, offset, q)


@router.get(
    "/api/v2/currency/{id}/",
    responses={
        200: {"model": CurrencyDetail, "description": ""},
    },
    tags=["items"],
    summary="Get currency",
    response_model_by_alias=True,
)
async def currency_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> CurrencyDetail:
    """Currencies used to buy items."""
    if not BaseItemsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseItemsApi.subclasses[0]().currency_retrieve(id)
