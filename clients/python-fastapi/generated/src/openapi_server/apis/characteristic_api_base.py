# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseCharacteristicApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCharacteristicApi.subclasses = BaseCharacteristicApi.subclasses + (cls,)
    def characteristic_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def characteristic_read(
        self,
        id: int,
    ) -> str:
        ...
