{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Games where

import           Import


-- | List genrations
--
-- A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
-- operationId: generationList
getApiV2GenerationR :: Handler Value
getApiV2GenerationR = notImplemented

-- | Get genration
--
-- A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
-- operationId: generationRetrieve
getApiV2GenerationByTextR :: Text -- ^ This parameter can be a string or an integer.
                          -> Handler Value
getApiV2GenerationByTextR id = notImplemented

-- | List pokedex
--
-- A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
-- operationId: pokedexList
getApiV2PokedexR :: Handler Value
getApiV2PokedexR = notImplemented

-- | Get pokedex
--
-- A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
-- operationId: pokedexRetrieve
getApiV2PokedexByTextR :: Text -- ^ This parameter can be a string or an integer.
                       -> Handler Value
getApiV2PokedexByTextR id = notImplemented

-- | List version groups
--
-- Version groups categorize highly similar versions of the games.
-- operationId: versionGroupList
getApiV2VersionGroupR :: Handler Value
getApiV2VersionGroupR = notImplemented

-- | Get version group
--
-- Version groups categorize highly similar versions of the games.
-- operationId: versionGroupRetrieve
getApiV2VersionGroupByTextR :: Text -- ^ This parameter can be a string or an integer.
                            -> Handler Value
getApiV2VersionGroupByTextR id = notImplemented

-- | List versions
--
-- Versions of the games, e.g., Red, Blue or Yellow.
-- operationId: versionList
getApiV2VersionR :: Handler Value
getApiV2VersionR = notImplemented

-- | Get version
--
-- Versions of the games, e.g., Red, Blue or Yellow.
-- operationId: versionRetrieve
getApiV2VersionByTextR :: Text -- ^ This parameter can be a string or an integer.
                       -> Handler Value
getApiV2VersionByTextR id = notImplemented
