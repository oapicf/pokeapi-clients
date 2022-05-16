{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokeathlonStatSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PokeathlonStatR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokeathlonStatR
            statusIs 501

    describe "getApiV2PokeathlonStatByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokeathlonStatByIntR 56
            statusIs 501
