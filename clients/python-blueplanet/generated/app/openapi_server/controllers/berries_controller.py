import connexion

from app.openapi_server.models.berry_detail import BerryDetail  # noqa: E501
from app.openapi_server.models.berry_firmness_detail import BerryFirmnessDetail  # noqa: E501
from app.openapi_server.models.berry_flavor_detail import BerryFlavorDetail  # noqa: E501
from app.openapi_server.models.paginated_berry_firmness_summary_list import PaginatedBerryFirmnessSummaryList  # noqa: E501
from app.openapi_server.models.paginated_berry_flavor_summary_list import PaginatedBerryFlavorSummaryList  # noqa: E501
from app.openapi_server.models.paginated_berry_summary_list import PaginatedBerrySummaryList  # noqa: E501
from openapi_server import util


def berry_firmness_list(limit=None, offset=None, q=None):  # noqa: E501
    """List berry firmness

    Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedBerryFirmnessSummaryList
    """
    return 'do some magic!'


def berry_firmness_retrieve(id):  # noqa: E501
    """Get berry by firmness

    Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: BerryFirmnessDetail
    """
    return 'do some magic!'


def berry_flavor_list(limit=None, offset=None, q=None):  # noqa: E501
    """List berry flavors

    Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedBerryFlavorSummaryList
    """
    return 'do some magic!'


def berry_flavor_retrieve(id):  # noqa: E501
    """Get berries by flavor

    Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: BerryFlavorDetail
    """
    return 'do some magic!'


def berry_list(limit=None, offset=None, q=None):  # noqa: E501
    """List berries

    Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedBerrySummaryList
    """
    return 'do some magic!'


def berry_retrieve(id):  # noqa: E501
    """Get a berry

    Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: BerryDetail
    """
    return 'do some magic!'
