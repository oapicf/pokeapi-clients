{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Evolution where

import           Import


-- | List evolution chains
--
-- Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
-- operationId: evolutionChainList
getApiV2EvolutionChainR :: Handler Value
getApiV2EvolutionChainR = notImplemented

-- | Get evolution chain
--
-- Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
-- operationId: evolutionChainRetrieve
getApiV2EvolutionChainByTextR :: Text -- ^ This parameter can be a string or an integer.
                              -> Handler Value
getApiV2EvolutionChainByTextR id = notImplemented

-- | List evolution triggers
--
-- Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
-- operationId: evolutionTriggerList
getApiV2EvolutionTriggerR :: Handler Value
getApiV2EvolutionTriggerR = notImplemented

-- | Get evolution trigger
--
-- Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
-- operationId: evolutionTriggerRetrieve
getApiV2EvolutionTriggerByTextR :: Text -- ^ This parameter can be a string or an integer.
                                -> Handler Value
getApiV2EvolutionTriggerByTextR id = notImplemented

-- | List evolution variables
--
-- Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.
-- operationId: evolutionVariableList
getApiV2EvolutionVariableR :: Handler Value
getApiV2EvolutionVariableR = notImplemented

-- | Get evolution variable
--
-- Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.
-- operationId: evolutionVariableRetrieve
getApiV2EvolutionVariableByTextR :: Text -- ^ This parameter can be a string or an integer.
                                 -> Handler Value
getApiV2EvolutionVariableByTextR id = notImplemented
