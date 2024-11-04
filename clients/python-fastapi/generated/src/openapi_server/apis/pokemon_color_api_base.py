# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokemonColorApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokemonColorApi.subclasses = BasePokemonColorApi.subclasses + (cls,)
    async def pokemon_color_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def pokemon_color_read(
        self,
        id: int,
    ) -> str:
        ...
