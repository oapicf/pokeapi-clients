# OAIPokemonDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**baseExperience** | **NSNumber*** | The base experience gained for defeating this Pokémon. | [optional] 
**height** | **NSNumber*** | The height of this Pokémon in decimetres. | [optional] 
**isDefault** | **NSNumber*** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**order** | **NSNumber*** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**weight** | **NSNumber*** | The weight of this Pokémon in hectograms. | [optional] 
**abilities** | [**NSArray&lt;OAIPokemonAbility&gt;***](OAIPokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**pastAbilities** | [**NSArray&lt;OAIPokemonPastAbility&gt;***](OAIPokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**forms** | [**NSArray&lt;OAIPokemonFormSummary&gt;***](OAIPokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**gameIndices** | [**NSArray&lt;OAIPokemonGameIndex&gt;***](OAIPokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**heldItems** | [**NSArray&lt;OAIPokemonHeldItemSummary&gt;***](OAIPokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**locationAreaEncounters** | **NSString*** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**moves** | [**NSArray&lt;OAIPokemonMove&gt;***](OAIPokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**species** | [**OAIPokemonSpeciesSummary***](OAIPokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [**OAIPokemonSprites***](OAIPokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**cries** | [**OAIPokemonCries***](OAIPokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**stats** | [**NSArray&lt;OAIPokemonStat&gt;***](OAIPokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**pastStats** | [**NSArray&lt;OAIPokemonPastStat&gt;***](OAIPokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**types** | [**NSArray&lt;OAIPokemonType&gt;***](OAIPokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**pastTypes** | [**NSArray&lt;OAIPokemonPastType&gt;***](OAIPokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


