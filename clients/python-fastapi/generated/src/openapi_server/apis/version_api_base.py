# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseVersionApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseVersionApi.subclasses = BaseVersionApi.subclasses + (cls,)
    def version_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def version_read(
        self,
        id: int,
    ) -> str:
        ...
