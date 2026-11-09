# PokemonDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **base\_experience** | **Integer** | The base experience gained for defeating this Pokémon. | [optional] [default to null] |
| **height** | **Integer** | The height of this Pokémon in decimetres. | [optional] [default to null] |
| **is\_default** | **Boolean** | Set for exactly one Pokémon used as the default for each species. | [optional] [default to null] |
| **order** | **Integer** | Order for sorting. Almost national order, except families are grouped together. | [optional] [default to null] |
| **weight** | **Integer** | The weight of this Pokémon in hectograms. | [optional] [default to null] |
| **abilities** | [**List**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [default to null] |
| **past\_abilities** | [**List**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [default to null] |
| **forms** | [**List**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [default to null] |
| **game\_indices** | [**List**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [default to null] |
| **held\_items** | [**List**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [default to null] |
| **location\_area\_encounters** | **String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [default to null] |
| **moves** | [**List**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [default to null] |
| **species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | [default to null] |
| **sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [default to null] |
| **cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [default to null] |
| **stats** | [**List**](PokemonStat.md) | A list of base stat values for this Pokémon. | [default to null] |
| **past\_stats** | [**List**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [default to null] |
| **types** | [**List**](PokemonType.md) | A list of details showing types this Pokémon has. | [default to null] |
| **past\_types** | [**List**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

