# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseLanguageApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLanguageApi.subclasses = BaseLanguageApi.subclasses + (cls,)
    def language_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def language_read(
        self,
        id: int,
    ) -> str:
        ...
