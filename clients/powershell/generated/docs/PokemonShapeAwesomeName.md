# PokemonShapeAwesomeName
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AwesomeName** | **String** | The localized &quot;&quot;scientific&quot;&quot; name for an API resource in a specific language. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this &quot;&quot;scientific&quot;&quot; name is in. | 

## Examples

- Prepare the resource
```powershell
$PokemonShapeAwesomeName = Initialize-PSOpenAPIToolsPokemonShapeAwesomeName  -AwesomeName null `
 -Language null
```

- Convert the resource to JSON
```powershell
$PokemonShapeAwesomeName | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

