import connexion

from app.openapi_server.models.move_battle_style_detail import MoveBattleStyleDetail  # noqa: E501
from app.openapi_server.models.move_detail import MoveDetail  # noqa: E501
from app.openapi_server.models.move_learn_method_detail import MoveLearnMethodDetail  # noqa: E501
from app.openapi_server.models.move_meta_ailment_detail import MoveMetaAilmentDetail  # noqa: E501
from app.openapi_server.models.move_meta_category_detail import MoveMetaCategoryDetail  # noqa: E501
from app.openapi_server.models.move_target_detail import MoveTargetDetail  # noqa: E501
from app.openapi_server.models.paginated_move_battle_style_summary_list import PaginatedMoveBattleStyleSummaryList  # noqa: E501
from app.openapi_server.models.paginated_move_learn_method_summary_list import PaginatedMoveLearnMethodSummaryList  # noqa: E501
from app.openapi_server.models.paginated_move_meta_ailment_summary_list import PaginatedMoveMetaAilmentSummaryList  # noqa: E501
from app.openapi_server.models.paginated_move_meta_category_summary_list import PaginatedMoveMetaCategorySummaryList  # noqa: E501
from app.openapi_server.models.paginated_move_summary_list import PaginatedMoveSummaryList  # noqa: E501
from app.openapi_server.models.paginated_move_target_summary_list import PaginatedMoveTargetSummaryList  # noqa: E501
from openapi_server import util


def move_ailment_list(limit=None, offset=None, q=None):  # noqa: E501
    """List move meta ailments

    Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedMoveMetaAilmentSummaryList
    """
    return 'do some magic!'


def move_ailment_retrieve(id):  # noqa: E501
    """Get move meta ailment

    Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: MoveMetaAilmentDetail
    """
    return 'do some magic!'


def move_battle_style_list(limit=None, offset=None, q=None):  # noqa: E501
    """List move battle styles

    Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedMoveBattleStyleSummaryList
    """
    return 'do some magic!'


def move_battle_style_retrieve(id):  # noqa: E501
    """Get move battle style

    Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: MoveBattleStyleDetail
    """
    return 'do some magic!'


def move_category_list(limit=None, offset=None, q=None):  # noqa: E501
    """List move meta categories

    Very general categories that loosely group move effects. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedMoveMetaCategorySummaryList
    """
    return 'do some magic!'


def move_category_retrieve(id):  # noqa: E501
    """Get move meta category

    Very general categories that loosely group move effects. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: MoveMetaCategoryDetail
    """
    return 'do some magic!'


def move_learn_method_list(limit=None, offset=None, q=None):  # noqa: E501
    """List move learn methods

    Methods by which Pokémon can learn moves. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedMoveLearnMethodSummaryList
    """
    return 'do some magic!'


def move_learn_method_retrieve(id):  # noqa: E501
    """Get move learn method

    Methods by which Pokémon can learn moves. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: MoveLearnMethodDetail
    """
    return 'do some magic!'


def move_list(limit=None, offset=None, q=None):  # noqa: E501
    """List moves

    Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedMoveSummaryList
    """
    return 'do some magic!'


def move_retrieve(id):  # noqa: E501
    """Get move

    Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: MoveDetail
    """
    return 'do some magic!'


def move_target_list(limit=None, offset=None, q=None):  # noqa: E501
    """List move targets

    Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves. # noqa: E501

    :param limit: Number of results to return per page.
    :type limit: int
    :param offset: The initial index from which to return the results.
    :type offset: int
    :param q: &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    :type q: str

    :rtype: PaginatedMoveTargetSummaryList
    """
    return 'do some magic!'


def move_target_retrieve(id):  # noqa: E501
    """Get move target

    Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves. # noqa: E501

    :param id: This parameter can be a string or an integer.
    :type id: str

    :rtype: MoveTargetDetail
    """
    return 'do some magic!'
