{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.NatureSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2NatureR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2NatureR
            statusIs 501

    describe "getApiV2NatureByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2NatureByIntR 56
            statusIs 501
