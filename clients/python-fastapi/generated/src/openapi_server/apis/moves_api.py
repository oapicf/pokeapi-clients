# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.moves_api_base import BaseMovesApi
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
from openapi_server.models.move_battle_style_detail import MoveBattleStyleDetail
from openapi_server.models.move_detail import MoveDetail
from openapi_server.models.move_learn_method_detail import MoveLearnMethodDetail
from openapi_server.models.move_meta_ailment_detail import MoveMetaAilmentDetail
from openapi_server.models.move_meta_category_detail import MoveMetaCategoryDetail
from openapi_server.models.move_target_detail import MoveTargetDetail
from openapi_server.models.paginated_move_battle_style_summary_list import PaginatedMoveBattleStyleSummaryList
from openapi_server.models.paginated_move_learn_method_summary_list import PaginatedMoveLearnMethodSummaryList
from openapi_server.models.paginated_move_meta_ailment_summary_list import PaginatedMoveMetaAilmentSummaryList
from openapi_server.models.paginated_move_meta_category_summary_list import PaginatedMoveMetaCategorySummaryList
from openapi_server.models.paginated_move_summary_list import PaginatedMoveSummaryList
from openapi_server.models.paginated_move_target_summary_list import PaginatedMoveTargetSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/move/",
    responses={
        200: {"model": PaginatedMoveSummaryList, "description": ""},
    },
    tags=["moves"],
    summary="List moves",
    response_model_by_alias=True,
)
async def move_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMoveSummaryList:
    """Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_list(limit, offset, q)


@router.get(
    "/api/v2/move/{id}/",
    responses={
        200: {"model": MoveDetail, "description": ""},
    },
    tags=["moves"],
    summary="Get move",
    response_model_by_alias=True,
)
async def move_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MoveDetail:
    """Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_retrieve(id)


@router.get(
    "/api/v2/move-ailment/",
    responses={
        200: {"model": PaginatedMoveMetaAilmentSummaryList, "description": ""},
    },
    tags=["moves"],
    summary="List move meta ailments",
    response_model_by_alias=True,
)
async def move_ailment_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMoveMetaAilmentSummaryList:
    """Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_ailment_list(limit, offset, q)


@router.get(
    "/api/v2/move-ailment/{id}/",
    responses={
        200: {"model": MoveMetaAilmentDetail, "description": ""},
    },
    tags=["moves"],
    summary="Get move meta ailment",
    response_model_by_alias=True,
)
async def move_ailment_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MoveMetaAilmentDetail:
    """Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_ailment_retrieve(id)


@router.get(
    "/api/v2/move-battle-style/",
    responses={
        200: {"model": PaginatedMoveBattleStyleSummaryList, "description": ""},
    },
    tags=["moves"],
    summary="List move battle styles",
    response_model_by_alias=True,
)
async def move_battle_style_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMoveBattleStyleSummaryList:
    """Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_battle_style_list(limit, offset, q)


@router.get(
    "/api/v2/move-battle-style/{id}/",
    responses={
        200: {"model": MoveBattleStyleDetail, "description": ""},
    },
    tags=["moves"],
    summary="Get move battle style",
    response_model_by_alias=True,
)
async def move_battle_style_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MoveBattleStyleDetail:
    """Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_battle_style_retrieve(id)


@router.get(
    "/api/v2/move-category/",
    responses={
        200: {"model": PaginatedMoveMetaCategorySummaryList, "description": ""},
    },
    tags=["moves"],
    summary="List move meta categories",
    response_model_by_alias=True,
)
async def move_category_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMoveMetaCategorySummaryList:
    """Very general categories that loosely group move effects."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_category_list(limit, offset, q)


@router.get(
    "/api/v2/move-category/{id}/",
    responses={
        200: {"model": MoveMetaCategoryDetail, "description": ""},
    },
    tags=["moves"],
    summary="Get move meta category",
    response_model_by_alias=True,
)
async def move_category_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MoveMetaCategoryDetail:
    """Very general categories that loosely group move effects."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_category_retrieve(id)


@router.get(
    "/api/v2/move-learn-method/",
    responses={
        200: {"model": PaginatedMoveLearnMethodSummaryList, "description": ""},
    },
    tags=["moves"],
    summary="List move learn methods",
    response_model_by_alias=True,
)
async def move_learn_method_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMoveLearnMethodSummaryList:
    """Methods by which Pokémon can learn moves."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_learn_method_list(limit, offset, q)


@router.get(
    "/api/v2/move-learn-method/{id}/",
    responses={
        200: {"model": MoveLearnMethodDetail, "description": ""},
    },
    tags=["moves"],
    summary="Get move learn method",
    response_model_by_alias=True,
)
async def move_learn_method_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MoveLearnMethodDetail:
    """Methods by which Pokémon can learn moves."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_learn_method_retrieve(id)


@router.get(
    "/api/v2/move-target/",
    responses={
        200: {"model": PaginatedMoveTargetSummaryList, "description": ""},
    },
    tags=["moves"],
    summary="List move targets",
    response_model_by_alias=True,
)
async def move_target_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMoveTargetSummaryList:
    """Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_target_list(limit, offset, q)


@router.get(
    "/api/v2/move-target/{id}/",
    responses={
        200: {"model": MoveTargetDetail, "description": ""},
    },
    tags=["moves"],
    summary="Get move target",
    response_model_by_alias=True,
)
async def move_target_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MoveTargetDetail:
    """Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves."""
    if not BaseMovesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMovesApi.subclasses[0]().move_target_retrieve(id)
