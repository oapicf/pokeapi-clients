# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.language_detail import LanguageDetail
from openapi_server.models.paginated_language_summary_list import PaginatedLanguageSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

class BaseUtilityApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseUtilityApi.subclasses = BaseUtilityApi.subclasses + (cls,)
    async def language_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedLanguageSummaryList:
        """Languages for translations of API resource information."""
        ...


    async def language_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> LanguageDetail:
        """Languages for translations of API resource information."""
        ...
