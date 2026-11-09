# PokemonShapeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**AwesomeNames** | [**PokemonShapeAwesomeName[]**](PokemonShapeAwesomeName.md) | The &quot;&quot;scientific&quot;&quot; name of this Pokémon shape listed in different languages. | [readonly] 
**Names** | [**PokemonShapeName[]**](PokemonShapeName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of the Pokémon species that have this shape. | [readonly] 

## Examples

- Prepare the resource
```powershell
$PokemonShapeDetail = Initialize-PSOpenAPIToolsPokemonShapeDetail  -Id null `
 -Name null `
 -AwesomeNames null `
 -Names null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$PokemonShapeDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

