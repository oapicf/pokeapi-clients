# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseSuperContestEffectApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseSuperContestEffectApi.subclasses = BaseSuperContestEffectApi.subclasses + (cls,)
    async def super_contest_effect_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def super_contest_effect_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
