# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BasePalParkAreaApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePalParkAreaApi.subclasses = BasePalParkAreaApi.subclasses + (cls,)
    async def pal_park_area_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def pal_park_area_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
