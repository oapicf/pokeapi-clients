# PokemonDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**BaseExperience** | **Int32** | The base experience gained for defeating this Pokémon. | [optional] 
**Height** | **Int32** | The height of this Pokémon in decimetres. | [optional] 
**IsDefault** | **Boolean** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**Order** | **Int32** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**Weight** | **Int32** | The weight of this Pokémon in hectograms. | [optional] 
**Abilities** | [**PokemonAbility[]**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**PastAbilities** | [**PokemonPastAbility[]**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**Forms** | [**PokemonFormSummary[]**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**GameIndices** | [**PokemonGameIndex[]**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**HeldItems** | [**PokemonHeldItemSummary[]**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**LocationAreaEncounters** | **String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**Moves** | [**PokemonMove[]**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**Sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**Cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**Stats** | [**PokemonStat[]**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**PastStats** | [**PokemonPastStat[]**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**Types** | [**PokemonType[]**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**PastTypes** | [**PokemonPastType[]**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 

## Examples

- Prepare the resource
```powershell
$PokemonDetail = Initialize-PSOpenAPIToolsPokemonDetail  -Id null `
 -Name null `
 -BaseExperience null `
 -Height null `
 -IsDefault null `
 -Order null `
 -Weight null `
 -Abilities null `
 -PastAbilities null `
 -Forms null `
 -GameIndices null `
 -HeldItems null `
 -LocationAreaEncounters null `
 -Moves null `
 -Species null `
 -Sprites null `
 -Cries null `
 -Stats null `
 -PastStats null `
 -Types null `
 -PastTypes null
```

- Convert the resource to JSON
```powershell
$PokemonDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

