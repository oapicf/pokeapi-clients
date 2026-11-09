# PokemonSpritesOtherDreamWorld
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | **String** | The URL of the default Pokémon Dream World front image, or null if unavailable. | 
**FrontFemale** | **String** | The URL of the female Pokémon Dream World front image, or null if unavailable. | 

## Examples

- Prepare the resource
```powershell
$PokemonSpritesOtherDreamWorld = Initialize-PSOpenAPIToolsPokemonSpritesOtherDreamWorld  -FrontDefault null `
 -FrontFemale null
```

- Convert the resource to JSON
```powershell
$PokemonSpritesOtherDreamWorld | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

