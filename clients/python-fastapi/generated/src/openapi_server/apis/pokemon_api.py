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
from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ability_detail import AbilityDetail
from openapi_server.models.characteristic_detail import CharacteristicDetail
from openapi_server.models.egg_group_detail import EggGroupDetail
from openapi_server.models.gender_detail import GenderDetail
from openapi_server.models.growth_rate_detail import GrowthRateDetail
from openapi_server.models.move_damage_class_detail import MoveDamageClassDetail
from openapi_server.models.nature_detail import NatureDetail
from openapi_server.models.paginated_ability_summary_list import PaginatedAbilitySummaryList
from openapi_server.models.paginated_characteristic_summary_list import PaginatedCharacteristicSummaryList
from openapi_server.models.paginated_egg_group_summary_list import PaginatedEggGroupSummaryList
from openapi_server.models.paginated_gender_summary_list import PaginatedGenderSummaryList
from openapi_server.models.paginated_growth_rate_summary_list import PaginatedGrowthRateSummaryList
from openapi_server.models.paginated_move_damage_class_summary_list import PaginatedMoveDamageClassSummaryList
from openapi_server.models.paginated_nature_summary_list import PaginatedNatureSummaryList
from openapi_server.models.paginated_pokeathlon_stat_summary_list import PaginatedPokeathlonStatSummaryList
from openapi_server.models.paginated_pokemon_color_summary_list import PaginatedPokemonColorSummaryList
from openapi_server.models.paginated_pokemon_form_summary_list import PaginatedPokemonFormSummaryList
from openapi_server.models.paginated_pokemon_habitat_summary_list import PaginatedPokemonHabitatSummaryList
from openapi_server.models.paginated_pokemon_shape_summary_list import PaginatedPokemonShapeSummaryList
from openapi_server.models.paginated_pokemon_species_summary_list import PaginatedPokemonSpeciesSummaryList
from openapi_server.models.paginated_pokemon_summary_list import PaginatedPokemonSummaryList
from openapi_server.models.paginated_stat_summary_list import PaginatedStatSummaryList
from openapi_server.models.paginated_type_summary_list import PaginatedTypeSummaryList
from openapi_server.models.pokeathlon_stat_detail import PokeathlonStatDetail
from openapi_server.models.pokemon_color_detail import PokemonColorDetail
from openapi_server.models.pokemon_detail import PokemonDetail
from openapi_server.models.pokemon_form_detail import PokemonFormDetail
from openapi_server.models.pokemon_habitat_detail import PokemonHabitatDetail
from openapi_server.models.pokemon_shape_detail import PokemonShapeDetail
from openapi_server.models.pokemon_species_detail import PokemonSpeciesDetail
from openapi_server.models.stat_detail import StatDetail
from openapi_server.models.type_detail import TypeDetail
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/v2/ability/",
    responses={
        200: {"model": PaginatedAbilitySummaryList, "description": ""},
    },
    tags=["pokemon"],
    response_model_by_alias=True,
)
async def ability_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedAbilitySummaryList:
    """Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().ability_list(limit, offset, q)


@router.get(
    "/api/v2/ability/{id}/",
    responses={
        200: {"model": AbilityDetail, "description": ""},
    },
    tags=["pokemon"],
    response_model_by_alias=True,
)
async def ability_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> AbilityDetail:
    """Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().ability_retrieve(id)


