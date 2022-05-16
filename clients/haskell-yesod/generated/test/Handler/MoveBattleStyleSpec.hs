{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MoveBattleStyleSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveBattleStyleR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveBattleStyleR
            statusIs 501

    describe "getApiV2MoveBattleStyleByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveBattleStyleByIntR 56
            statusIs 501
