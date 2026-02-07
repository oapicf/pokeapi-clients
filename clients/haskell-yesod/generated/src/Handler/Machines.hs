{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Machines where

import           Import


-- | List machines
--
-- Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
-- operationId: machineList
getApiV2MachineR :: Handler Value
getApiV2MachineR = notImplemented

-- | Get machine
--
-- Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
-- operationId: machineRetrieve
getApiV2MachineByTextR :: Text -- ^ This parameter can be a string or an integer.
                       -> Handler Value
getApiV2MachineByTextR id = notImplemented
