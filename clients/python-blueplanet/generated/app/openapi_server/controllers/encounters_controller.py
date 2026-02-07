import connexion

from app.openapi_server.models.encounter_condition_detail import EncounterConditionDetail  # noqa: E501
from app.openapi_server.models.encounter_condition_value_detail import EncounterConditionValueDetail  # noqa: E501
from app.openapi_server.models.encounter_method_detail import EncounterMethodDetail  # noqa: E501
from app.openapi_server.models.paginated_encounter_condition_summary_list import PaginatedEncounterConditionSummaryList  # noqa: E501
from app.openapi_server.models.paginated_encounter_condition_value_summary_list import PaginatedEncounterConditionValueSummaryList  # noqa: E501
from app.openapi_server.models.paginated_encounter_method_summary_list import PaginatedEncounterMethodSummaryList  # noqa: E501
from openapi_server import util


def encounter_condition_list(limit=None, offset=None, q=None):  # noqa: E501
    """List encounter conditions

    Conditions which affect what pokemon might appear in the wild, e.g., day or night. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedEncounterConditionSummaryList
    """
    return 'do some magic!'


def encounter_condition_retrieve(id):  # noqa: E501
    """Get encounter condition

    Conditions which affect what pokemon might appear in the wild, e.g., day or night. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: EncounterConditionDetail
    """
    return 'do some magic!'


def encounter_condition_value_list(limit=None, offset=None, q=None):  # noqa: E501
    """List encounter condition values

    Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedEncounterConditionValueSummaryList
    """
    return 'do some magic!'


def encounter_condition_value_retrieve(id):  # noqa: E501
    """Get encounter condition value

    Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: EncounterConditionValueDetail
    """
    return 'do some magic!'


def encounter_method_list(limit=None, offset=None, q=None):  # noqa: E501
    """List encounter methods

    Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedEncounterMethodSummaryList
    """
    return 'do some magic!'


def encounter_method_retrieve(id):  # noqa: E501
    """Get encounter method

    Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: EncounterMethodDetail
    """
    return 'do some magic!'
