{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EncountersSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EncounterConditionR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EncounterConditionR
            statusIs 501

    describe "getApiV2EncounterConditionByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EncounterConditionByTextR "id_example"
            statusIs 501

    describe "getApiV2EncounterConditionValueR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EncounterConditionValueR
            statusIs 501

    describe "getApiV2EncounterConditionValueByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EncounterConditionValueByTextR "id_example"
            statusIs 501

    describe "getApiV2EncounterMethodR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EncounterMethodR
            statusIs 501

    describe "getApiV2EncounterMethodByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EncounterMethodByTextR "id_example"
            statusIs 501

    describe "getApiV2PokemonByTextEncountersR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonByTextEncountersR "pokemonId_example"
            statusIs 501
