{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MoveDamageClassSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MoveDamageClassR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MoveDamageClassR
            statusIs 501

    describe "getApiV2MoveDamageClassByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MoveDamageClassByIntR 56
            statusIs 501
