{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EvolutionSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EvolutionChainR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EvolutionChainR
            statusIs 501

    describe "getApiV2EvolutionChainByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EvolutionChainByTextR "id_example"
            statusIs 501

    describe "getApiV2EvolutionTriggerR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EvolutionTriggerR
            statusIs 501

    describe "getApiV2EvolutionTriggerByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EvolutionTriggerByTextR "id_example"
            statusIs 501
