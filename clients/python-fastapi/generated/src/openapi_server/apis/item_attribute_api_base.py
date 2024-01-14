# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseItemAttributeApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseItemAttributeApi.subclasses = BaseItemAttributeApi.subclasses + (cls,)
    def item_attribute_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def item_attribute_read(
        self,
        id: int,
    ) -> str:
        ...
