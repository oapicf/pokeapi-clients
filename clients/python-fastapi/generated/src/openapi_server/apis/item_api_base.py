# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseItemApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseItemApi.subclasses = BaseItemApi.subclasses + (cls,)
    async def item_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def item_read(
        self,
        id: int,
    ) -> str:
        ...
