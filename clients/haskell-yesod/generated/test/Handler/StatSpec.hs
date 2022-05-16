{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.StatSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2StatR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2StatR
            statusIs 501

    describe "getApiV2StatByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2StatByIntR 56
            statusIs 501
