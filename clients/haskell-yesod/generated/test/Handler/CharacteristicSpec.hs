{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CharacteristicSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2CharacteristicR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2CharacteristicR
            statusIs 501

    describe "getApiV2CharacteristicByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2CharacteristicByIntR 56
            statusIs 501
