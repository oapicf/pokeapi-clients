{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.UtilitySpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2LanguageR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2LanguageR
            statusIs 501

    describe "getApiV2LanguageByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2LanguageByTextR "id_example"
            statusIs 501
