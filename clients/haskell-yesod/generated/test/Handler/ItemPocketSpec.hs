{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ItemPocketSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ItemPocketR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemPocketR
            statusIs 501

    describe "getApiV2ItemPocketByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemPocketByIntR 56
            statusIs 501
