# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.machines_api_base import BaseMachinesApi
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
from openapi_server.models.machine_detail import MachineDetail
from openapi_server.models.paginated_machine_summary_list import PaginatedMachineSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/machine/",
    responses={
        200: {"model": PaginatedMachineSummaryList, "description": ""},
    },
    tags=["machines"],
    summary="List machines",
    response_model_by_alias=True,
)
async def machine_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMachineSummaryList:
    """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine."""
    if not BaseMachinesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMachinesApi.subclasses[0]().machine_list(limit, offset, q)


@router.get(
    "/api/v2/machine/{id}/",
    responses={
        200: {"model": MachineDetail, "description": ""},
    },
    tags=["machines"],
    summary="Get machine",
    response_model_by_alias=True,
)
async def machine_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MachineDetail:
    """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine."""
    if not BaseMachinesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMachinesApi.subclasses[0]().machine_retrieve(id)
