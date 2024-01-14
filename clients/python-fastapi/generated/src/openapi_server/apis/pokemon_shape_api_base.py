# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BasePokemonShapeApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePokemonShapeApi.subclasses = BasePokemonShapeApi.subclasses + (cls,)
    def pokemon_shape_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def pokemon_shape_read(
        self,
        id: int,
    ) -> str:
        ...
