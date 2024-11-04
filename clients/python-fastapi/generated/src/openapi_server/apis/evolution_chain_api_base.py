# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401



class BaseEvolutionChainApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseEvolutionChainApi.subclasses = BaseEvolutionChainApi.subclasses + (cls,)
    async def evolution_chain_list(
        self,
        limit: int,
        offset: int,
    ) -> str:
        ...


    async def evolution_chain_read(
        self,
        id: int,
    ) -> str:
        ...
