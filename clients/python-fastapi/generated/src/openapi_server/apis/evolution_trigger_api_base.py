# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseEvolutionTriggerApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEvolutionTriggerApi.subclasses = BaseEvolutionTriggerApi.subclasses + (cls,)
    async def evolution_trigger_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def evolution_trigger_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
