{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ItemSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ItemR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ItemR
            statusIs 501

    describe "getApiV2ItemByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ItemByIntR 56
            statusIs 501
