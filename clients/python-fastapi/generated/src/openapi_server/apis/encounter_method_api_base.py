# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseEncounterMethodApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEncounterMethodApi.subclasses = BaseEncounterMethodApi.subclasses + (cls,)
    async def encounter_method_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def encounter_method_read(
        self,
        id: int,
    ) -> str:
        ...
