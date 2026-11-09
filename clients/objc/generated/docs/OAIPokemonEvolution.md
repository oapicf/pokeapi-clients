# OAIPokemonEvolution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionGroup** | [**OAIVersionGroupSummary***](OAIVersionGroupSummary.md) | The version group in which these evolution requirements apply. | 
**isDefault** | **NSNumber*** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] 
**item** | [**OAIItemSummary***](OAIItemSummary.md) | The item required to cause evolution this into Pokémon species. | 
**trigger** | [**OAIEvolutionTriggerSummary***](OAIEvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | 
**gender** | **NSNumber*** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] 
**heldItem** | [**OAIItemSummary***](OAIItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | 
**knownMove** | [**OAIPokemonEvolutionKnownMove***](OAIPokemonEvolutionKnownMove.md) |  | 
**knownMoveType** | [**OAIPokemonEvolutionKnownMove***](OAIPokemonEvolutionKnownMove.md) |  | 
**location** | [**OAILocationSummary***](OAILocationSummary.md) | The location the evolution must be triggered at. | 
**minLevel** | **NSNumber*** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**minHappiness** | **NSNumber*** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**minBeauty** | **NSNumber*** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**minAffection** | **NSNumber*** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**nearSpecialRock** | **NSNumber*** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] 
**needsMultiplayer** | **NSNumber*** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] 
**needsOverworldRain** | **NSNumber*** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] 
**partySpecies** | [**OAIPokemonSpeciesSummary***](OAIPokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**partyType** | [**OAITypeSummary***](OAITypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**relativePhysicalStats** | **NSNumber*** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] 
**timeOfDay** | **NSString*** | The required time of day. Day or night. | [optional] 
**tradeSpecies** | [**OAIPokemonSpeciesSummary***](OAIPokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | 
**turnUpsideDown** | **NSNumber*** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] 
**region** | [**OAIRegionSummary***](OAIRegionSummary.md) | The required region in which this evolution can occur. | 
**requiredPokemonForm** | [**OAIPokemonFormSummary***](OAIPokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | 
**evolvedPokemonForm** | [**OAIPokemonFormSummary***](OAIPokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | 
**usedMove** | [**OAIMoveSummary***](OAIMoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | 
**minMoveCount** | **NSNumber*** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] 
**minSteps** | **NSNumber*** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] 
**minDamageTaken** | **NSNumber*** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] 
**allowedNatures** | [**NSArray&lt;OAINatureSummary&gt;***](OAINatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] 
**conditionExpression** | [**OAIEvolutionConditionExpression***](OAIEvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


