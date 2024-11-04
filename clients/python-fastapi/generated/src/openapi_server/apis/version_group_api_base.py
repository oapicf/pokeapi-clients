# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseVersionGroupApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseVersionGroupApi.subclasses = BaseVersionGroupApi.subclasses + (cls,)
    async def version_group_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def version_group_read(
        self,
        id: int,
    ) -> str:
        ...
