# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseSuperContestEffectApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseSuperContestEffectApi.subclasses = BaseSuperContestEffectApi.subclasses + (cls,)
    async def super_contest_effect_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def super_contest_effect_read(
        self,
        id: int,
    ) -> str:
        ...
