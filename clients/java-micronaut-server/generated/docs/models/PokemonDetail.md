

# PokemonDetail

The class is defined in **[PokemonDetail.java](../../src/main/java/org/openapitools/model/PokemonDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**baseExperience** | `Integer` | The base experience gained for defeating this Pokémon. |  [optional property]
**height** | `Integer` | The height of this Pokémon in decimetres. |  [optional property]
**isDefault** | `Boolean` | Set for exactly one Pokémon used as the default for each species. |  [optional property]
**order** | `Integer` | Order for sorting. Almost national order, except families are grouped together. |  [optional property]
**weight** | `Integer` | The weight of this Pokémon in hectograms. |  [optional property]
**abilities** | [`List&lt;PokemonAbility&gt;`](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. |  [readonly property]
**pastAbilities** | [`List&lt;PokemonPastAbility&gt;`](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations |  [readonly property]
**forms** | [`List&lt;PokemonFormSummary&gt;`](PokemonFormSummary.md) | A list of forms this Pokémon can take on. |  [readonly property]
**gameIndices** | [`List&lt;PokemonGameIndex&gt;`](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. |  [readonly property]
**heldItems** | [`List&lt;PokemonHeldItemSummary&gt;`](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. |  [readonly property]
**locationAreaEncounters** | `String` | A link to a list of location areas, as well as encounter details pertaining to specific versions. |  [readonly property]
**moves** | [`List&lt;PokemonMove&gt;`](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. |  [readonly property]
**species** | [`PokemonSpeciesSummary`](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [`PokemonSprites`](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; |  [readonly property]
**cries** | [`PokemonCries`](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; |  [readonly property]
**stats** | [`List&lt;PokemonStat&gt;`](PokemonStat.md) | A list of base stat values for this Pokémon. |  [readonly property]
**pastStats** | [`List&lt;PokemonPastStat&gt;`](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations |  [readonly property]
**types** | [`List&lt;PokemonType&gt;`](PokemonType.md) | A list of details showing types this Pokémon has. |  [readonly property]
**pastTypes** | [`List&lt;PokemonPastType&gt;`](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations |  [readonly property]























