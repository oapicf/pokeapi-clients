# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr
from typing import Optional


class BaseMoveDamageClassApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMoveDamageClassApi.subclasses = BaseMoveDamageClassApi.subclasses + (cls,)
    async def move_damage_class_list(
        self,
        limit: Optional[StrictInt],
        offset: Optional[StrictInt],
    ) -> str:
        ...


    async def move_damage_class_read(
        self,
        id: StrictInt,
    ) -> str:
        ...
