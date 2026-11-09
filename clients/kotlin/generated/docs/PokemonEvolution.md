
# PokemonEvolution

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **versionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. |  |
| **item** | [**ItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. |  |
| **trigger** | [**EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. |  |
| **heldItem** | [**ItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. |  |
| **knownMove** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  |  |
| **knownMoveType** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  |  |
| **location** | [**LocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. |  |
| **partySpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. |  |
| **partyType** | [**TypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. |  |
| **tradeSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. |  |
| **region** | [**RegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. |  |
| **requiredPokemonForm** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. |  |
| **evolvedPokemonForm** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. |  |
| **usedMove** | [**MoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. |  |
| **allowedNatures** | [**kotlin.collections.List&lt;NatureSummary&gt;**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. |  [readonly] |
| **conditionExpression** | [**EvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. |  [readonly] |
| **isDefault** | **kotlin.Boolean** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. |  [optional] |
| **gender** | **kotlin.Int** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. |  [optional] |
| **minLevel** | **kotlin.Int** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. |  [optional] |
| **minHappiness** | **kotlin.Int** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. |  [optional] |
| **minBeauty** | **kotlin.Int** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. |  [optional] |
| **minAffection** | **kotlin.Int** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. |  [optional] |
| **nearSpecialRock** | **kotlin.Boolean** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. |  [optional] |
| **needsMultiplayer** | **kotlin.Boolean** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). |  [optional] |
| **needsOverworldRain** | **kotlin.Boolean** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. |  [optional] |
| **relativePhysicalStats** | **kotlin.Int** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. |  [optional] |
| **timeOfDay** | **kotlin.String** | The required time of day. Day or night. |  [optional] |
| **turnUpsideDown** | **kotlin.Boolean** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. |  [optional] |
| **minMoveCount** | **kotlin.Int** | The minimum number of times a move must be used in order to evolve into this Pokémon species. |  [optional] |
| **minSteps** | **kotlin.Int** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. |  [optional] |
| **minDamageTaken** | **kotlin.Int** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. |  [optional] |



