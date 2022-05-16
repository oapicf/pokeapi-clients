{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.LocationAreaSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2LocationAreaR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2LocationAreaR
            statusIs 501

    describe "getApiV2LocationAreaByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2LocationAreaByIntR 56
            statusIs 501
