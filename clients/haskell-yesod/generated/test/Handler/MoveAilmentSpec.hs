{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MoveAilmentSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveAilmentR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveAilmentR
            statusIs 501

    describe "getApiV2MoveAilmentByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveAilmentByIntR 56
            statusIs 501
