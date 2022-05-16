{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokemonColorSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokemonColorR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonColorR
            statusIs 501

    describe "getApiV2PokemonColorByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonColorByIntR 56
            statusIs 501
