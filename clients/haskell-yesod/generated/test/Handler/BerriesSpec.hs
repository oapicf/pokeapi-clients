{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BerriesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2BerryFirmnessR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2BerryFirmnessR
            statusIs 501

    describe "getApiV2BerryFirmnessByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2BerryFirmnessByTextR "id_example"
            statusIs 501

    describe "getApiV2BerryFlavorR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2BerryFlavorR
            statusIs 501

    describe "getApiV2BerryFlavorByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2BerryFlavorByTextR "id_example"
            statusIs 501

    describe "getApiV2BerryR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2BerryR
            statusIs 501

    describe "getApiV2BerryByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2BerryByTextR "id_example"
            statusIs 501
