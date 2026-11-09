# PokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly]
**name** | **String** | The name for this resource. | 
**base_experience** | Option<**i32**> | The base experience gained for defeating this Pokémon. | [optional]
**height** | Option<**i32**> | The height of this Pokémon in decimetres. | [optional]
**is_default** | Option<**bool**> | Set for exactly one Pokémon used as the default for each species. | [optional]
**order** | Option<**i32**> | Order for sorting. Almost national order, except families are grouped together. | [optional]
**weight** | Option<**i32**> | The weight of this Pokémon in hectograms. | [optional]
**abilities** | [**Vec<models::PokemonAbility>**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly]
**past_abilities** | [**Vec<models::PokemonPastAbility>**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly]
**forms** | [**Vec<models::PokemonFormSummary>**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly]
**game_indices** | [**Vec<models::PokemonGameIndex>**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly]
**held_items** | [**Vec<models::PokemonHeldItemSummary>**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly]
**location_area_encounters** | **String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly]
**moves** | [**Vec<models::PokemonMove>**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly]
**species** | [**models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [**models::PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a> | [readonly]
**cries** | [**models::PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a> | [readonly]
**stats** | [**Vec<models::PokemonStat>**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly]
**past_stats** | [**Vec<models::PokemonPastStat>**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly]
**types** | [**Vec<models::PokemonType>**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly]
**past_types** | [**Vec<models::PokemonPastType>**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


