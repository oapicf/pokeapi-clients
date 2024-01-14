# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokemonApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokemonApi.subclasses = BasePokemonApi.subclasses + (cls,)
    def pokemon_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def pokemon_read(
        self,
        id: int,
    ) -> str:
        ...
