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
