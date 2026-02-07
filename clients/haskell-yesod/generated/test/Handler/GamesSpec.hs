{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.GamesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiV2GenerationR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2GenerationR
            statusIs 501

    describe "getApiV2GenerationByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2GenerationByTextR "id_example"
            statusIs 501

    describe "getApiV2PokedexR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2PokedexR
            statusIs 501

    describe "getApiV2PokedexByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2PokedexByTextR "id_example"
            statusIs 501

    describe "getApiV2VersionGroupR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2VersionGroupR
            statusIs 501

    describe "getApiV2VersionGroupByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2VersionGroupByTextR "id_example"
            statusIs 501

    describe "getApiV2VersionR" $
        it "returns 501 Not Implemented" $ do
            get ApiV2VersionR
            statusIs 501

    describe "getApiV2VersionByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiV2VersionByTextR "id_example"
            statusIs 501
