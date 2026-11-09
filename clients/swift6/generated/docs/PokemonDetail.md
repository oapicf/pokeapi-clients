# PokemonDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**baseExperience** | **Int** | The base experience gained for defeating this Pokémon. | [optional] 
**height** | **Int** | The height of this Pokémon in decimetres. | [optional] 
**isDefault** | **Bool** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**order** | **Int** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**weight** | **Int** | The weight of this Pokémon in hectograms. | [optional] 
**abilities** | [PokemonAbility] | A list of abilities this Pokémon could potentially have. | [readonly] 
**pastAbilities** | [PokemonPastAbility] | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**forms** | [PokemonFormSummary] | A list of forms this Pokémon can take on. | [readonly] 
**gameIndices** | [PokemonGameIndex] | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**heldItems** | [PokemonHeldItemSummary] | A list of items this Pokémon may be holding when encountered. | [readonly] 
**locationAreaEncounters** | **String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**moves** | [PokemonMove] | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**stats** | [PokemonStat] | A list of base stat values for this Pokémon. | [readonly] 
**pastStats** | [PokemonPastStat] | A list of details showing stats this pokémon had in previous generations | [readonly] 
**types** | [PokemonType] | A list of details showing types this Pokémon has. | [readonly] 
**pastTypes** | [PokemonPastType] | A list of details showing types this pokémon had in previous generations | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


