# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.version_group_api_base import BaseVersionGroupApi
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
    "/api/v2/version-group/",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["version-group"],
    response_model_by_alias=True,
)
async def version_group_list(
    limit: Optional[StrictInt] = Query(None, description="", alias="limit"),
    offset: Optional[StrictInt] = Query(None, description="", alias="offset"),
) -> str:
    if not BaseVersionGroupApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVersionGroupApi.subclasses[0]().version_group_list(limit, offset)


@router.get(
    "/api/v2/version-group/{id}/",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["version-group"],
    response_model_by_alias=True,
)
async def version_group_read(
    id: StrictInt = Path(..., description=""),
) -> str:
    if not BaseVersionGroupApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVersionGroupApi.subclasses[0]().version_group_read(id)
