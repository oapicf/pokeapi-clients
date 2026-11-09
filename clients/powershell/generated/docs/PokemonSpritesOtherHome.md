# PokemonSpritesOtherHome
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | **String** | The URL of the default Pokémon HOME front image, or null if unavailable. | 
**FrontFemale** | **String** | The URL of the female Pokémon HOME front image, or null if unavailable. | 
**FrontShiny** | **String** | The URL of the shiny Pokémon HOME front image, or null if unavailable. | 
**FrontShinyFemale** | **String** | The URL of the shiny female Pokémon HOME front image, or null if unavailable. | 

## Examples

- Prepare the resource
```powershell
$PokemonSpritesOtherHome = Initialize-PSOpenAPIToolsPokemonSpritesOtherHome  -FrontDefault null `
 -FrontFemale null `
 -FrontShiny null `
 -FrontShinyFemale null
```

- Convert the resource to JSON
```powershell
$PokemonSpritesOtherHome | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

