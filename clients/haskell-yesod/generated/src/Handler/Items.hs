{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Items where

import           Import


-- | List item attributes
--
-- Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
-- operationId: itemAttributeList
getApiV2ItemAttributeR :: Handler Value
getApiV2ItemAttributeR = notImplemented

-- | Get item attribute
--
-- Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
-- operationId: itemAttributeRetrieve
getApiV2ItemAttributeByTextR :: Text -- ^ This parameter can be a string or an integer.
                             -> Handler Value
getApiV2ItemAttributeByTextR id = notImplemented

-- | List item categories
--
-- Item categories determine where items will be placed in the players bag.
-- operationId: itemCategoryList
getApiV2ItemCategoryR :: Handler Value
getApiV2ItemCategoryR = notImplemented

-- | Get item category
--
-- Item categories determine where items will be placed in the players bag.
-- operationId: itemCategoryRetrieve
getApiV2ItemCategoryByTextR :: Text -- ^ This parameter can be a string or an integer.
                            -> Handler Value
getApiV2ItemCategoryByTextR id = notImplemented

-- | List item fling effects
--
-- The various effects of the move\&quot;Fling\&quot; when used with different items.
-- operationId: itemFlingEffectList
getApiV2ItemFlingEffectR :: Handler Value
getApiV2ItemFlingEffectR = notImplemented

-- | Get item fling effect
--
-- The various effects of the move\&quot;Fling\&quot; when used with different items.
-- operationId: itemFlingEffectRetrieve
getApiV2ItemFlingEffectByTextR :: Text -- ^ This parameter can be a string or an integer.
                               -> Handler Value
getApiV2ItemFlingEffectByTextR id = notImplemented

-- | List items
--
-- An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
-- operationId: itemList
getApiV2ItemR :: Handler Value
getApiV2ItemR = notImplemented

-- | List item pockets
--
-- Pockets within the players bag used for storing items by category.
-- operationId: itemPocketList
getApiV2ItemPocketR :: Handler Value
getApiV2ItemPocketR = notImplemented

-- | Get item pocket
--
-- Pockets within the players bag used for storing items by category.
-- operationId: itemPocketRetrieve
getApiV2ItemPocketByTextR :: Text -- ^ This parameter can be a string or an integer.
                          -> Handler Value
getApiV2ItemPocketByTextR id = notImplemented

-- | Get item
--
-- An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
-- operationId: itemRetrieve
getApiV2ItemByTextR :: Text -- ^ This parameter can be a string or an integer.
                    -> Handler Value
getApiV2ItemByTextR id = notImplemented
