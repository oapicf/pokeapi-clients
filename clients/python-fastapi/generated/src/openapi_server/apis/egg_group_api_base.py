# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseEggGroupApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEggGroupApi.subclasses = BaseEggGroupApi.subclasses + (cls,)
    async def egg_group_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def egg_group_read(
        self,
        id: int,
    ) -> str:
        ...
