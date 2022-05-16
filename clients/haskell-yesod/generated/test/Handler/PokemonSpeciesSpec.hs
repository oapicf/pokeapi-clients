{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokemonSpeciesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokemonSpeciesR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonSpeciesR
            statusIs 501

    describe "getApiV2PokemonSpeciesByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonSpeciesByIntR 56
            statusIs 501
