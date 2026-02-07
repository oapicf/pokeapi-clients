# moves_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveAilmentList**](moves_api.md#MoveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**MoveAilmentRetrieve**](moves_api.md#MoveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**MoveBattleStyleList**](moves_api.md#MoveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**MoveBattleStyleRetrieve**](moves_api.md#MoveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**MoveCategoryList**](moves_api.md#MoveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories
[**MoveCategoryRetrieve**](moves_api.md#MoveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**MoveLearnMethodList**](moves_api.md#MoveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**MoveLearnMethodRetrieve**](moves_api.md#MoveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**MoveList**](moves_api.md#MoveList) | **GET** /api/v2/move/ | List moves
[**MoveRetrieve**](moves_api.md#MoveRetrieve) | **GET** /api/v2/move/{id}/ | Get move
[**MoveTargetList**](moves_api.md#MoveTargetList) | **GET** /api/v2/move-target/ | List move targets
[**MoveTargetRetrieve**](moves_api.md#MoveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target


<a name="MoveAilmentList"></a>
# **MoveAilmentList**
> PaginatedMoveMetaAilmentSummaryList MoveAilmentList(limit, offset, q)

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
<a name="MoveAilmentRetrieve"></a>
# **MoveAilmentRetrieve**
> MoveMetaAilmentDetail MoveAilmentRetrieve(Id_)

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
<a name="MoveBattleStyleList"></a>
# **MoveBattleStyleList**
> PaginatedMoveBattleStyleSummaryList MoveBattleStyleList(limit, offset, q)

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
<a name="MoveBattleStyleRetrieve"></a>
# **MoveBattleStyleRetrieve**
> MoveBattleStyleDetail MoveBattleStyleRetrieve(Id_)

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
<a name="MoveCategoryList"></a>
# **MoveCategoryList**
> PaginatedMoveMetaCategorySummaryList MoveCategoryList(limit, offset, q)

List move meta categories

Very general categories that loosely group move effects.
<a name="MoveCategoryRetrieve"></a>
# **MoveCategoryRetrieve**
> MoveMetaCategoryDetail MoveCategoryRetrieve(Id_)

Get move meta category

Very general categories that loosely group move effects.
<a name="MoveLearnMethodList"></a>
# **MoveLearnMethodList**
> PaginatedMoveLearnMethodSummaryList MoveLearnMethodList(limit, offset, q)

List move learn methods

Methods by which Pokémon can learn moves.
<a name="MoveLearnMethodRetrieve"></a>
# **MoveLearnMethodRetrieve**
> MoveLearnMethodDetail MoveLearnMethodRetrieve(Id_)

Get move learn method

Methods by which Pokémon can learn moves.
<a name="MoveList"></a>
# **MoveList**
> PaginatedMoveSummaryList MoveList(limit, offset, q)

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
<a name="MoveRetrieve"></a>
# **MoveRetrieve**
> MoveDetail MoveRetrieve(Id_)

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
<a name="MoveTargetList"></a>
# **MoveTargetList**
> PaginatedMoveTargetSummaryList MoveTargetList(limit, offset, q)

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
<a name="MoveTargetRetrieve"></a>
# **MoveTargetRetrieve**
> MoveTargetDetail MoveTargetRetrieve(Id_)

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
