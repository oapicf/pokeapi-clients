# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokeathlonStatApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokeathlonStatApi.subclasses = BasePokeathlonStatApi.subclasses + (cls,)
    async def pokeathlon_stat_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def pokeathlon_stat_read(
        self,
        id: int,
    ) -> str:
        ...
