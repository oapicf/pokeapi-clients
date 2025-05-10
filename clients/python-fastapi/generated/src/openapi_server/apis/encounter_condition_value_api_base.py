# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseEncounterConditionValueApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEncounterConditionValueApi.subclasses = BaseEncounterConditionValueApi.subclasses + (cls,)
    async def encounter_condition_value_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def encounter_condition_value_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
