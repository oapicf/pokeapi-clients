{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MoveSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveR
            statusIs 501

    describe "getApiV2MoveByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveByIntR 56
            statusIs 501
