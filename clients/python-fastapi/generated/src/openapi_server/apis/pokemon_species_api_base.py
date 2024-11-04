# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokemonSpeciesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokemonSpeciesApi.subclasses = BasePokemonSpeciesApi.subclasses + (cls,)
    async def pokemon_species_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def pokemon_species_read(
        self,
        id: int,
    ) -> str:
        ...
