# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.contests_api_base import BaseContestsApi
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
from openapi_server.models.contest_effect_detail import ContestEffectDetail
from openapi_server.models.contest_type_detail import ContestTypeDetail
from openapi_server.models.paginated_contest_effect_summary_list import PaginatedContestEffectSummaryList
from openapi_server.models.paginated_contest_type_summary_list import PaginatedContestTypeSummaryList
from openapi_server.models.paginated_super_contest_effect_summary_list import PaginatedSuperContestEffectSummaryList
from openapi_server.models.super_contest_effect_detail import SuperContestEffectDetail
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/contest-type/",
    responses={
        200: {"model": PaginatedContestTypeSummaryList, "description": ""},
    },
    tags=["contests"],
    summary="List contest types",
    response_model_by_alias=True,
)
async def contest_type_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedContestTypeSummaryList:
    """Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail."""
    if not BaseContestsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContestsApi.subclasses[0]().contest_type_list(limit, offset, q)


@router.get(
    "/api/v2/contest-type/{id}/",
    responses={
        200: {"model": ContestTypeDetail, "description": ""},
    },
    tags=["contests"],
    summary="Get contest type",
    response_model_by_alias=True,
)
async def contest_type_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> ContestTypeDetail:
    """Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail."""
    if not BaseContestsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContestsApi.subclasses[0]().contest_type_retrieve(id)


@router.get(
    "/api/v2/contest-effect/",
    responses={
        200: {"model": PaginatedContestEffectSummaryList, "description": ""},
    },
    tags=["contests"],
    summary="List contest effects",
    response_model_by_alias=True,
)
async def contest_effect_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedContestEffectSummaryList:
    """Contest effects refer to the effects of moves when used in contests."""
    if not BaseContestsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContestsApi.subclasses[0]().contest_effect_list(limit, offset, q)


@router.get(
    "/api/v2/contest-effect/{id}/",
    responses={
        200: {"model": ContestEffectDetail, "description": ""},
    },
    tags=["contests"],
    summary="Get contest effect",
    response_model_by_alias=True,
)
async def contest_effect_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> ContestEffectDetail:
    """Contest effects refer to the effects of moves when used in contests."""
    if not BaseContestsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContestsApi.subclasses[0]().contest_effect_retrieve(id)


@router.get(
    "/api/v2/super-contest-effect/",
    responses={
        200: {"model": PaginatedSuperContestEffectSummaryList, "description": ""},
    },
    tags=["contests"],
    summary="List super contest effects",
    response_model_by_alias=True,
)
async def super_contest_effect_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedSuperContestEffectSummaryList:
    """Super contest effects refer to the effects of moves when used in super contests."""
    if not BaseContestsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContestsApi.subclasses[0]().super_contest_effect_list(limit, offset, q)


@router.get(
    "/api/v2/super-contest-effect/{id}/",
    responses={
        200: {"model": SuperContestEffectDetail, "description": ""},
    },
    tags=["contests"],
    summary="Get super contest effect",
    response_model_by_alias=True,
)
async def super_contest_effect_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> SuperContestEffectDetail:
    """Super contest effects refer to the effects of moves when used in super contests."""
    if not BaseContestsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContestsApi.subclasses[0]().super_contest_effect_retrieve(id)
