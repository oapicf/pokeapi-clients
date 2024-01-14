# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseBerryFirmnessApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBerryFirmnessApi.subclasses = BaseBerryFirmnessApi.subclasses + (cls,)
    def berry_firmness_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def berry_firmness_read(
        self,
        id: int,
    ) -> str:
        ...
