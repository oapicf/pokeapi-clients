{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EggGroupSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EggGroupR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EggGroupR
            statusIs 501

    describe "getApiV2EggGroupByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EggGroupByIntR 56
            statusIs 501
