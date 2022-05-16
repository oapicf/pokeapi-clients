{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Version where

import           Import


-- | 
--
-- operationId: versionList
getApiV2VersionR :: Handler Value
getApiV2VersionR = notImplemented

-- | 
--
-- operationId: versionRead
getApiV2VersionByIntR :: Int -- ^ 
                      -> Handler Value
getApiV2VersionByIntR id = notImplemented
