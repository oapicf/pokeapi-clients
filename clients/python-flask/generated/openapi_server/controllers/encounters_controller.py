import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.encounter_condition_detail import EncounterConditionDetail  # noqa: E501
from openapi_server.models.encounter_condition_value_detail import EncounterConditionValueDetail  # noqa: E501
from openapi_server.models.encounter_method_detail import EncounterMethodDetail  # noqa: E501
from openapi_server.models.paginated_encounter_condition_summary_list import PaginatedEncounterConditionSummaryList  # noqa: E501
from openapi_server.models.paginated_encounter_condition_value_summary_list import PaginatedEncounterConditionValueSummaryList  # noqa: E501
from openapi_server.models.paginated_encounter_method_summary_list import PaginatedEncounterMethodSummaryList  # noqa: E501
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

    :rtype: Union[PaginatedEncounterConditionSummaryList, Tuple[PaginatedEncounterConditionSummaryList, int], Tuple[PaginatedEncounterConditionSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def encounter_condition_retrieve(id):  # noqa: E501
    """Get encounter condition

    Conditions which affect what pokemon might appear in the wild, e.g., day or night. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[EncounterConditionDetail, Tuple[EncounterConditionDetail, int], Tuple[EncounterConditionDetail, int, Dict[str, str]]
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

    :rtype: Union[PaginatedEncounterConditionValueSummaryList, Tuple[PaginatedEncounterConditionValueSummaryList, int], Tuple[PaginatedEncounterConditionValueSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def encounter_condition_value_retrieve(id):  # noqa: E501
    """Get encounter condition value

    Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[EncounterConditionValueDetail, Tuple[EncounterConditionValueDetail, int], Tuple[EncounterConditionValueDetail, int, Dict[str, str]]
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

    :rtype: Union[PaginatedEncounterMethodSummaryList, Tuple[PaginatedEncounterMethodSummaryList, int], Tuple[PaginatedEncounterMethodSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def encounter_method_retrieve(id):  # noqa: E501
    """Get encounter method

    Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[EncounterMethodDetail, Tuple[EncounterMethodDetail, int], Tuple[EncounterMethodDetail, int, Dict[str, str]]
    """
    return 'do some magic!'
