# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokedexApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokedexApi.subclasses = BasePokedexApi.subclasses + (cls,)
    def pokedex_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def pokedex_read(
        self,
        id: int,
    ) -> str:
        ...
