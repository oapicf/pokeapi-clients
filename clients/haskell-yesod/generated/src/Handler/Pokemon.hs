{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Pokemon where

import           Import


-- | 
--
-- Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
-- operationId: abilityList
getApiV2AbilityR :: Handler Value
getApiV2AbilityR = notImplemented

-- | 
--
-- Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
-- operationId: abilityRetrieve
getApiV2AbilityByTextR :: Text -- ^ This parameter can be a string or an integer.
                       -> Handler Value
getApiV2AbilityByTextR id = notImplemented

-- | List charecterictics
--
-- Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
-- operationId: characteristicList
getApiV2CharacteristicR :: Handler Value
getApiV2CharacteristicR = notImplemented

-- | Get characteristic
--
-- Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
-- operationId: characteristicRetrieve
getApiV2CharacteristicByTextR :: Text -- ^ This parameter can be a string or an integer.
                              -> Handler Value
getApiV2CharacteristicByTextR id = notImplemented

-- | List egg groups
--
-- Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
-- operationId: eggGroupList
getApiV2EggGroupR :: Handler Value
getApiV2EggGroupR = notImplemented

-- | Get egg group
--
-- Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
-- operationId: eggGroupRetrieve
getApiV2EggGroupByTextR :: Text -- ^ This parameter can be a string or an integer.
                        -> Handler Value
getApiV2EggGroupByTextR id = notImplemented

-- | List genders
--
-- Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
-- operationId: genderList
getApiV2GenderR :: Handler Value
getApiV2GenderR = notImplemented

-- | Get gender
--
-- Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
-- operationId: genderRetrieve
getApiV2GenderByTextR :: Text -- ^ This parameter can be a string or an integer.
                      -> Handler Value
getApiV2GenderByTextR id = notImplemented

-- | List growth rates
--
-- Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
-- operationId: growthRateList
getApiV2GrowthRateR :: Handler Value
getApiV2GrowthRateR = notImplemented

-- | Get growth rate
--
-- Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
-- operationId: growthRateRetrieve
getApiV2GrowthRateByTextR :: Text -- ^ This parameter can be a string or an integer.
                          -> Handler Value
getApiV2GrowthRateByTextR id = notImplemented

-- | List move damage classes
--
-- Damage classes moves can have, e.g. physical, special, or non-damaging.
-- operationId: moveDamageClassList
getApiV2MoveDamageClassR :: Handler Value
getApiV2MoveDamageClassR = notImplemented

-- | Get move damage class
--
-- Damage classes moves can have, e.g. physical, special, or non-damaging.
-- operationId: moveDamageClassRetrieve
getApiV2MoveDamageClassByTextR :: Text -- ^ This parameter can be a string or an integer.
                               -> Handler Value
getApiV2MoveDamageClassByTextR id = notImplemented

-- | List natures
--
-- Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
-- operationId: natureList
getApiV2NatureR :: Handler Value
getApiV2NatureR = notImplemented

-- | Get nature
--
-- Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
-- operationId: natureRetrieve
getApiV2NatureByTextR :: Text -- ^ This parameter can be a string or an integer.
                      -> Handler Value
getApiV2NatureByTextR id = notImplemented

-- | List pokeathlon stats
--
-- Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
-- operationId: pokeathlonStatList
getApiV2PokeathlonStatR :: Handler Value
getApiV2PokeathlonStatR = notImplemented

-- | Get pokeathlon stat
--
-- Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
-- operationId: pokeathlonStatRetrieve
getApiV2PokeathlonStatByTextR :: Text -- ^ This parameter can be a string or an integer.
                              -> Handler Value
getApiV2PokeathlonStatByTextR id = notImplemented

-- | List pokemon colors
--
-- Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
-- operationId: pokemonColorList
getApiV2PokemonColorR :: Handler Value
getApiV2PokemonColorR = notImplemented

-- | Get pokemon color
--
-- Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
-- operationId: pokemonColorRetrieve
getApiV2PokemonColorByTextR :: Text -- ^ This parameter can be a string or an integer.
                            -> Handler Value
getApiV2PokemonColorByTextR id = notImplemented

-- | List pokemon forms
--
-- Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
-- operationId: pokemonFormList
getApiV2PokemonFormR :: Handler Value
getApiV2PokemonFormR = notImplemented

-- | Get pokemon form
--
-- Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
-- operationId: pokemonFormRetrieve
getApiV2PokemonFormByTextR :: Text -- ^ This parameter can be a string or an integer.
                           -> Handler Value
getApiV2PokemonFormByTextR id = notImplemented

-- | List pokemom habitas
--
-- Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
-- operationId: pokemonHabitatList
getApiV2PokemonHabitatR :: Handler Value
getApiV2PokemonHabitatR = notImplemented

-- | Get pokemom habita
--
-- Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
-- operationId: pokemonHabitatRetrieve
getApiV2PokemonHabitatByTextR :: Text -- ^ This parameter can be a string or an integer.
                              -> Handler Value
getApiV2PokemonHabitatByTextR id = notImplemented

-- | List pokemon
--
-- Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
-- operationId: pokemonList
getApiV2PokemonR :: Handler Value
getApiV2PokemonR = notImplemented

-- | Get pokemon
--
-- Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
-- operationId: pokemonRetrieve
getApiV2PokemonByTextR :: Text -- ^ This parameter can be a string or an integer.
                       -> Handler Value
getApiV2PokemonByTextR id = notImplemented

-- | List pokemon shapes
--
-- Shapes used for sorting Pokémon in a Pokédex.
-- operationId: pokemonShapeList
getApiV2PokemonShapeR :: Handler Value
getApiV2PokemonShapeR = notImplemented

-- | Get pokemon shape
--
-- Shapes used for sorting Pokémon in a Pokédex.
-- operationId: pokemonShapeRetrieve
getApiV2PokemonShapeByTextR :: Text -- ^ This parameter can be a string or an integer.
                            -> Handler Value
getApiV2PokemonShapeByTextR id = notImplemented

-- | List pokemon species
--
-- A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
-- operationId: pokemonSpeciesList
getApiV2PokemonSpeciesR :: Handler Value
getApiV2PokemonSpeciesR = notImplemented

-- | Get pokemon species
--
-- A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
-- operationId: pokemonSpeciesRetrieve
getApiV2PokemonSpeciesByTextR :: Text -- ^ This parameter can be a string or an integer.
                              -> Handler Value
getApiV2PokemonSpeciesByTextR id = notImplemented

-- | List stats
--
-- Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
-- operationId: statList
getApiV2StatR :: Handler Value
getApiV2StatR = notImplemented

-- | Get stat
--
-- Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
-- operationId: statRetrieve
getApiV2StatByTextR :: Text -- ^ This parameter can be a string or an integer.
                    -> Handler Value
getApiV2StatByTextR id = notImplemented

-- | List types
--
-- Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
-- operationId: typeList
getApiV2TypeR :: Handler Value
getApiV2TypeR = notImplemented

-- | Get types
--
-- Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
-- operationId: typeRetrieve
getApiV2TypeByTextR :: Text -- ^ This parameter can be a string or an integer.
                    -> Handler Value
getApiV2TypeByTextR id = notImplemented
