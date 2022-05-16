{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AbilitySpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2AbilityR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2AbilityR
            statusIs 501

    describe "getApiV2AbilityByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2AbilityByIntR 56
            statusIs 501
