{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ItemFlingEffectSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ItemFlingEffectR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemFlingEffectR
            statusIs 501

    describe "getApiV2ItemFlingEffectByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemFlingEffectByIntR 56
            statusIs 501
