# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseBerryFlavorApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBerryFlavorApi.subclasses = BaseBerryFlavorApi.subclasses + (cls,)
    async def berry_flavor_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def berry_flavor_read(
        self,
        id: int,
    ) -> str:
        ...
