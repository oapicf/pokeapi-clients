{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BerrySpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2BerryR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2BerryR
            statusIs 501

    describe "getApiV2BerryByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2BerryByIntR 56
            statusIs 501
