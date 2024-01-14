# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseLocationApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLocationApi.subclasses = BaseLocationApi.subclasses + (cls,)
    def location_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def location_read(
        self,
        id: int,
    ) -> str:
        ...
