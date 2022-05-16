{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EvolutionTriggerSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EvolutionTriggerR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EvolutionTriggerR
            statusIs 501

    describe "getApiV2EvolutionTriggerByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EvolutionTriggerByIntR 56
            statusIs 501
