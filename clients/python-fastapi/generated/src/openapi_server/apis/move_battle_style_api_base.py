# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseMoveBattleStyleApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMoveBattleStyleApi.subclasses = BaseMoveBattleStyleApi.subclasses + (cls,)
    async def move_battle_style_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def move_battle_style_read(
        self,
        id: int,
    ) -> str:
        ...
