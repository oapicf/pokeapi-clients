# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseRegionApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseRegionApi.subclasses = BaseRegionApi.subclasses + (cls,)
    def region_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def region_read(
        self,
        id: int,
    ) -> str:
        ...
