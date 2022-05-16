{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LocationSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2LocationR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2LocationR
            statusIs 501

    describe "getApiV2LocationByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2LocationByIntR 56
            statusIs 501
