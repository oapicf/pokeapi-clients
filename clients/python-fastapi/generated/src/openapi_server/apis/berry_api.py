# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.berry_api_base import BaseBerryApi
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


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/berry/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["berry"],
    response_model_by_alias=True,
)
async def berry_list(
    limit: int = Query(None, description="", alias="limit"),
    offset: int = Query(None, description="", alias="offset"),
) -> str:
    if not BaseBerryApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerryApi.subclasses[0]().berry_list(limit, offset)


@router.get(
    "/api/v2/berry/{id}/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["berry"],
    response_model_by_alias=True,
)
async def berry_read(
    id: int = Path(..., description=""),
) -> str:
    if not BaseBerryApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBerryApi.subclasses[0]().berry_read(id)
