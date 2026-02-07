{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ItemsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ItemAttributeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemAttributeR
            statusIs 501

    describe "getApiV2ItemAttributeByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemAttributeByTextR "id_example"
            statusIs 501

    describe "getApiV2ItemCategoryR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemCategoryR
            statusIs 501

    describe "getApiV2ItemCategoryByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemCategoryByTextR "id_example"
            statusIs 501

    describe "getApiV2ItemFlingEffectR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemFlingEffectR
            statusIs 501

    describe "getApiV2ItemFlingEffectByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemFlingEffectByTextR "id_example"
            statusIs 501

    describe "getApiV2ItemR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemR
            statusIs 501

    describe "getApiV2ItemPocketR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemPocketR
            statusIs 501

    describe "getApiV2ItemPocketByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemPocketByTextR "id_example"
            statusIs 501

    describe "getApiV2ItemByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemByTextR "id_example"
            statusIs 501
