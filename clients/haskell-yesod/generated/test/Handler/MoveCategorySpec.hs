{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MoveCategorySpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveCategoryR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveCategoryR
            statusIs 501

    describe "getApiV2MoveCategoryByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveCategoryByIntR 56
            statusIs 501
