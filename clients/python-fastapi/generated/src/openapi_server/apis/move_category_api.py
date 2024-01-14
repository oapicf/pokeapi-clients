# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.move_category_api_base import BaseMoveCategoryApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
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
    "/api/v2/move-category/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["move-category"],
    response_model_by_alias=True,
)
async def move_category_list(
    limit: int = Query(None, description="", alias="limit"),
    offset: int = Query(None, description="", alias="offset"),
) -> str:
    ...


@router.get(
    "/api/v2/move-category/{id}/",
    responses={
        200: {"model": str, "description": "Default response"},
    },
    tags=["move-category"],
    response_model_by_alias=True,
)
async def move_category_read(
    id: int = Path(None, description=""),
) -> str:
    ...
