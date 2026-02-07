# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.contest_effect_detail import ContestEffectDetail
from openapi_server.models.contest_type_detail import ContestTypeDetail
from openapi_server.models.paginated_contest_effect_summary_list import PaginatedContestEffectSummaryList
from openapi_server.models.paginated_contest_type_summary_list import PaginatedContestTypeSummaryList
from openapi_server.models.paginated_super_contest_effect_summary_list import PaginatedSuperContestEffectSummaryList
from openapi_server.models.super_contest_effect_detail import SuperContestEffectDetail
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

class BaseContestsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseContestsApi.subclasses = BaseContestsApi.subclasses + (cls,)
    async def contest_type_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedContestTypeSummaryList:
        """Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail."""
        ...


    async def contest_type_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> ContestTypeDetail:
        """Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail."""
        ...


    async def contest_effect_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedContestEffectSummaryList:
        """Contest effects refer to the effects of moves when used in contests."""
        ...


    async def contest_effect_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> ContestEffectDetail:
        """Contest effects refer to the effects of moves when used in contests."""
        ...


    async def super_contest_effect_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedSuperContestEffectSummaryList:
        """Super contest effects refer to the effects of moves when used in super contests."""
        ...


    async def super_contest_effect_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> SuperContestEffectDetail:
        """Super contest effects refer to the effects of moves when used in super contests."""
        ...
