{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EncounterConditionValueSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EncounterConditionValueR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EncounterConditionValueR
            statusIs 501

    describe "getApiV2EncounterConditionValueByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EncounterConditionValueByIntR 56
            statusIs 501
