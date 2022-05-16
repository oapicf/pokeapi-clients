{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.VersionSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2VersionR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2VersionR
            statusIs 501

    describe "getApiV2VersionByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2VersionByIntR 56
            statusIs 501
