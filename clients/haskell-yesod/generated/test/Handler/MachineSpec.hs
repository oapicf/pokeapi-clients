{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MachineSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MachineR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MachineR
            statusIs 501

    describe "getApiV2MachineByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MachineByIntR 56
            statusIs 501
