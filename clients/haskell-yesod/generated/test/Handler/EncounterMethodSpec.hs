{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EncounterMethodSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EncounterMethodR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EncounterMethodR
            statusIs 501

    describe "getApiV2EncounterMethodByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EncounterMethodByIntR 56
            statusIs 501
