{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MovesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveAilmentR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveAilmentR
            statusIs 501

    describe "getApiV2MoveAilmentByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveAilmentByTextR "id_example"
            statusIs 501

    describe "getApiV2MoveBattleStyleR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveBattleStyleR
            statusIs 501

    describe "getApiV2MoveBattleStyleByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveBattleStyleByTextR "id_example"
            statusIs 501

    describe "getApiV2MoveCategoryR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveCategoryR
            statusIs 501

    describe "getApiV2MoveCategoryByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveCategoryByTextR "id_example"
            statusIs 501

    describe "getApiV2MoveLearnMethodR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveLearnMethodR
            statusIs 501

    describe "getApiV2MoveLearnMethodByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveLearnMethodByTextR "id_example"
            statusIs 501

    describe "getApiV2MoveR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveR
            statusIs 501

    describe "getApiV2MoveByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveByTextR "id_example"
            statusIs 501

    describe "getApiV2MoveTargetR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveTargetR
            statusIs 501

    describe "getApiV2MoveTargetByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveTargetByTextR "id_example"
            statusIs 501
