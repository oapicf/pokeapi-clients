# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseTypeApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseTypeApi.subclasses = BaseTypeApi.subclasses + (cls,)
    async def type_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def type_read(
        self,
        id: int,
    ) -> str:
        ...
