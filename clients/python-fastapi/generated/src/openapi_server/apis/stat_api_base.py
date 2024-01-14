# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseStatApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseStatApi.subclasses = BaseStatApi.subclasses + (cls,)
    def stat_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def stat_read(
        self,
        id: int,
    ) -> str:
        ...
