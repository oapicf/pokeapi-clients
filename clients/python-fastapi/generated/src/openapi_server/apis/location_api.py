# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.location_api_base import BaseLocationApi
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
from openapi_server.models.location_area_detail import LocationAreaDetail
from openapi_server.models.location_detail import LocationDetail
from openapi_server.models.paginated_location_area_summary_list import PaginatedLocationAreaSummaryList
from openapi_server.models.paginated_location_summary_list import PaginatedLocationSummaryList
from openapi_server.models.paginated_pal_park_area_summary_list import PaginatedPalParkAreaSummaryList
from openapi_server.models.paginated_region_summary_list import PaginatedRegionSummaryList
from openapi_server.models.pal_park_area_detail import PalParkAreaDetail
from openapi_server.models.region_detail import RegionDetail

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/location/",
    responses={
        200: {"model": PaginatedLocationSummaryList, "description": ""},
    },
    tags=["location"],
    summary="List locations",
    response_model_by_alias=True,
)
async def location_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedLocationSummaryList:
    """Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().location_list(limit, offset, q)


@router.get(
    "/api/v2/location/{id}/",
    responses={
        200: {"model": LocationDetail, "description": ""},
    },
    tags=["location"],
    summary="Get location",
    response_model_by_alias=True,
)
async def location_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> LocationDetail:
    """Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().location_retrieve(id)


@router.get(
    "/api/v2/location-area/",
    responses={
        200: {"model": PaginatedLocationAreaSummaryList, "description": ""},
    },
    tags=["location"],
    summary="List location areas",
    response_model_by_alias=True,
)
async def location_area_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
) -> PaginatedLocationAreaSummaryList:
    """Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().location_area_list(limit, offset)


@router.get(
    "/api/v2/location-area/{id}/",
    responses={
        200: {"model": LocationAreaDetail, "description": ""},
    },
    tags=["location"],
    summary="Get location area",
    response_model_by_alias=True,
)
async def location_area_retrieve(
    id: Annotated[int, Field(description="A unique integer value identifying this location area.")] = Path(..., description="A unique integer value identifying this location area.", examples=[1]),
) -> LocationAreaDetail:
    """Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().location_area_retrieve(id)


@router.get(
    "/api/v2/pal-park-area/",
    responses={
        200: {"model": PaginatedPalParkAreaSummaryList, "description": ""},
    },
    tags=["location"],
    summary="List pal park areas",
    response_model_by_alias=True,
)
async def pal_park_area_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedPalParkAreaSummaryList:
    """Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().pal_park_area_list(limit, offset, q)


@router.get(
    "/api/v2/pal-park-area/{id}/",
    responses={
        200: {"model": PalParkAreaDetail, "description": ""},
    },
    tags=["location"],
    summary="Get pal park area",
    response_model_by_alias=True,
)
async def pal_park_area_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> PalParkAreaDetail:
    """Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().pal_park_area_retrieve(id)


@router.get(
    "/api/v2/region/",
    responses={
        200: {"model": PaginatedRegionSummaryList, "description": ""},
    },
    tags=["location"],
    summary="List regions",
    response_model_by_alias=True,
)
async def region_list(
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[str], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
) -> PaginatedRegionSummaryList:
    """A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().region_list(limit, offset, q)


@router.get(
    "/api/v2/region/{id}/",
    responses={
        200: {"model": RegionDetail, "description": ""},
    },
    tags=["location"],
    summary="Get region",
    response_model_by_alias=True,
)
async def region_retrieve(
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> RegionDetail:
    """A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them."""
    if not BaseLocationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLocationApi.subclasses[0]().region_retrieve(id)
