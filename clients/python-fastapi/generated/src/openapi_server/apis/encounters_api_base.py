# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.encounter_condition_detail import EncounterConditionDetail
from openapi_server.models.encounter_condition_value_detail import EncounterConditionValueDetail
from openapi_server.models.encounter_method_detail import EncounterMethodDetail
from openapi_server.models.paginated_encounter_condition_summary_list import PaginatedEncounterConditionSummaryList
from openapi_server.models.paginated_encounter_condition_value_summary_list import PaginatedEncounterConditionValueSummaryList
from openapi_server.models.paginated_encounter_method_summary_list import PaginatedEncounterMethodSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

class BaseEncountersApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEncountersApi.subclasses = BaseEncountersApi.subclasses + (cls,)
    async def encounter_method_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedEncounterMethodSummaryList:
        """Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail."""
        ...


    async def encounter_method_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> EncounterMethodDetail:
        """Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail."""
        ...


    async def encounter_condition_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedEncounterConditionSummaryList:
        """Conditions which affect what pokemon might appear in the wild, e.g., day or night."""
        ...


    async def encounter_condition_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> EncounterConditionDetail:
        """Conditions which affect what pokemon might appear in the wild, e.g., day or night."""
        ...


    async def encounter_condition_value_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedEncounterConditionValueSummaryList:
        """Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night."""
        ...


    async def encounter_condition_value_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> EncounterConditionValueDetail:
        """Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night."""
        ...
