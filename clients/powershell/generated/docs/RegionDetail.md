# RegionDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Locations** | [**LocationSummary[]**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly] 
**MainGeneration** | [**GenerationSummary**](GenerationSummary.md) | The generation this region was introduced in. | [readonly] 
**Names** | [**RegionName[]**](RegionName.md) | The name of this resource listed in different languages. | [readonly] 
**Pokedexes** | [**PokedexSummary[]**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly] 
**VersionGroups** | [**VersionGroupSummary[]**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly] 

## Examples

- Prepare the resource
```powershell
$RegionDetail = Initialize-PSOpenAPIToolsRegionDetail  -Id null `
 -Name null `
 -Locations null `
 -MainGeneration null `
 -Names null `
 -Pokedexes null `
 -VersionGroups null
```

- Convert the resource to JSON
```powershell
$RegionDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

