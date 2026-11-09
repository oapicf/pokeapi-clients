# PokemonEvolution
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **version\_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. | [default to null] |
| **is\_default** | **Boolean** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] [default to null] |
| **item** | [**ItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. | [default to null] |
| **trigger** | [**EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | [default to null] |
| **gender** | **Integer** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] [default to null] |
| **held\_item** | [**ItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | [default to null] |
| **known\_move** | [**PokemonEvolution_known_move**](PokemonEvolution_known_move.md) |  | [default to null] |
| **known\_move\_type** | [**PokemonEvolution_known_move**](PokemonEvolution_known_move.md) |  | [default to null] |
| **location** | [**LocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. | [default to null] |
| **min\_level** | **Integer** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null] |
| **min\_happiness** | **Integer** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null] |
| **min\_beauty** | **Integer** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null] |
| **min\_affection** | **Integer** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null] |
| **near\_special\_rock** | **Boolean** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] [default to null] |
| **needs\_multiplayer** | **Boolean** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] [default to null] |
| **needs\_overworld\_rain** | **Boolean** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] [default to null] |
| **party\_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to null] |
| **party\_type** | [**TypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to null] |
| **relative\_physical\_stats** | **Integer** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] [default to null] |
| **time\_of\_day** | **String** | The required time of day. Day or night. | [optional] [default to null] |
| **trade\_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | [default to null] |
| **turn\_upside\_down** | **Boolean** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] [default to null] |
| **region** | [**RegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. | [default to null] |
| **required\_pokemon\_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | [default to null] |
| **evolved\_pokemon\_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | [default to null] |
| **used\_move** | [**MoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | [default to null] |
| **min\_move\_count** | **Integer** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] [default to null] |
| **min\_steps** | **Integer** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] [default to null] |
| **min\_damage\_taken** | **Integer** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] [default to null] |
| **allowed\_natures** | [**List**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [default to null] |
| **condition\_expression** | [**EvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

