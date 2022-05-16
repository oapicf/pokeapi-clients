{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ItemCategorySpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ItemCategoryR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemCategoryR
            statusIs 501

    describe "getApiV2ItemCategoryByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemCategoryByIntR 56
            statusIs 501
