# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseMoveCategoryApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMoveCategoryApi.subclasses = BaseMoveCategoryApi.subclasses + (cls,)
    def move_category_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def move_category_read(
        self,
        id: int,
    ) -> str:
        ...
