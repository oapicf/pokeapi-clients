import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.location_area_detail import LocationAreaDetail  # noqa: E501
from openapi_server.models.location_detail import LocationDetail  # noqa: E501
from openapi_server.models.paginated_location_area_summary_list import PaginatedLocationAreaSummaryList  # noqa: E501
from openapi_server.models.paginated_location_summary_list import PaginatedLocationSummaryList  # noqa: E501
from openapi_server.models.paginated_pal_park_area_summary_list import PaginatedPalParkAreaSummaryList  # noqa: E501
from openapi_server.models.paginated_region_summary_list import PaginatedRegionSummaryList  # noqa: E501
from openapi_server.models.pal_park_area_detail import PalParkAreaDetail  # noqa: E501
from openapi_server.models.region_detail import RegionDetail  # noqa: E501
from openapi_server import util


def location_area_list(limit=None, offset=None):  # noqa: E501
    """List location areas

    Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int

    :rtype: Union[PaginatedLocationAreaSummaryList, Tuple[PaginatedLocationAreaSummaryList, int], Tuple[PaginatedLocationAreaSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def location_area_retrieve(id):  # noqa: E501
    """Get location area

    Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. # noqa: E501

    :param id: A unique integer value identifying this location area.
    :type id: int

    :rtype: Union[LocationAreaDetail, Tuple[LocationAreaDetail, int], Tuple[LocationAreaDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def location_list(limit=None, offset=None, q=None):  # noqa: E501
    """List locations

    Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedLocationSummaryList, Tuple[PaginatedLocationSummaryList, int], Tuple[PaginatedLocationSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def location_retrieve(id):  # noqa: E501
    """Get location

    Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[LocationDetail, Tuple[LocationDetail, int], Tuple[LocationDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def pal_park_area_list(limit=None, offset=None, q=None):  # noqa: E501
    """List pal park areas

    Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedPalParkAreaSummaryList, Tuple[PaginatedPalParkAreaSummaryList, int], Tuple[PaginatedPalParkAreaSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def pal_park_area_retrieve(id):  # noqa: E501
    """Get pal park area

    Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[PalParkAreaDetail, Tuple[PalParkAreaDetail, int], Tuple[PalParkAreaDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def region_list(limit=None, offset=None, q=None):  # noqa: E501
    """List regions

    A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: Union[PaginatedRegionSummaryList, Tuple[PaginatedRegionSummaryList, int], Tuple[PaginatedRegionSummaryList, int, Dict[str, str]]
    """
    return 'do some magic!'


def region_retrieve(id):  # noqa: E501
    """Get region

    A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: Union[RegionDetail, Tuple[RegionDetail, int], Tuple[RegionDetail, int, Dict[str, str]]
    """
    return 'do some magic!'
