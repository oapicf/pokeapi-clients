# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseMoveTargetApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMoveTargetApi.subclasses = BaseMoveTargetApi.subclasses + (cls,)
    async def move_target_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def move_target_read(
        self,
        id: int,
    ) -> str:
        ...
