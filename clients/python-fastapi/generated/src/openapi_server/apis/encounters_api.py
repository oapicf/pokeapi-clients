# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.encounters_api_base import BaseEncountersApi
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
from openapi_server.models.encounter_condition_detail import EncounterConditionDetail
from openapi_server.models.encounter_condition_value_detail import EncounterConditionValueDetail
from openapi_server.models.encounter_method_detail import EncounterMethodDetail
from openapi_server.models.paginated_encounter_condition_summary_list import PaginatedEncounterConditionSummaryList
from openapi_server.models.paginated_encounter_condition_value_summary_list import PaginatedEncounterConditionValueSummaryList
from openapi_server.models.paginated_encounter_method_summary_list import PaginatedEncounterMethodSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/encounter-method/",
    responses={
        200: {"model": PaginatedEncounterMethodSummaryList, "description": ""},
    },
    tags=["encounters"],
    summary="List encounter methods",
    response_model_by_alias=True,
)
async def encounter_method_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedEncounterMethodSummaryList:
    """Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail."""
    if not BaseEncountersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEncountersApi.subclasses[0]().encounter_method_list(limit, offset, q)


@router.get(
    "/api/v2/encounter-method/{id}/",
    responses={
        200: {"model": EncounterMethodDetail, "description": ""},
    },
    tags=["encounters"],
    summary="Get encounter method",
    response_model_by_alias=True,
)
async def encounter_method_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> EncounterMethodDetail:
    """Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail."""
    if not BaseEncountersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEncountersApi.subclasses[0]().encounter_method_retrieve(id)


@router.get(
    "/api/v2/encounter-condition/",
    responses={
        200: {"model": PaginatedEncounterConditionSummaryList, "description": ""},
    },
    tags=["encounters"],
    summary="List encounter conditions",
    response_model_by_alias=True,
)
async def encounter_condition_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedEncounterConditionSummaryList:
    """Conditions which affect what pokemon might appear in the wild, e.g., day or night."""
    if not BaseEncountersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEncountersApi.subclasses[0]().encounter_condition_list(limit, offset, q)


@router.get(
    "/api/v2/encounter-condition/{id}/",
    responses={
        200: {"model": EncounterConditionDetail, "description": ""},
    },
    tags=["encounters"],
    summary="Get encounter condition",
    response_model_by_alias=True,
)
async def encounter_condition_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> EncounterConditionDetail:
    """Conditions which affect what pokemon might appear in the wild, e.g., day or night."""
    if not BaseEncountersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEncountersApi.subclasses[0]().encounter_condition_retrieve(id)


@router.get(
    "/api/v2/encounter-condition-value/",
    responses={
        200: {"model": PaginatedEncounterConditionValueSummaryList, "description": ""},
    },
    tags=["encounters"],
    summary="List encounter condition values",
    response_model_by_alias=True,
)
async def encounter_condition_value_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedEncounterConditionValueSummaryList:
    """Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night."""
    if not BaseEncountersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEncountersApi.subclasses[0]().encounter_condition_value_list(limit, offset, q)


@router.get(
    "/api/v2/encounter-condition-value/{id}/",
    responses={
        200: {"model": EncounterConditionValueDetail, "description": ""},
    },
    tags=["encounters"],
    summary="Get encounter condition value",
    response_model_by_alias=True,
)
async def encounter_condition_value_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> EncounterConditionValueDetail:
    """Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night."""
    if not BaseEncountersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEncountersApi.subclasses[0]().encounter_condition_value_retrieve(id)
