from typing import List, Dict
from aiohttp import web

from openapi_server.models.encounter_condition_detail import EncounterConditionDetail
from openapi_server.models.encounter_condition_value_detail import EncounterConditionValueDetail
from openapi_server.models.encounter_method_detail import EncounterMethodDetail
from openapi_server.models.paginated_encounter_condition_summary_list import PaginatedEncounterConditionSummaryList
from openapi_server.models.paginated_encounter_condition_value_summary_list import PaginatedEncounterConditionValueSummaryList
from openapi_server.models.paginated_encounter_method_summary_list import PaginatedEncounterMethodSummaryList
from openapi_server import util


async def encounter_condition_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List encounter conditions

    Conditions which affect what pokemon might appear in the wild, e.g., day or night.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def encounter_condition_retrieve(request: web.Request, id) -> web.Response:
    """Get encounter condition

    Conditions which affect what pokemon might appear in the wild, e.g., day or night.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def encounter_condition_value_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List encounter condition values

    Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def encounter_condition_value_retrieve(request: web.Request, id) -> web.Response:
    """Get encounter condition value

    Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def encounter_method_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List encounter methods

    Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def encounter_method_retrieve(request: web.Request, id) -> web.Response:
    """Get encounter method

    Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
