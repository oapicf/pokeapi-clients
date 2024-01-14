# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokemonFormApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokemonFormApi.subclasses = BasePokemonFormApi.subclasses + (cls,)
    def pokemon_form_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def pokemon_form_read(
        self,
        id: int,
    ) -> str:
        ...
