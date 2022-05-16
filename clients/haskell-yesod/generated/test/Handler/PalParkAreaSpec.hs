{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.PalParkAreaSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2PalParkAreaR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PalParkAreaR
            statusIs 501

    describe "getApiV2PalParkAreaByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PalParkAreaByIntR 56
            statusIs 501
