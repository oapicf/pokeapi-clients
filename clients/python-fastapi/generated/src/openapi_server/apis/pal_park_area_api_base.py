# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePalParkAreaApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePalParkAreaApi.subclasses = BasePalParkAreaApi.subclasses + (cls,)
    def pal_park_area_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def pal_park_area_read(
        self,
        id: int,
    ) -> str:
        ...
