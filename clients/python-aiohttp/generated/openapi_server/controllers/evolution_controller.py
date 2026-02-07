from typing import List, Dict
from aiohttp import web

from openapi_server.models.evolution_chain_detail import EvolutionChainDetail
from openapi_server.models.evolution_trigger_detail import EvolutionTriggerDetail
from openapi_server.models.paginated_evolution_chain_summary_list import PaginatedEvolutionChainSummaryList
from openapi_server.models.paginated_evolution_trigger_summary_list import PaginatedEvolutionTriggerSummaryList
from openapi_server import util


async def evolution_chain_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List evolution chains

    Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def evolution_chain_retrieve(request: web.Request, id) -> web.Response:
    """Get evolution chain

    Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def evolution_trigger_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List evolution triggers

    Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def evolution_trigger_retrieve(request: web.Request, id) -> web.Response:
    """Get evolution trigger

    Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
