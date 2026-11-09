
# PokemonDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The identifier for this resource. |  [readonly] |
| **name** | **kotlin.String** | The name for this resource. |  |
| **abilities** | [**kotlin.collections.List&lt;PokemonAbility&gt;**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. |  [readonly] |
| **pastAbilities** | [**kotlin.collections.List&lt;PokemonPastAbility&gt;**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations |  [readonly] |
| **forms** | [**kotlin.collections.List&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. |  [readonly] |
| **gameIndices** | [**kotlin.collections.List&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. |  [readonly] |
| **heldItems** | [**kotlin.collections.List&lt;PokemonHeldItemSummary&gt;**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. |  [readonly] |
| **locationAreaEncounters** | **kotlin.String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. |  [readonly] |
| **moves** | [**kotlin.collections.List&lt;PokemonMove&gt;**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. |  [readonly] |
| **species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. |  |
| **sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; |  [readonly] |
| **cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; |  [readonly] |
| **stats** | [**kotlin.collections.List&lt;PokemonStat&gt;**](PokemonStat.md) | A list of base stat values for this Pokémon. |  [readonly] |
| **pastStats** | [**kotlin.collections.List&lt;PokemonPastStat&gt;**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations |  [readonly] |
| **types** | [**kotlin.collections.List&lt;PokemonType&gt;**](PokemonType.md) | A list of details showing types this Pokémon has. |  [readonly] |
| **pastTypes** | [**kotlin.collections.List&lt;PokemonPastType&gt;**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations |  [readonly] |
| **baseExperience** | **kotlin.Int** | The base experience gained for defeating this Pokémon. |  [optional] |
| **height** | **kotlin.Int** | The height of this Pokémon in decimetres. |  [optional] |
| **isDefault** | **kotlin.Boolean** | Set for exactly one Pokémon used as the default for each species. |  [optional] |
| **order** | **kotlin.Int** | Order for sorting. Almost national order, except families are grouped together. |  [optional] |
| **weight** | **kotlin.Int** | The weight of this Pokémon in hectograms. |  [optional] |



