# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.games_api_base import BaseGamesApi
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
from openapi_server.models.generation_detail import GenerationDetail
from openapi_server.models.paginated_generation_summary_list import PaginatedGenerationSummaryList
from openapi_server.models.paginated_pokedex_summary_list import PaginatedPokedexSummaryList
from openapi_server.models.paginated_version_group_summary_list import PaginatedVersionGroupSummaryList
from openapi_server.models.paginated_version_summary_list import PaginatedVersionSummaryList
from openapi_server.models.pokedex_detail import PokedexDetail
from openapi_server.models.version_detail import VersionDetail
from openapi_server.models.version_group_detail import VersionGroupDetail
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/generation/",
    responses={
        200: {"model": PaginatedGenerationSummaryList, "description": ""},
    },
    tags=["games"],
    summary="List genrations",
    response_model_by_alias=True,
)
async def generation_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedGenerationSummaryList:
    """A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().generation_list(limit, offset, q)


@router.get(
    "/api/v2/generation/{id}/",
    responses={
        200: {"model": GenerationDetail, "description": ""},
    },
    tags=["games"],
    summary="Get genration",
    response_model_by_alias=True,
)
async def generation_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> GenerationDetail:
    """A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().generation_retrieve(id)


@router.get(
    "/api/v2/pokedex/",
    responses={
        200: {"model": PaginatedPokedexSummaryList, "description": ""},
    },
    tags=["games"],
    summary="List pokedex",
    response_model_by_alias=True,
)
async def pokedex_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokedexSummaryList:
    """A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().pokedex_list(limit, offset, q)


@router.get(
    "/api/v2/pokedex/{id}/",
    responses={
        200: {"model": PokedexDetail, "description": ""},
    },
    tags=["games"],
    summary="Get pokedex",
    response_model_by_alias=True,
)
async def pokedex_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokedexDetail:
    """A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().pokedex_retrieve(id)


@router.get(
    "/api/v2/version/",
    responses={
        200: {"model": PaginatedVersionSummaryList, "description": ""},
    },
    tags=["games"],
    summary="List versions",
    response_model_by_alias=True,
)
async def version_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedVersionSummaryList:
    """Versions of the games, e.g., Red, Blue or Yellow."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().version_list(limit, offset, q)


@router.get(
    "/api/v2/version/{id}/",
    responses={
        200: {"model": VersionDetail, "description": ""},
    },
    tags=["games"],
    summary="Get version",
    response_model_by_alias=True,
)
async def version_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> VersionDetail:
    """Versions of the games, e.g., Red, Blue or Yellow."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().version_retrieve(id)


@router.get(
    "/api/v2/version-group/",
    responses={
        200: {"model": PaginatedVersionGroupSummaryList, "description": ""},
    },
    tags=["games"],
    summary="List version groups",
    response_model_by_alias=True,
)
async def version_group_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedVersionGroupSummaryList:
    """Version groups categorize highly similar versions of the games."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().version_group_list(limit, offset, q)


@router.get(
    "/api/v2/version-group/{id}/",
    responses={
        200: {"model": VersionGroupDetail, "description": ""},
    },
    tags=["games"],
    summary="Get version group",
    response_model_by_alias=True,
)
async def version_group_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> VersionGroupDetail:
    """Version groups categorize highly similar versions of the games."""
    if not BaseGamesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGamesApi.subclasses[0]().version_group_retrieve(id)
