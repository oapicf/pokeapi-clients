{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.VersionGroupSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2VersionGroupR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2VersionGroupR
            statusIs 501

    describe "getApiV2VersionGroupByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2VersionGroupByIntR 56
            statusIs 501
