import connexion

from app.openapi_server.models.contest_effect_detail import ContestEffectDetail  # noqa: E501
from app.openapi_server.models.contest_type_detail import ContestTypeDetail  # noqa: E501
from app.openapi_server.models.paginated_contest_effect_summary_list import PaginatedContestEffectSummaryList  # noqa: E501
from app.openapi_server.models.paginated_contest_type_summary_list import PaginatedContestTypeSummaryList  # noqa: E501
from app.openapi_server.models.paginated_super_contest_effect_summary_list import PaginatedSuperContestEffectSummaryList  # noqa: E501
from app.openapi_server.models.super_contest_effect_detail import SuperContestEffectDetail  # noqa: E501
from openapi_server import util


def contest_effect_list(limit=None, offset=None, q=None):  # noqa: E501
    """List contest effects

    Contest effects refer to the effects of moves when used in contests. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedContestEffectSummaryList
    """
    return 'do some magic!'


def contest_effect_retrieve(id):  # noqa: E501
    """Get contest effect

    Contest effects refer to the effects of moves when used in contests. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: ContestEffectDetail
    """
    return 'do some magic!'


def contest_type_list(limit=None, offset=None, q=None):  # noqa: E501
    """List contest types

    Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedContestTypeSummaryList
    """
    return 'do some magic!'


def contest_type_retrieve(id):  # noqa: E501
    """Get contest type

    Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: ContestTypeDetail
    """
    return 'do some magic!'


def super_contest_effect_list(limit=None, offset=None, q=None):  # noqa: E501
    """List super contest effects

    Super contest effects refer to the effects of moves when used in super contests. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedSuperContestEffectSummaryList
    """
    return 'do some magic!'


def super_contest_effect_retrieve(id):  # noqa: E501
    """Get super contest effect

    Super contest effects refer to the effects of moves when used in super contests. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: SuperContestEffectDetail
    """
    return 'do some magic!'
