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

from pydantic import Field
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.machine_detail import MachineDetail
from openapi_server.models.paginated_machine_summary_list import PaginatedMachineSummaryList

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
    limit: Annotated[Optional[int], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
) -> PaginatedMachineSummaryList:
    """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine."""
    if not BaseMachinesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMachinesApi.subclasses[0]().machine_list(limit, offset)


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
    id: Annotated[str, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer.", examples=["1"]),
) -> MachineDetail:
    """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine."""
    if not BaseMachinesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMachinesApi.subclasses[0]().machine_retrieve(id)
