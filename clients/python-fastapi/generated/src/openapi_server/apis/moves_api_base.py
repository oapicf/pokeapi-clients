# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.move_battle_style_detail import MoveBattleStyleDetail
from openapi_server.models.move_detail import MoveDetail
from openapi_server.models.move_learn_method_detail import MoveLearnMethodDetail
from openapi_server.models.move_meta_ailment_detail import MoveMetaAilmentDetail
from openapi_server.models.move_meta_category_detail import MoveMetaCategoryDetail
from openapi_server.models.move_target_detail import MoveTargetDetail
from openapi_server.models.paginated_move_battle_style_summary_list import PaginatedMoveBattleStyleSummaryList
from openapi_server.models.paginated_move_learn_method_summary_list import PaginatedMoveLearnMethodSummaryList
from openapi_server.models.paginated_move_meta_ailment_summary_list import PaginatedMoveMetaAilmentSummaryList
from openapi_server.models.paginated_move_meta_category_summary_list import PaginatedMoveMetaCategorySummaryList
from openapi_server.models.paginated_move_summary_list import PaginatedMoveSummaryList
from openapi_server.models.paginated_move_target_summary_list import PaginatedMoveTargetSummaryList
from openapi_server.security_api import get_token_basicAuth, get_token_cookieAuth

class BaseMovesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseMovesApi.subclasses = BaseMovesApi.subclasses + (cls,)
    async def move_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedMoveSummaryList:
        """Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas."""
        ...


    async def move_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> MoveDetail:
        """Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas."""
        ...


    async def move_ailment_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedMoveMetaAilmentSummaryList:
        """Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail."""
        ...


    async def move_ailment_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> MoveMetaAilmentDetail:
        """Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail."""
        ...


    async def move_battle_style_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedMoveBattleStyleSummaryList:
        """Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail."""
        ...


    async def move_battle_style_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> MoveBattleStyleDetail:
        """Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail."""
        ...


    async def move_category_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedMoveMetaCategorySummaryList:
        """Very general categories that loosely group move effects."""
        ...


    async def move_category_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> MoveMetaCategoryDetail:
        """Very general categories that loosely group move effects."""
        ...


    async def move_learn_method_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedMoveLearnMethodSummaryList:
        """Methods by which Pokémon can learn moves."""
        ...


    async def move_learn_method_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> MoveLearnMethodDetail:
        """Methods by which Pokémon can learn moves."""
        ...


    async def move_target_list(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="Number of results to return per page.")],
        offset: Annotated[Optional[StrictInt], Field(description="The initial index from which to return the results.")],
        q: Annotated[Optional[StrictStr], Field(description="> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. ")],
    ) -> PaginatedMoveTargetSummaryList:
        """Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves."""
        ...


    async def move_target_retrieve(
        self,
        id: Annotated[StrictStr, Field(description="This parameter can be a string or an integer.")],
    ) -> MoveTargetDetail:
        """Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves."""
        ...
