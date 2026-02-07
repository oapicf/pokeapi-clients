{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ContestsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ContestEffectR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ContestEffectR
            statusIs 501

    describe "getApiV2ContestEffectByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ContestEffectByTextR "id_example"
            statusIs 501

    describe "getApiV2ContestTypeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ContestTypeR
            statusIs 501

    describe "getApiV2ContestTypeByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ContestTypeByTextR "id_example"
            statusIs 501

    describe "getApiV2SuperContestEffectR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2SuperContestEffectR
            statusIs 501

    describe "getApiV2SuperContestEffectByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2SuperContestEffectByTextR "id_example"
            statusIs 501
