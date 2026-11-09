{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Utility where

import           Import


-- | List languages
--
-- Languages for translations of API resource information.
-- operationId: languageList
getApiV2LanguageR :: Handler Value
getApiV2LanguageR = notImplemented

-- | Get language
--
-- Languages for translations of API resource information.
-- operationId: languageRetrieve
getApiV2LanguageByTextR :: Text -- ^ This parameter can be a string or an integer.
                        -> Handler Value
getApiV2LanguageByTextR id = notImplemented

-- | Get API metadata
--
-- Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).
-- operationId: metaRetrieve
getApiV2MetaR :: Handler Value
getApiV2MetaR = notImplemented
