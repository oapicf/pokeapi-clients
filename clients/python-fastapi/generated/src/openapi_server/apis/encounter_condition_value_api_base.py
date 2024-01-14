# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseEncounterConditionValueApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEncounterConditionValueApi.subclasses = BaseEncounterConditionValueApi.subclasses + (cls,)
    def encounter_condition_value_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    def encounter_condition_value_read(
        self,
        id: int,
    ) -> str:
        ...
