# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.pokemon_habitat_api_base import BasePokemonHabitatApi
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
    "/api/v2/pokemon-habitat/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["pokemon-habitat"],
    response_model_by_alias=True,
)
async def pokemon_habitat_list(
    limit: int = Query(None, description="", alias="limit"),
    offset: int = Query(None, description="", alias="offset"),
) -> str:
    if not BasePokemonHabitatApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonHabitatApi.subclasses[0]().pokemon_habitat_list(limit, offset)


@router.get(
    "/api/v2/pokemon-habitat/{id}/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["pokemon-habitat"],
    response_model_by_alias=True,
)
async def pokemon_habitat_read(
    id: int = Path(..., description=""),
) -> str:
    if not BasePokemonHabitatApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonHabitatApi.subclasses[0]().pokemon_habitat_read(id)
