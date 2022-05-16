{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BerryFirmnessSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2BerryFirmnessR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2BerryFirmnessR
            statusIs 501

    describe "getApiV2BerryFirmnessByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2BerryFirmnessByIntR 56
            statusIs 501
