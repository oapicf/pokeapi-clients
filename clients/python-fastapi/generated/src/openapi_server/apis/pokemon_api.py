# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.pokemon_api_base import BasePokemonApi
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
    "/api/v2/pokemon/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["pokemon"],
    response_model_by_alias=True,
)
async def pokemon_list(
    limit: int = Query(None, description="", alias="limit"),
    offset: int = Query(None, description="", alias="offset"),
) -> str:
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_list(limit, offset)


@router.get(
    "/api/v2/pokemon/{id}/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["pokemon"],
    response_model_by_alias=True,
)
async def pokemon_read(
    id: int = Path(..., description=""),
) -> str:
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_read(id)
