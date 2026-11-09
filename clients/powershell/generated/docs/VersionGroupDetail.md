# VersionGroupDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Order** | **Int32** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**MoveLearnMethods** | [**MoveLearnMethodSummary[]**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**Pokedexes** | [**PokedexSummary[]**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**Regions** | [**RegionSummary[]**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**Versions** | [**VersionSummary[]**](VersionSummary.md) | The versions this version group owns. | [readonly] 

## Examples

- Prepare the resource
```powershell
$VersionGroupDetail = Initialize-PSOpenAPIToolsVersionGroupDetail  -Id null `
 -Name null `
 -Order null `
 -Generation null `
 -MoveLearnMethods null `
 -Pokedexes null `
 -Regions null `
 -Versions null
```

- Convert the resource to JSON
```powershell
$VersionGroupDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

