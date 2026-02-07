# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.berries_api_base import BaseBerriesApi
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

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.berry_detail import BerryDetail
from openapi_server.models.berry_firmness_detail import BerryFirmnessDetail
from openapi_server.models.berry_flavor_detail import BerryFlavorDetail
from openapi_server.models.paginated_berry_firmness_summary_list import PaginatedBerryFirmnessSummaryList
from openapi_server.models.paginated_berry_flavor_summary_list import PaginatedBerryFlavorSummaryList
from openapi_server.models.paginated_berry_summary_list import PaginatedBerrySummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/berry/",
    responses={
        200: {"model": PaginatedBerrySummaryList, "description": ""},
    },
    tags=["berries"],
    summary="List berries",
    response_model_by_alias=True,
)
async def berry_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedBerrySummaryList:
    """Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail."""
    if not BaseBerriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerriesApi.subclasses[0]().berry_list(limit, offset, q)


@router.get(
    "/api/v2/berry/{id}/",
    responses={
        200: {"model": BerryDetail, "description": ""},
    },
    tags=["berries"],
    summary="Get a berry",
    response_model_by_alias=True,
)
async def berry_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> BerryDetail:
    """Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail."""
    if not BaseBerriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerriesApi.subclasses[0]().berry_retrieve(id)


@router.get(
    "/api/v2/berry-firmness/",
    responses={
        200: {"model": PaginatedBerryFirmnessSummaryList, "description": ""},
    },
    tags=["berries"],
    summary="List berry firmness",
    response_model_by_alias=True,
)
async def berry_firmness_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedBerryFirmnessSummaryList:
    """Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail."""
    if not BaseBerriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerriesApi.subclasses[0]().berry_firmness_list(limit, offset, q)


@router.get(
    "/api/v2/berry-firmness/{id}/",
    responses={
        200: {"model": BerryFirmnessDetail, "description": ""},
    },
    tags=["berries"],
    summary="Get berry by firmness",
    response_model_by_alias=True,
)
async def berry_firmness_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> BerryFirmnessDetail:
    """Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail."""
    if not BaseBerriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerriesApi.subclasses[0]().berry_firmness_retrieve(id)


@router.get(
    "/api/v2/berry-flavor/",
    responses={
        200: {"model": PaginatedBerryFlavorSummaryList, "description": ""},
    },
    tags=["berries"],
    summary="List berry flavors",
    response_model_by_alias=True,
)
async def berry_flavor_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedBerryFlavorSummaryList:
    """Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail."""
    if not BaseBerriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerriesApi.subclasses[0]().berry_flavor_list(limit, offset, q)


@router.get(
    "/api/v2/berry-flavor/{id}/",
    responses={
        200: {"model": BerryFlavorDetail, "description": ""},
    },
    tags=["berries"],
    summary="Get berries by flavor",
    response_model_by_alias=True,
)
async def berry_flavor_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> BerryFlavorDetail:
    """Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail."""
    if not BaseBerriesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerriesApi.subclasses[0]().berry_flavor_retrieve(id)
