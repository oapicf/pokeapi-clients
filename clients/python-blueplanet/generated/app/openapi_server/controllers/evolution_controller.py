import connexion

from app.openapi_server.models.evolution_chain_detail import EvolutionChainDetail  # noqa: E501
from app.openapi_server.models.evolution_trigger_detail import EvolutionTriggerDetail  # noqa: E501
from app.openapi_server.models.paginated_evolution_chain_summary_list import PaginatedEvolutionChainSummaryList  # noqa: E501
from app.openapi_server.models.paginated_evolution_trigger_summary_list import PaginatedEvolutionTriggerSummaryList  # noqa: E501
from openapi_server import util


def evolution_chain_list(limit=None, offset=None, q=None):  # noqa: E501
    """List evolution chains

    Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedEvolutionChainSummaryList
    """
    return 'do some magic!'


def evolution_chain_retrieve(id):  # noqa: E501
    """Get evolution chain

    Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: EvolutionChainDetail
    """
    return 'do some magic!'


def evolution_trigger_list(limit=None, offset=None, q=None):  # noqa: E501
    """List evolution triggers

    Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedEvolutionTriggerSummaryList
    """
    return 'do some magic!'


def evolution_trigger_retrieve(id):  # noqa: E501
    """Get evolution trigger

    Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: EvolutionTriggerDetail
    """
    return 'do some magic!'
