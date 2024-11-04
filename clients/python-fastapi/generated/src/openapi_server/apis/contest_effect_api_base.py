# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseContestEffectApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseContestEffectApi.subclasses = BaseContestEffectApi.subclasses + (cls,)
    async def contest_effect_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def contest_effect_read(
        self,
        id: int,
    ) -> str:
        ...
