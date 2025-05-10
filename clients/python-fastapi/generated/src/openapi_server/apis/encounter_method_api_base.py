# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseEncounterMethodApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEncounterMethodApi.subclasses = BaseEncounterMethodApi.subclasses + (cls,)
    async def encounter_method_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def encounter_method_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
