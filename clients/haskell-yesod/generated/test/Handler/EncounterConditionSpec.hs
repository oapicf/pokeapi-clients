{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EncounterConditionSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EncounterConditionR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EncounterConditionR
            statusIs 501

    describe "getApiV2EncounterConditionByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EncounterConditionByIntR 56
            statusIs 501