@router.get(
    "/api/v2/characteristic/",
    responses={
        200: {"model": PaginatedCharacteristicSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List charecterictics",
    response_model_by_alias=True,
)
async def characteristic_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedCharacteristicSummaryList:
    """Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().characteristic_list(limit, offset, q)


@router.get(
    "/api/v2/characteristic/{id}/",
    responses={
        200: {"model": CharacteristicDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get characteristic",
    response_model_by_alias=True,
)
async def characteristic_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> CharacteristicDetail:
    """Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().characteristic_retrieve(id)


@router.get(
    "/api/v2/egg-group/",
    responses={
        200: {"model": PaginatedEggGroupSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List egg groups",
    response_model_by_alias=True,
)
async def egg_group_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedEggGroupSummaryList:
    """Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().egg_group_list(limit, offset, q)


@router.get(
    "/api/v2/egg-group/{id}/",
    responses={
        200: {"model": EggGroupDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get egg group",
    response_model_by_alias=True,
)
async def egg_group_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> EggGroupDetail:
    """Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().egg_group_retrieve(id)


@router.get(
    "/api/v2/gender/",
    responses={
        200: {"model": PaginatedGenderSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List genders",
    response_model_by_alias=True,
)
async def gender_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedGenderSummaryList:
    """Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().gender_list(limit, offset, q)


@router.get(
    "/api/v2/gender/{id}/",
    responses={
        200: {"model": GenderDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get gender",
    response_model_by_alias=True,
)
async def gender_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> GenderDetail:
    """Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().gender_retrieve(id)


@router.get(
    "/api/v2/growth-rate/",
    responses={
        200: {"model": PaginatedGrowthRateSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List growth rates",
    response_model_by_alias=True,
)
async def growth_rate_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedGrowthRateSummaryList:
    """Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().growth_rate_list(limit, offset, q)


@router.get(
    "/api/v2/growth-rate/{id}/",
    responses={
        200: {"model": GrowthRateDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get growth rate",
    response_model_by_alias=True,
)
async def growth_rate_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> GrowthRateDetail:
    """Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().growth_rate_retrieve(id)


@router.get(
    "/api/v2/move-damage-class/",
    responses={
        200: {"model": PaginatedMoveDamageClassSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List move damage classes",
    response_model_by_alias=True,
)
async def move_damage_class_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedMoveDamageClassSummaryList:
    """Damage classes moves can have, e.g. physical, special, or non-damaging."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().move_damage_class_list(limit, offset, q)


@router.get(
    "/api/v2/move-damage-class/{id}/",
    responses={
        200: {"model": MoveDamageClassDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get move damage class",
    response_model_by_alias=True,
)
async def move_damage_class_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> MoveDamageClassDetail:
    """Damage classes moves can have, e.g. physical, special, or non-damaging."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().move_damage_class_retrieve(id)


@router.get(
    "/api/v2/nature/",
    responses={
        200: {"model": PaginatedNatureSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List natures",
    response_model_by_alias=True,
)
async def nature_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedNatureSummaryList:
    """Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().nature_list(limit, offset, q)


@router.get(
    "/api/v2/nature/{id}/",
    responses={
        200: {"model": NatureDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get nature",
    response_model_by_alias=True,
)
async def nature_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> NatureDetail:
    """Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().nature_retrieve(id)


@router.get(
    "/api/v2/pokemon/",
    responses={
        200: {"model": PaginatedPokemonSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List pokemon",
    response_model_by_alias=True,
)
async def pokemon_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokemonSummaryList:
    """Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_list(limit, offset, q)


@router.get(
    "/api/v2/pokemon/{id}/",
    responses={
        200: {"model": PokemonDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get pokemon",
    response_model_by_alias=True,
)
async def pokemon_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokemonDetail:
    """Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_retrieve(id)


@router.get(
    "/api/v2/pokemon-color/",
    responses={
        200: {"model": PaginatedPokemonColorSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List pokemon colors",
    response_model_by_alias=True,
)
async def pokemon_color_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokemonColorSummaryList:
    """Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_color_list(limit, offset, q)


@router.get(
    "/api/v2/pokemon-color/{id}/",
    responses={
        200: {"model": PokemonColorDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get pokemon color",
    response_model_by_alias=True,
)
async def pokemon_color_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokemonColorDetail:
    """Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_color_retrieve(id)


@router.get(
    "/api/v2/pokemon-form/",
    responses={
        200: {"model": PaginatedPokemonFormSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List pokemon forms",
    response_model_by_alias=True,
)
async def pokemon_form_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokemonFormSummaryList:
    """Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_form_list(limit, offset, q)


@router.get(
    "/api/v2/pokemon-form/{id}/",
    responses={
        200: {"model": PokemonFormDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get pokemon form",
    response_model_by_alias=True,
)
async def pokemon_form_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokemonFormDetail:
    """Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_form_retrieve(id)


@router.get(
    "/api/v2/pokemon-habitat/",
    responses={
        200: {"model": PaginatedPokemonHabitatSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List pokemom habitas",
    response_model_by_alias=True,
)
async def pokemon_habitat_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokemonHabitatSummaryList:
    """Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_habitat_list(limit, offset, q)


@router.get(
    "/api/v2/pokemon-habitat/{id}/",
    responses={
        200: {"model": PokemonHabitatDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get pokemom habita",
    response_model_by_alias=True,
)
async def pokemon_habitat_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokemonHabitatDetail:
    """Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_habitat_retrieve(id)


@router.get(
    "/api/v2/pokemon-shape/",
    responses={
        200: {"model": PaginatedPokemonShapeSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List pokemon shapes",
    response_model_by_alias=True,
)
async def pokemon_shape_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokemonShapeSummaryList:
    """Shapes used for sorting Pokémon in a Pokédex."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_shape_list(limit, offset, q)


@router.get(
    "/api/v2/pokemon-shape/{id}/",
    responses={
        200: {"model": PokemonShapeDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get pokemon shape",
    response_model_by_alias=True,
)
async def pokemon_shape_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokemonShapeDetail:
    """Shapes used for sorting Pokémon in a Pokédex."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_shape_retrieve(id)


@router.get(
    "/api/v2/pokemon-species/",
    responses={
        200: {"model": PaginatedPokemonSpeciesSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List pokemon species",
    response_model_by_alias=True,
)
async def pokemon_species_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokemonSpeciesSummaryList:
    """A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_species_list(limit, offset, q)


@router.get(
    "/api/v2/pokemon-species/{id}/",
    responses={
        200: {"model": PokemonSpeciesDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get pokemon species",
    response_model_by_alias=True,
)
async def pokemon_species_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokemonSpeciesDetail:
    """A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokemon_species_retrieve(id)


@router.get(
    "/api/v2/pokeathlon-stat/",
    responses={
        200: {"model": PaginatedPokeathlonStatSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List pokeathlon stats",
    response_model_by_alias=True,
)
async def pokeathlon_stat_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedPokeathlonStatSummaryList:
    """Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokeathlon_stat_list(limit, offset, q)


@router.get(
    "/api/v2/pokeathlon-stat/{id}/",
    responses={
        200: {"model": PokeathlonStatDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get pokeathlon stat",
    response_model_by_alias=True,
)
async def pokeathlon_stat_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PokeathlonStatDetail:
    """Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().pokeathlon_stat_retrieve(id)


@router.get(
    "/api/v2/stat/",
    responses={
        200: {"model": PaginatedStatSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List stats",
    response_model_by_alias=True,
)
async def stat_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedStatSummaryList:
    """Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().stat_list(limit, offset, q)


@router.get(
    "/api/v2/stat/{id}/",
    responses={
        200: {"model": StatDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get stat",
    response_model_by_alias=True,
)
async def stat_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> StatDetail:
    """Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().stat_retrieve(id)


@router.get(
    "/api/v2/type/",
    responses={
        200: {"model": PaginatedTypeSummaryList, "description": ""},
    },
    tags=["pokemon"],
    summary="List types",
    response_model_by_alias=True,
)
async def type_list(
    limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")] = Query(None, description="Number of results to return per page.", alias="limit"),
    offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")] = Query(None, description="The initial index from which to return the results.", alias="offset"),
    q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")] = Query(None, description="&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ", alias="q"),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> PaginatedTypeSummaryList:
    """Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().type_list(limit, offset, q)


@router.get(
    "/api/v2/type/{id}/",
    responses={
        200: {"model": TypeDetail, "description": ""},
    },
    tags=["pokemon"],
    summary="Get types",
    response_model_by_alias=True,
)
async def type_retrieve(
    id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")] = Path(..., description="This parameter can be a string or an integer."),
    token_basicAuth: TokenModel = Security(
        get_token_basicAuth
    ),
    token_cookieAuth: TokenModel = Security(
        get_token_cookieAuth
    ),
) -> TypeDetail:
    """Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against."""
    if not BasePokemonApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePokemonApi.subclasses[0]().type_retrieve(id)
