# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseMoveLearnMethodApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMoveLearnMethodApi.subclasses = BaseMoveLearnMethodApi.subclasses + (cls,)
    async def move_learn_method_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def move_learn_method_read(
        self,
        id: int,
    ) -> str:
        ...
