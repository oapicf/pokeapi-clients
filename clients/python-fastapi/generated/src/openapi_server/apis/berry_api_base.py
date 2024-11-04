# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseBerryApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBerryApi.subclasses = BaseBerryApi.subclasses + (cls,)
    async def berry_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def berry_read(
        self,
        id: int,
    ) -> str:
        ...
