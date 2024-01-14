# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseGrowthRateApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGrowthRateApi.subclasses = BaseGrowthRateApi.subclasses + (cls,)
    def growth_rate_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def growth_rate_read(
        self,
        id: int,
    ) -> str:
        ...
