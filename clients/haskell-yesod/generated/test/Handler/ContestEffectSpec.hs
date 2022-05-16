{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ContestEffectSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ContestEffectR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ContestEffectR
            statusIs 501

    describe "getApiV2ContestEffectByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ContestEffectByIntR 56
            statusIs 501
