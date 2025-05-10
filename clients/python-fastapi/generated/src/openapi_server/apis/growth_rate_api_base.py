# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseGrowthRateApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGrowthRateApi.subclasses = BaseGrowthRateApi.subclasses + (cls,)
    async def growth_rate_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def growth_rate_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
