# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseItemFlingEffectApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseItemFlingEffectApi.subclasses = BaseItemFlingEffectApi.subclasses + (cls,)
    async def item_fling_effect_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def item_fling_effect_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
