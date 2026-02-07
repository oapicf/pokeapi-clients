{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Moves where

import           Import


-- | List move meta ailments
--
-- Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
-- operationId: moveAilmentList
getApiV2MoveAilmentR :: Handler Value
getApiV2MoveAilmentR = notImplemented

-- | Get move meta ailment
--
-- Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
-- operationId: moveAilmentRetrieve
getApiV2MoveAilmentByTextR :: Text -- ^ This parameter can be a string or an integer.
                           -> Handler Value
getApiV2MoveAilmentByTextR id = notImplemented

-- | List move battle styles
--
-- Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
-- operationId: moveBattleStyleList
getApiV2MoveBattleStyleR :: Handler Value
getApiV2MoveBattleStyleR = notImplemented

-- | Get move battle style
--
-- Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
-- operationId: moveBattleStyleRetrieve
getApiV2MoveBattleStyleByTextR :: Text -- ^ This parameter can be a string or an integer.
                               -> Handler Value
getApiV2MoveBattleStyleByTextR id = notImplemented

-- | List move meta categories
--
-- Very general categories that loosely group move effects.
-- operationId: moveCategoryList
getApiV2MoveCategoryR :: Handler Value
getApiV2MoveCategoryR = notImplemented

-- | Get move meta category
--
-- Very general categories that loosely group move effects.
-- operationId: moveCategoryRetrieve
getApiV2MoveCategoryByTextR :: Text -- ^ This parameter can be a string or an integer.
                            -> Handler Value
getApiV2MoveCategoryByTextR id = notImplemented

-- | List move learn methods
--
-- Methods by which Pokémon can learn moves.
-- operationId: moveLearnMethodList
getApiV2MoveLearnMethodR :: Handler Value
getApiV2MoveLearnMethodR = notImplemented

-- | Get move learn method
--
-- Methods by which Pokémon can learn moves.
-- operationId: moveLearnMethodRetrieve
getApiV2MoveLearnMethodByTextR :: Text -- ^ This parameter can be a string or an integer.
                               -> Handler Value
getApiV2MoveLearnMethodByTextR id = notImplemented

-- | List moves
--
-- Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
-- operationId: moveList
getApiV2MoveR :: Handler Value
getApiV2MoveR = notImplemented

-- | Get move
--
-- Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
-- operationId: moveRetrieve
getApiV2MoveByTextR :: Text -- ^ This parameter can be a string or an integer.
                    -> Handler Value
getApiV2MoveByTextR id = notImplemented

-- | List move targets
--
-- Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
-- operationId: moveTargetList
getApiV2MoveTargetR :: Handler Value
getApiV2MoveTargetR = notImplemented

-- | Get move target
--
-- Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
-- operationId: moveTargetRetrieve
getApiV2MoveTargetByTextR :: Text -- ^ This parameter can be a string or an integer.
                          -> Handler Value
getApiV2MoveTargetByTextR id = notImplemented
