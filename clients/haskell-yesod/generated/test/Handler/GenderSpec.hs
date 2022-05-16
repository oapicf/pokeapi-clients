{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.GenderSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2GenderR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2GenderR
            statusIs 501

    describe "getApiV2GenderByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2GenderByIntR 56
            statusIs 501
