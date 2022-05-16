{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokedexSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokedexR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokedexR
            statusIs 501

    describe "getApiV2PokedexByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokedexByIntR 56
            statusIs 501
