# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.machine_detail import MachineDetail
from openapi_server.models.paginated_machine_summary_list import PaginatedMachineSummaryList


class BaseMachinesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMachinesApi.subclasses = BaseMachinesApi.subclasses + (cls,)
    async def machine_list(
        self,
        limit: Annotated[Optional[int], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[int], Field(description="The initial index from which to return the results.")],
    ) -> PaginatedMachineSummaryList:
        """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine."""
        ...


    async def machine_retrieve(
        self,
        id: Annotated[str, Field(description="This parameter can be a string or an integer.")],
    ) -> MachineDetail:
        """Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine."""
        ...
