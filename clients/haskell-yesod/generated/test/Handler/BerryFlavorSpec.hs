{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BerryFlavorSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2BerryFlavorR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2BerryFlavorR
            statusIs 501

    describe "getApiV2BerryFlavorByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2BerryFlavorByIntR 56
            statusIs 501
