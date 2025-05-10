# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.evolution_chain_api_base import BaseEvolutionChainApi
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
from pydantic import StrictInt, StrictStr
from typing import Optional


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/evolution-chain/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["evolution-chain"],
    response_model_by_alias=True,
)
async def evolution_chain_list(
    limit: Optional[StrictInt] = Query(None, description="", alias="limit"),
    offset: Optional[StrictInt] = Query(None, description="", alias="offset"),
) -> str:
    if not BaseEvolutionChainApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEvolutionChainApi.subclasses[0]().evolution_chain_list(limit, offset)


@router.get(
    "/api/v2/evolution-chain/{id}/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["evolution-chain"],
    response_model_by_alias=True,
)
async def evolution_chain_read(
    id: StrictInt = Path(..., description=""),
) -> str:
    if not BaseEvolutionChainApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEvolutionChainApi.subclasses[0]().evolution_chain_read(id)
