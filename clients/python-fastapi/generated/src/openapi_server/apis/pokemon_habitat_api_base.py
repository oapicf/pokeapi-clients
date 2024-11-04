# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokemonHabitatApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokemonHabitatApi.subclasses = BasePokemonHabitatApi.subclasses + (cls,)
    async def pokemon_habitat_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def pokemon_habitat_read(
        self,
        id: int,
    ) -> str:
        ...
