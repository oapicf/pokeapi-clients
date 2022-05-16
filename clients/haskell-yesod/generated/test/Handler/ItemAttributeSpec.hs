{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ItemAttributeSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ItemAttributeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemAttributeR
            statusIs 501

    describe "getApiV2ItemAttributeByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemAttributeByIntR 56
            statusIs 501
