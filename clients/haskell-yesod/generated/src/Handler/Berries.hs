{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Berries where

import           Import


-- | List berry firmness
--
-- Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
-- operationId: berryFirmnessList
getApiV2BerryFirmnessR :: Handler Value
getApiV2BerryFirmnessR = notImplemented

-- | Get berry by firmness
--
-- Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
-- operationId: berryFirmnessRetrieve
getApiV2BerryFirmnessByTextR :: Text -- ^ This parameter can be a string or an integer.
                             -> Handler Value
getApiV2BerryFirmnessByTextR id = notImplemented

-- | List berry flavors
--
-- Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
-- operationId: berryFlavorList
getApiV2BerryFlavorR :: Handler Value
getApiV2BerryFlavorR = notImplemented

-- | Get berries by flavor
--
-- Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
-- operationId: berryFlavorRetrieve
getApiV2BerryFlavorByTextR :: Text -- ^ This parameter can be a string or an integer.
                           -> Handler Value
getApiV2BerryFlavorByTextR id = notImplemented

-- | List berries
--
-- Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
-- operationId: berryList
getApiV2BerryR :: Handler Value
getApiV2BerryR = notImplemented

-- | Get a berry
--
-- Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
-- operationId: berryRetrieve
getApiV2BerryByTextR :: Text -- ^ This parameter can be a string or an integer.
                     -> Handler Value
getApiV2BerryByTextR id = notImplemented
