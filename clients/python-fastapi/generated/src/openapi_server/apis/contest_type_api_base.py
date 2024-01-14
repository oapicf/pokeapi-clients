# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseContestTypeApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseContestTypeApi.subclasses = BaseContestTypeApi.subclasses + (cls,)
    def contest_type_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def contest_type_read(
        self,
        id: int,
    ) -> str:
        ...
