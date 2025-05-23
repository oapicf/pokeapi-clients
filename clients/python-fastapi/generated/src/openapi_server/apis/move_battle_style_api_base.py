# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseMoveBattleStyleApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMoveBattleStyleApi.subclasses = BaseMoveBattleStyleApi.subclasses + (cls,)
    async def move_battle_style_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def move_battle_style_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
