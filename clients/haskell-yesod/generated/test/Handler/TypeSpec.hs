{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.TypeSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2TypeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2TypeR
            statusIs 501

    describe "getApiV2TypeByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2TypeByIntR 56
            statusIs 501
