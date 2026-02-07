{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Contests where

import           Import


-- | List contest effects
--
-- Contest effects refer to the effects of moves when used in contests.
-- operationId: contestEffectList
getApiV2ContestEffectR :: Handler Value
getApiV2ContestEffectR = notImplemented

-- | Get contest effect
--
-- Contest effects refer to the effects of moves when used in contests.
-- operationId: contestEffectRetrieve
getApiV2ContestEffectByTextR :: Text -- ^ This parameter can be a string or an integer.
                             -> Handler Value
getApiV2ContestEffectByTextR id = notImplemented

-- | List contest types
--
-- Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
-- operationId: contestTypeList
getApiV2ContestTypeR :: Handler Value
getApiV2ContestTypeR = notImplemented

-- | Get contest type
--
-- Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
-- operationId: contestTypeRetrieve
getApiV2ContestTypeByTextR :: Text -- ^ This parameter can be a string or an integer.
                           -> Handler Value
getApiV2ContestTypeByTextR id = notImplemented

-- | List super contest effects
--
-- Super contest effects refer to the effects of moves when used in super contests.
-- operationId: superContestEffectList
getApiV2SuperContestEffectR :: Handler Value
getApiV2SuperContestEffectR = notImplemented

-- | Get super contest effect
--
-- Super contest effects refer to the effects of moves when used in super contests.
-- operationId: superContestEffectRetrieve
getApiV2SuperContestEffectByTextR :: Text -- ^ This parameter can be a string or an integer.
                                  -> Handler Value
getApiV2SuperContestEffectByTextR id = notImplemented
