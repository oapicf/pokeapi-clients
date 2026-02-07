# PokemonFormDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Order** | **Int32** |  | [optional] 
**FormOrder** | **Int32** |  | [optional] 
**IsDefault** | **Boolean** |  | [optional] 
**IsBattleOnly** | **Boolean** |  | [optional] 
**IsMega** | **Boolean** |  | [optional] 
**FormName** | **String** |  | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) |  | 
**Sprites** | [**PokemonFormDetailSprites**](PokemonFormDetailSprites.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**FormNames** | [**PokemonFormDetailFormNamesInner[]**](PokemonFormDetailFormNamesInner.md) |  | 
**Names** | [**PokemonFormDetailFormNamesInner[]**](PokemonFormDetailFormNamesInner.md) |  | 
**Types** | [**PokemonDetailTypesInner[]**](PokemonDetailTypesInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonFormDetail = Initialize-PSOpenAPIToolsPokemonFormDetail  -Id null `
 -Name null `
 -Order null `
 -FormOrder null `
 -IsDefault null `
 -IsBattleOnly null `
 -IsMega null `
 -FormName null `
 -Pokemon null `
 -Sprites null `
 -VersionGroup null `
 -FormNames null `
 -Names null `
 -Types null
```

- Convert the resource to JSON
```powershell
$PokemonFormDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

