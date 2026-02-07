import connexion

from app.openapi_server.models.machine_detail import MachineDetail  # noqa: E501
from app.openapi_server.models.paginated_machine_summary_list import PaginatedMachineSummaryList  # noqa: E501
from openapi_server import util


def machine_list(limit=None, offset=None, q=None):  # noqa: E501
    """List machines

    Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedMachineSummaryList
    """
    return 'do some magic!'


def machine_retrieve(id):  # noqa: E501
    """Get machine

    Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: MachineDetail
    """
    return 'do some magic!'
