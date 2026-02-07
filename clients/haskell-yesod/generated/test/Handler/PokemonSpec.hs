{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PokemonSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2AbilityR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2AbilityR
            statusIs 501

    describe "getApiV2AbilityByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2AbilityByTextR "id_example"
            statusIs 501

    describe "getApiV2CharacteristicR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2CharacteristicR
            statusIs 501

    describe "getApiV2CharacteristicByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2CharacteristicByTextR "id_example"
            statusIs 501

    describe "getApiV2EggGroupR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EggGroupR
            statusIs 501

    describe "getApiV2EggGroupByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EggGroupByTextR "id_example"
            statusIs 501

    describe "getApiV2GenderR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2GenderR
            statusIs 501

    describe "getApiV2GenderByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2GenderByTextR "id_example"
            statusIs 501

    describe "getApiV2GrowthRateR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2GrowthRateR
            statusIs 501

    describe "getApiV2GrowthRateByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2GrowthRateByTextR "id_example"
            statusIs 501

    describe "getApiV2MoveDamageClassR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveDamageClassR
            statusIs 501

    describe "getApiV2MoveDamageClassByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveDamageClassByTextR "id_example"
            statusIs 501

    describe "getApiV2NatureR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2NatureR
            statusIs 501

    describe "getApiV2NatureByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2NatureByTextR "id_example"
            statusIs 501

    describe "getApiV2PokeathlonStatR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokeathlonStatR
            statusIs 501

    describe "getApiV2PokeathlonStatByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokeathlonStatByTextR "id_example"
            statusIs 501

    describe "getApiV2PokemonColorR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonColorR
            statusIs 501

    describe "getApiV2PokemonColorByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonColorByTextR "id_example"
            statusIs 501

    describe "getApiV2PokemonFormR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonFormR
            statusIs 501

    describe "getApiV2PokemonFormByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonFormByTextR "id_example"
            statusIs 501

    describe "getApiV2PokemonHabitatR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonHabitatR
            statusIs 501

    describe "getApiV2PokemonHabitatByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonHabitatByTextR "id_example"
            statusIs 501

    describe "getApiV2PokemonR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonR
            statusIs 501

    describe "getApiV2PokemonByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonByTextR "id_example"
            statusIs 501

    describe "getApiV2PokemonShapeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonShapeR
            statusIs 501

    describe "getApiV2PokemonShapeByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonShapeByTextR "id_example"
            statusIs 501

    describe "getApiV2PokemonSpeciesR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokemonSpeciesR
            statusIs 501

    describe "getApiV2PokemonSpeciesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokemonSpeciesByTextR "id_example"
            statusIs 501

    describe "getApiV2StatR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2StatR
            statusIs 501

    describe "getApiV2StatByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2StatByTextR "id_example"
            statusIs 501

    describe "getApiV2TypeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2TypeR
            statusIs 501

    describe "getApiV2TypeByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2TypeByTextR "id_example"
            statusIs 501
