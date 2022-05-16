{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokemonShapeSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokemonShapeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonShapeR
            statusIs 501

    describe "getApiV2PokemonShapeByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonShapeByIntR 56
            statusIs 501
