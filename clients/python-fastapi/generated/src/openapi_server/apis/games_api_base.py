# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.generation_detail import GenerationDetail
from openapi_server.models.paginated_generation_summary_list import PaginatedGenerationSummaryList
from openapi_server.models.paginated_pokedex_summary_list import PaginatedPokedexSummaryList
from openapi_server.models.paginated_version_group_summary_list import PaginatedVersionGroupSummaryList
from openapi_server.models.paginated_version_summary_list import PaginatedVersionSummaryList
from openapi_server.models.pokedex_detail import PokedexDetail
from openapi_server.models.version_detail import VersionDetail
from openapi_server.models.version_group_detail import VersionGroupDetail
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

class BaseGamesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGamesApi.subclasses = BaseGamesApi.subclasses + (cls,)
    async def generation_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedGenerationSummaryList:
        """A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."""
        ...


    async def generation_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> GenerationDetail:
        """A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released."""
        ...


    async def pokedex_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedPokedexSummaryList:
        """A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."""
        ...


    async def pokedex_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> PokedexDetail:
        """A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail."""
        ...


    async def version_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedVersionSummaryList:
        """Versions of the games, e.g., Red, Blue or Yellow."""
        ...


    async def version_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> VersionDetail:
        """Versions of the games, e.g., Red, Blue or Yellow."""
        ...


    async def version_group_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedVersionGroupSummaryList:
        """Version groups categorize highly similar versions of the games."""
        ...


    async def version_group_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> VersionGroupDetail:
        """Version groups categorize highly similar versions of the games."""
        ...
