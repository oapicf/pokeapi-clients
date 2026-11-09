# WWW::OpenAPIClient::Object::PokemonDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PokemonDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**base_experience** | **int** | The base experience gained for defeating this Pokémon. | [optional] 
**height** | **int** | The height of this Pokémon in decimetres. | [optional] 
**is_default** | **boolean** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**order** | **int** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**weight** | **int** | The weight of this Pokémon in hectograms. | [optional] 
**abilities** | [**ARRAY[PokemonAbility]**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**past_abilities** | [**ARRAY[PokemonPastAbility]**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**forms** | [**ARRAY[PokemonFormSummary]**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**game_indices** | [**ARRAY[PokemonGameIndex]**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**held_items** | [**ARRAY[PokemonHeldItemSummary]**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**location_area_encounters** | **string** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**moves** | [**ARRAY[PokemonMove]**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**stats** | [**ARRAY[PokemonStat]**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**past_stats** | [**ARRAY[PokemonPastStat]**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**types** | [**ARRAY[PokemonType]**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**past_types** | [**ARRAY[PokemonPastType]**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


