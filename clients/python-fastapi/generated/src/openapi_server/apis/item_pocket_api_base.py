# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseItemPocketApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseItemPocketApi.subclasses = BaseItemPocketApi.subclasses + (cls,)
    async def item_pocket_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def item_pocket_read(
        self,
        id: int,
    ) -> str:
        ...
