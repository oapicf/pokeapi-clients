# PokemonSpritesOtherOfficialArtwork
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | **String** | The URL of the default front official artwork, or null if unavailable. | 
**FrontShiny** | **String** | The URL of the shiny front official artwork, or null if unavailable. | 
**Versions** | [**System.Collections.Hashtable**](Map.md) | Additional official artwork grouped by version. Available keys vary by resource. | [optional] 

## Examples

- Prepare the resource
```powershell
$PokemonSpritesOtherOfficialArtwork = Initialize-PSOpenAPIToolsPokemonSpritesOtherOfficialArtwork  -FrontDefault null `
 -FrontShiny null `
 -Versions null
```

- Convert the resource to JSON
```powershell
$PokemonSpritesOtherOfficialArtwork | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

