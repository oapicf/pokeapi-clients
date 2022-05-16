{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.GrowthRateSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2GrowthRateR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2GrowthRateR
            statusIs 501

    describe "getApiV2GrowthRateByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2GrowthRateByIntR 56
            statusIs 501
