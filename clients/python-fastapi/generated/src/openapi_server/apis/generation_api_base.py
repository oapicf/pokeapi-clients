# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseGenerationApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGenerationApi.subclasses = BaseGenerationApi.subclasses + (cls,)
    async def generation_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def generation_read(
        self,
        id: int,
    ) -> str:
        ...
