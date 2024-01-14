# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseNatureApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseNatureApi.subclasses = BaseNatureApi.subclasses + (cls,)
    def nature_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def nature_read(
        self,
        id: int,
    ) -> str:
        ...
