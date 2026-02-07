{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LocationSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2LocationAreaR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2LocationAreaR
            statusIs 501

    describe "getApiV2LocationAreaByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2LocationAreaByIntR 56
            statusIs 501

    describe "getApiV2LocationR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2LocationR
            statusIs 501

    describe "getApiV2LocationByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2LocationByTextR "id_example"
            statusIs 501

    describe "getApiV2PalParkAreaR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PalParkAreaR
            statusIs 501

    describe "getApiV2PalParkAreaByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PalParkAreaByTextR "id_example"
            statusIs 501

    describe "getApiV2RegionR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2RegionR
            statusIs 501

    describe "getApiV2RegionByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2RegionByTextR "id_example"
            statusIs 501
