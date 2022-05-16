{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MoveLearnMethodSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveLearnMethodR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveLearnMethodR
            statusIs 501

    describe "getApiV2MoveLearnMethodByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveLearnMethodByIntR 56
            statusIs 501
