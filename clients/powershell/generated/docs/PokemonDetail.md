# PokemonDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**BaseExperience** | **Int32** |  | [optional] 
**Height** | **Int32** |  | [optional] 
**IsDefault** | **Boolean** |  | [optional] 
**Order** | **Int32** |  | [optional] 
**Weight** | **Int32** |  | [optional] 
**Abilities** | [**PokemonDetailAbilitiesInner[]**](PokemonDetailAbilitiesInner.md) |  | [readonly] 
**PastAbilities** | [**PokemonDetailPastAbilitiesInner[]**](PokemonDetailPastAbilitiesInner.md) |  | [readonly] 
**Forms** | [**PokemonFormSummary[]**](PokemonFormSummary.md) |  | [readonly] 
**GameIndices** | [**PokemonGameIndex[]**](PokemonGameIndex.md) |  | [readonly] 
**HeldItems** | [**PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  | 
**LocationAreaEncounters** | **String** |  | [readonly] 
**Moves** | [**PokemonDetailMovesInner[]**](PokemonDetailMovesInner.md) |  | [readonly] 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**Sprites** | [**PokemonDetailSprites**](PokemonDetailSprites.md) |  | 
**Cries** | [**PokemonDetailCries**](PokemonDetailCries.md) |  | 
**Stats** | [**PokemonStat[]**](PokemonStat.md) |  | [readonly] 
**Types** | [**PokemonDetailTypesInner[]**](PokemonDetailTypesInner.md) |  | [readonly] 
**PastTypes** | [**PokemonDetailPastTypesInner[]**](PokemonDetailPastTypesInner.md) |  | [readonly] 

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
 -Types null `
 -PastTypes null
```

- Convert the resource to JSON
```powershell
$PokemonDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

