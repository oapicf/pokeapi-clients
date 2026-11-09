# OAIPokedexDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**isMainSeries** | **NSNumber*** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [**NSArray&lt;OAIPokedexDescription&gt;***](OAIPokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**names** | [**NSArray&lt;OAIPokedexName&gt;***](OAIPokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemonEntries** | [**NSArray&lt;OAIPokemonDexNumber&gt;***](OAIPokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**OAIRegionSummary***](OAIRegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**versionGroups** | [**NSArray&lt;OAIVersionGroupSummary&gt;***](OAIVersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


