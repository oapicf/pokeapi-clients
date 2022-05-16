{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MoveTargetSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveTargetR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveTargetR
            statusIs 501

    describe "getApiV2MoveTargetByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveTargetByIntR 56
            statusIs 501
