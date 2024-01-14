# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseAbilityApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAbilityApi.subclasses = BaseAbilityApi.subclasses + (cls,)
    def ability_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def ability_read(
        self,
        id: int,
    ) -> str:
        ...
