{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.GenerationSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2GenerationR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2GenerationR
            statusIs 501

    describe "getApiV2GenerationByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2GenerationByIntR 56
            statusIs 501
