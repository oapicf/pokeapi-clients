# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BasePokemonShapeApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokemonShapeApi.subclasses = BasePokemonShapeApi.subclasses + (cls,)
    async def pokemon_shape_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def pokemon_shape_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
