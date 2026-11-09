# PokeapiClient.PokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**baseExperience** | **Number** | The base experience gained for defeating this Pokémon. | [optional] 
**height** | **Number** | The height of this Pokémon in decimetres. | [optional] 
**isDefault** | **Boolean** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**order** | **Number** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**weight** | **Number** | The weight of this Pokémon in hectograms. | [optional] 
**abilities** | [**[PokemonAbility]**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**pastAbilities** | [**[PokemonPastAbility]**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**forms** | [**[PokemonFormSummary]**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**gameIndices** | [**[PokemonGameIndex]**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**heldItems** | [**[PokemonHeldItemSummary]**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**locationAreaEncounters** | **String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**moves** | [**[PokemonMove]**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**stats** | [**[PokemonStat]**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**pastStats** | [**[PokemonPastStat]**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**types** | [**[PokemonType]**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**pastTypes** | [**[PokemonPastType]**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 


