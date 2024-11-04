# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseMachineApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMachineApi.subclasses = BaseMachineApi.subclasses + (cls,)
    async def machine_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def machine_read(
        self,
        id: int,
    ) -> str:
        ...
