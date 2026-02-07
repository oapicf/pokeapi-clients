{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MachinesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2MachineR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2MachineR
            statusIs 501

    describe "getApiV2MachineByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2MachineByTextR "id_example"
            statusIs 501
