# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseLanguageApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLanguageApi.subclasses = BaseLanguageApi.subclasses + (cls,)
    async def language_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def language_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
