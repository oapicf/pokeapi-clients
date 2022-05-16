{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.SuperContestEffectSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2SuperContestEffectR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2SuperContestEffectR
            statusIs 501

    describe "getApiV2SuperContestEffectByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2SuperContestEffectByIntR 56
            statusIs 501
