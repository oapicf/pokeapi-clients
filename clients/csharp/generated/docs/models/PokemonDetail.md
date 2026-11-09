# Org.OpenAPITools.Model.PokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Abilities** | [**List&lt;PokemonAbility&gt;**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**PastAbilities** | [**List&lt;PokemonPastAbility&gt;**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**Forms** | [**List&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**GameIndices** | [**List&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**HeldItems** | [**List&lt;PokemonHeldItemSummary&gt;**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**LocationAreaEncounters** | **string** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**Moves** | [**List&lt;PokemonMove&gt;**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**Sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**Cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**Stats** | [**List&lt;PokemonStat&gt;**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**PastStats** | [**List&lt;PokemonPastStat&gt;**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**Types** | [**List&lt;PokemonType&gt;**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**PastTypes** | [**List&lt;PokemonPastType&gt;**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 
**BaseExperience** | **int** | The base experience gained for defeating this Pokémon. | [optional] 
**Height** | **int** | The height of this Pokémon in decimetres. | [optional] 
**IsDefault** | **bool** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**Order** | **int** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**Weight** | **int** | The weight of this Pokémon in hectograms. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

