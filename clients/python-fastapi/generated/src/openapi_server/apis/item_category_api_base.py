# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseItemCategoryApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseItemCategoryApi.subclasses = BaseItemCategoryApi.subclasses + (cls,)
    async def item_category_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def item_category_read(
        self,
        id: int,
    ) -> str:
        ...
