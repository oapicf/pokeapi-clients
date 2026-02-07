{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Location where

import           Import


-- | List location areas
--
-- Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
-- operationId: locationAreaList
getApiV2LocationAreaR :: Handler Value
getApiV2LocationAreaR = notImplemented

-- | Get location area
--
-- Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
-- operationId: locationAreaRetrieve
getApiV2LocationAreaByIntR :: Int -- ^ A unique integer value identifying this location area.
                           -> Handler Value
getApiV2LocationAreaByIntR id = notImplemented

-- | List locations
--
-- Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
-- operationId: locationList
getApiV2LocationR :: Handler Value
getApiV2LocationR = notImplemented

-- | Get location
--
-- Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
-- operationId: locationRetrieve
getApiV2LocationByTextR :: Text -- ^ This parameter can be a string or an integer.
                        -> Handler Value
getApiV2LocationByTextR id = notImplemented

-- | List pal park areas
--
-- Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
-- operationId: palParkAreaList
getApiV2PalParkAreaR :: Handler Value
getApiV2PalParkAreaR = notImplemented

-- | Get pal park area
--
-- Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
-- operationId: palParkAreaRetrieve
getApiV2PalParkAreaByTextR :: Text -- ^ This parameter can be a string or an integer.
                           -> Handler Value
getApiV2PalParkAreaByTextR id = notImplemented

-- | List regions
--
-- A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
-- operationId: regionList
getApiV2RegionR :: Handler Value
getApiV2RegionR = notImplemented

-- | Get region
--
-- A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
-- operationId: regionRetrieve
getApiV2RegionByTextR :: Text -- ^ This parameter can be a string or an integer.
                      -> Handler Value
getApiV2RegionByTextR id = notImplemented
