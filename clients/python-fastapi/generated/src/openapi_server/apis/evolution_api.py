# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.evolution_api_base import BaseEvolutionApi
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
from openapi_server.models.evolution_chain_detail import EvolutionChainDetail
from openapi_server.models.evolution_trigger_detail import EvolutionTriggerDetail
from openapi_server.models.paginated_evolution_chain_summary_list import PaginatedEvolutionChainSummaryList
from openapi_server.models.paginated_evolution_trigger_summary_list import PaginatedEvolutionTriggerSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/evolution-chain/",
    responses={
        200: {"model": PaginatedEvolutionChainSummaryList, "description": ""},
    },
    tags=["evolution"],
    summary="List evolution chains",
    response_model_by_alias=True,
)
async def evolution_chain_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedEvolutionChainSummaryList:
    """Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy."""
    if not BaseEvolutionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEvolutionApi.subclasses[0]().evolution_chain_list(limit, offset, q)


@router.get(
    "/api/v2/evolution-chain/{id}/",
    responses={
        200: {"model": EvolutionChainDetail, "description": ""},
    },
    tags=["evolution"],
    summary="Get evolution chain",
    response_model_by_alias=True,
)
async def evolution_chain_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> EvolutionChainDetail:
    """Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy."""
    if not BaseEvolutionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEvolutionApi.subclasses[0]().evolution_chain_retrieve(id)


@router.get(
    "/api/v2/evolution-trigger/",
    responses={
        200: {"model": PaginatedEvolutionTriggerSummaryList, "description": ""},
    },
    tags=["evolution"],
    summary="List evolution triggers",
    response_model_by_alias=True,
)
async def evolution_trigger_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedEvolutionTriggerSummaryList:
    """Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail."""
    if not BaseEvolutionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEvolutionApi.subclasses[0]().evolution_trigger_list(limit, offset, q)


@router.get(
    "/api/v2/evolution-trigger/{id}/",
    responses={
        200: {"model": EvolutionTriggerDetail, "description": ""},
    },
    tags=["evolution"],
    summary="Get evolution trigger",
    response_model_by_alias=True,
)
async def evolution_trigger_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> EvolutionTriggerDetail:
    """Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail."""
    if not BaseEvolutionApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseEvolutionApi.subclasses[0]().evolution_trigger_retrieve(id)
