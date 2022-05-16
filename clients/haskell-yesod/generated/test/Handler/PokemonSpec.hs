{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokemonSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokemonR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonR
            statusIs 501

    describe "getApiV2PokemonByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonByIntR 56
            statusIs 501
