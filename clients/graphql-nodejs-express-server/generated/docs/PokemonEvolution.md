# PokemonEvolution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionGroup** | [***VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. | [default to null]
**isDefault** | **Boolean!** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] [default to null]
**item** | [***ItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. | [default to null]
**trigger** | [***EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | [default to null]
**gender** | **Int** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] [default to null]
**heldItem** | [***ItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | [default to null]
**knownMove** | [***PokemonEvolutionKnownMove**](PokemonEvolution_known_move.md) |  | [default to null]
**knownMoveType** | [***PokemonEvolutionKnownMove**](PokemonEvolution_known_move.md) |  | [default to null]
**location** | [***LocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. | [default to null]
**minLevel** | **Int** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**minHappiness** | **Int** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**minBeauty** | **Int** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**minAffection** | **Int** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**nearSpecialRock** | **Boolean!** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] [default to null]
**needsMultiplayer** | **Boolean!** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] [default to null]
**needsOverworldRain** | **Boolean!** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] [default to null]
**partySpecies** | [***PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to null]
**partyType** | [***TypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to null]
**relativePhysicalStats** | **Int** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] [default to null]
**timeOfDay** | **String!** | The required time of day. Day or night. | [optional] [default to null]
**tradeSpecies** | [***PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | [default to null]
**turnUpsideDown** | **Boolean!** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] [default to null]
**region** | [***RegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. | [default to null]
**requiredPokemonForm** | [***PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | [default to null]
**evolvedPokemonForm** | [***PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | [default to null]
**usedMove** | [***MoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | [default to null]
**minMoveCount** | **Int** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] [default to null]
**minSteps** | **Int** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] [default to null]
**minDamageTaken** | **Int** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] [default to null]
**allowedNatures** | [**NatureSummary**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] [default to null]
**conditionExpression** | [***EvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


