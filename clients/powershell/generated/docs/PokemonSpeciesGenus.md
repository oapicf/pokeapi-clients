# PokemonSpeciesGenus
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Genus** | **String** | The localized genus for the referenced Pokémon species | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this genus is in. | 

## Examples

- Prepare the resource
```powershell
$PokemonSpeciesGenus = Initialize-PSOpenAPIToolsPokemonSpeciesGenus  -Genus null `
 -Language null
```

- Convert the resource to JSON
```powershell
$PokemonSpeciesGenus | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

