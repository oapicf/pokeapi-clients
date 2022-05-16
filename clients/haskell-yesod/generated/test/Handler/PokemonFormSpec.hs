{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokemonFormSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokemonFormR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonFormR
            statusIs 501

    describe "getApiV2PokemonFormByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonFormByIntR 56
            statusIs 501
