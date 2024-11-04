# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseLocationAreaApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLocationAreaApi.subclasses = BaseLocationAreaApi.subclasses + (cls,)
    async def location_area_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def location_area_read(
        self,
        id: int,
    ) -> str:
        ...
