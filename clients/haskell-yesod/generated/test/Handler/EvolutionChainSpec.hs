{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.EvolutionChainSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2EvolutionChainR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2EvolutionChainR
            statusIs 501

    describe "getApiV2EvolutionChainByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2EvolutionChainByIntR 56
            statusIs 501
