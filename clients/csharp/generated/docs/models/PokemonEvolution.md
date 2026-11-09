# Org.OpenAPITools.Model.PokemonEvolution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. | 
**Trigger** | [**EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | 
**KnownMove** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  | 
**KnownMoveType** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  | 
**IsDefault** | **bool** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] 
**Item** | [**ItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. | 
**Gender** | **int** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] 
**HeldItem** | [**ItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | 
**Location** | [**LocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. | 
**MinLevel** | **int** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**MinHappiness** | **int** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**MinBeauty** | **int** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**MinAffection** | **int** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**NearSpecialRock** | **bool** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] 
**NeedsMultiplayer** | **bool** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] 
**NeedsOverworldRain** | **bool** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] 
**PartySpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**PartyType** | [**TypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**RelativePhysicalStats** | **int** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] 
**TimeOfDay** | **string** | The required time of day. Day or night. | [optional] 
**TradeSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | 
**TurnUpsideDown** | **bool** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] 
**Region** | [**RegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. | 
**RequiredPokemonForm** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | 
**EvolvedPokemonForm** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | 
**UsedMove** | [**MoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | 
**MinMoveCount** | **int** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] 
**MinSteps** | **int** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] 
**MinDamageTaken** | **int** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] 
**AllowedNatures** | [**List&lt;NatureSummary&gt;**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] 
**ConditionExpression** | [**EvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

