{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ContestTypeSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2ContestTypeR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2ContestTypeR
            statusIs 501

    describe "getApiV2ContestTypeByIntR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2ContestTypeByIntR 56
            statusIs 501
