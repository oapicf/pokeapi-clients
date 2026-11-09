import connexion

from app.openapi_server.models.language_detail import LanguageDetail  # noqa: E501
from app.openapi_server.models.paginated_language_summary_list import PaginatedLanguageSummaryList  # noqa: E501
from app.openapi_server.models.pokeapi_meta_response import PokeapiMetaResponse  # noqa: E501
from openapi_server import util


def language_list(limit=None, offset=None, q=None):  # noqa: E501
    """List languages

    Languages for translations of API resource information. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedLanguageSummaryList
    """
    return 'do some magic!'


def language_retrieve(id):  # noqa: E501
    """Get language

    Languages for translations of API resource information. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: LanguageDetail
    """
    return 'do some magic!'


def meta_retrieve():  # noqa: E501
    """Get API metadata

    Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any). # noqa: E501


    :rtype: PokeapiMetaResponse
    """
    return 'do some magic!'
