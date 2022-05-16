{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LanguageSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2LanguageR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2LanguageR
            statusIs 501

    describe "getApiV2LanguageByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2LanguageByIntR 56
            statusIs 501
