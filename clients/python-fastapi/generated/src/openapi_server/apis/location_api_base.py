# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.location_area_detail import LocationAreaDetail
from openapi_server.models.location_detail import LocationDetail
from openapi_server.models.paginated_location_area_summary_list import PaginatedLocationAreaSummaryList
from openapi_server.models.paginated_location_summary_list import PaginatedLocationSummaryList
from openapi_server.models.paginated_pal_park_area_summary_list import PaginatedPalParkAreaSummaryList
from openapi_server.models.paginated_region_summary_list import PaginatedRegionSummaryList
from openapi_server.models.pal_park_area_detail import PalParkAreaDetail
from openapi_server.models.region_detail import RegionDetail
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

class BaseLocationApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLocationApi.subclasses = BaseLocationApi.subclasses + (cls,)
    async def location_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedLocationSummaryList:
        """Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes."""
        ...


    async def location_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> LocationDetail:
        """Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes."""
        ...


    async def location_area_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
    ) -> PaginatedLocationAreaSummaryList:
        """Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters."""
        ...


    async def location_area_retrieve(
        self,
        id: Annotated[StrictInt, Field(description="A unique integer value identifying this location area.")],
    ) -> LocationAreaDetail:
        """Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters."""
        ...


    async def pal_park_area_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedPalParkAreaSummaryList:
        """Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park."""
        ...


    async def pal_park_area_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> PalParkAreaDetail:
        """Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park."""
        ...


    async def region_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedRegionSummaryList:
        """A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them."""
        ...


    async def region_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> RegionDetail:
        """A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them."""
        ...
