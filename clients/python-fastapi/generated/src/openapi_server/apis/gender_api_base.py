# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseGenderApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGenderApi.subclasses = BaseGenderApi.subclasses + (cls,)
    def gender_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def gender_read(
        self,
        id: int,
    ) -> str:
        ...
