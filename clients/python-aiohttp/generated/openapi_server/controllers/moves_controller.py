from typing import List, Dict
from aiohttp import web

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
from openapi_server import util


async def move_ailment_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List move meta ailments

    Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def move_ailment_retrieve(request: web.Request, id) -> web.Response:
    """Get move meta ailment

    Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def move_battle_style_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List move battle styles

    Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def move_battle_style_retrieve(request: web.Request, id) -> web.Response:
    """Get move battle style

    Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def move_category_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List move meta categories

    Very general categories that loosely group move effects.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def move_category_retrieve(request: web.Request, id) -> web.Response:
    """Get move meta category

    Very general categories that loosely group move effects.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def move_learn_method_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List move learn methods

    Methods by which Pokémon can learn moves.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def move_learn_method_retrieve(request: web.Request, id) -> web.Response:
    """Get move learn method

    Methods by which Pokémon can learn moves.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def move_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List moves

    Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def move_retrieve(request: web.Request, id) -> web.Response:
    """Get move

    Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)


async def move_target_list(request: web.Request, limit=None, offset=None, q=None) -> web.Response:
    """List move targets

    Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    """
    return web.Response(status=200)


async def move_target_retrieve(request: web.Request, id) -> web.Response:
    """Get move target

    Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

    :param id: This parameter can be a string or an integer.
    :type id: str

    """
    return web.Response(status=200)
