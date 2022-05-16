{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokemonHabitatSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokemonHabitatR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonHabitatR
            statusIs 501

    describe "getApiV2PokemonHabitatByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonHabitatByIntR 56
            statusIs 501
