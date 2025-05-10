# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BasePokeathlonStatApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokeathlonStatApi.subclasses = BasePokeathlonStatApi.subclasses + (cls,)
    async def pokeathlon_stat_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def pokeathlon_stat_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
