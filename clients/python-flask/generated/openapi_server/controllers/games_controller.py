import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.generation_detail import GenerationDetail  # noqa: E501
from openapi_server.models.paginated_generation_summary_list import PaginatedGenerationSummaryList  # noqa: E501
from openapi_server.models.paginated_pokedex_summary_list import PaginatedPokedexSummaryList  # noqa: E501
from openapi_server.models.paginated_version_group_summary_list import PaginatedVersionGroupSummaryList  # noqa: E501
from openapi_server.models.paginated_version_summary_list import PaginatedVersionSummaryList  # noqa: E501
from openapi_server.models.pokedex_detail import PokedexDetail  # noqa: E501
from openapi_server.models.version_detail import VersionDetail  # noqa: E501
from openapi_server.models.version_group_detail import VersionGroupDetail  # noqa: E501
from openapi_server import util


def generation_list(limit=None, offset=None, q=None):  # noqa: E501
    """List genrations

    A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedGenerationSummaryList, Tuple[PaginatedGenerationSummaryList, int], Tuple[PaginatedGenerationSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def generation_retrieve(id):  # noqa: E501
    """Get genration

    A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[GenerationDetail, Tuple[GenerationDetail, int], Tuple[GenerationDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokedex_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pokedex

    A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPokedexSummaryList, Tuple[PaginatedPokedexSummaryList, int], Tuple[PaginatedPokedexSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pokedex_retrieve(id):  # noqa: E501
    """Get pokedex

    A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PokedexDetail, Tuple[PokedexDetail, int], Tuple[PokedexDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def version_group_list(limit=None, offset=None, q=None):  # noqa: E501
    """List version groups

    Version groups categorize highly similar versions of the games. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedVersionGroupSummaryList, Tuple[PaginatedVersionGroupSummaryList, int], Tuple[PaginatedVersionGroupSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def version_group_retrieve(id):  # noqa: E501
    """Get version group

    Version groups categorize highly similar versions of the games. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[VersionGroupDetail, Tuple[VersionGroupDetail, int], Tuple[VersionGroupDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def version_list(limit=None, offset=None, q=None):  # noqa: E501
    """List versions

    Versions of the games, e.g., Red, Blue or Yellow. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedVersionSummaryList, Tuple[PaginatedVersionSummaryList, int], Tuple[PaginatedVersionSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def version_retrieve(id):  # noqa: E501
    """Get version

    Versions of the games, e.g., Red, Blue or Yellow. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[VersionDetail, Tuple[VersionDetail, int], Tuple[VersionDetail, int, Dict[str, str]]
    """
    return 'do some magic!'
