{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.RegionSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2RegionR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2RegionR
            statusIs 501

    describe "getApiV2RegionByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2RegionByIntR 56
            statusIs 501
