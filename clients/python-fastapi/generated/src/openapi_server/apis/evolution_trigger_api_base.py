# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseEvolutionTriggerApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEvolutionTriggerApi.subclasses = BaseEvolutionTriggerApi.subclasses + (cls,)
    async def evolution_trigger_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def evolution_trigger_read(
        self,
        id: int,
    ) -> str:
        ...
