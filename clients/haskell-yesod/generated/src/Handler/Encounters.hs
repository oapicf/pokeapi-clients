{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Encounters where

import           Import


-- | List encounter conditions
--
-- Conditions which affect what pokemon might appear in the wild, e.g., day or night.
-- operationId: encounterConditionList
getApiV2EncounterConditionR :: Handler Value
getApiV2EncounterConditionR = notImplemented

-- | Get encounter condition
--
-- Conditions which affect what pokemon might appear in the wild, e.g., day or night.
-- operationId: encounterConditionRetrieve
getApiV2EncounterConditionByTextR :: Text -- ^ This parameter can be a string or an integer.
                                  -> Handler Value
getApiV2EncounterConditionByTextR id = notImplemented

-- | List encounter condition values
--
-- Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
-- operationId: encounterConditionValueList
getApiV2EncounterConditionValueR :: Handler Value
getApiV2EncounterConditionValueR = notImplemented

-- | Get encounter condition value
--
-- Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
-- operationId: encounterConditionValueRetrieve
getApiV2EncounterConditionValueByTextR :: Text -- ^ This parameter can be a string or an integer.
                                       -> Handler Value
getApiV2EncounterConditionValueByTextR id = notImplemented

-- | List encounter methods
--
-- Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
-- operationId: encounterMethodList
getApiV2EncounterMethodR :: Handler Value
getApiV2EncounterMethodR = notImplemented

-- | Get encounter method
--
-- Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
-- operationId: encounterMethodRetrieve
getApiV2EncounterMethodByTextR :: Text -- ^ This parameter can be a string or an integer.
                               -> Handler Value
getApiV2EncounterMethodByTextR id = notImplemented

-- | Get pokemon encounter
--
-- Handles Pokemon Encounters as a sub-resource.
-- operationId: pokemonEncountersRetrieve
getApiV2PokemonByTextEncountersR :: Text -- ^ 
                                 -> Handler Value
getApiV2PokemonByTextEncountersR pokemonId = notImplemented
