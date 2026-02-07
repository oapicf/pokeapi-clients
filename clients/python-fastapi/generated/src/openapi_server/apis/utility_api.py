# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.utility_api_base import BaseUtilityApi
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
from openapi_server.models.language_detail import LanguageDetail
from openapi_server.models.paginated_language_summary_list import PaginatedLanguageSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/language/",
    responses={
        200: {"model": PaginatedLanguageSummaryList, "description": ""},
    },
    tags=["utility"],
    summary="List languages",
    response_model_by_alias=True,
)
async def language_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedLanguageSummaryList:
    """Languages for translations of API resource information."""
    if not BaseUtilityApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUtilityApi.subclasses[0]().language_list(limit, offset, q)


@router.get(
    "/api/v2/language/{id}/",
    responses={
        200: {"model": LanguageDetail, "description": ""},
    },
    tags=["utility"],
    summary="Get language",
    response_model_by_alias=True,
)
async def language_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> LanguageDetail:
    """Languages for translations of API resource information."""
    if not BaseUtilityApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUtilityApi.subclasses[0]().language_retrieve(id)
