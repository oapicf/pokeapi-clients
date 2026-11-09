# PokemonSpritesOtherShowdown
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | **String** | The URL of the default Pokémon Showdown front image, or null if unavailable. | 
**FrontFemale** | **String** | The URL of the female Pokémon Showdown front image, or null if unavailable. | 
**FrontShiny** | **String** | The URL of the shiny Pokémon Showdown front image, or null if unavailable. | 
**FrontShinyFemale** | **String** | The URL of the shiny female Pokémon Showdown front image, or null if unavailable. | 
**BackDefault** | **String** | The URL of the default Pokémon Showdown back image, or null if unavailable. | 
**BackFemale** | **String** | The URL of the female Pokémon Showdown back image, or null if unavailable. | 
**BackShiny** | **String** | The URL of the shiny Pokémon Showdown back image, or null if unavailable. | 
**BackShinyFemale** | **String** | The URL of the shiny female Pokémon Showdown back image, or null if unavailable. | 

## Examples

- Prepare the resource
```powershell
$PokemonSpritesOtherShowdown = Initialize-PSOpenAPIToolsPokemonSpritesOtherShowdown  -FrontDefault null `
 -FrontFemale null `
 -FrontShiny null `
 -FrontShinyFemale null `
 -BackDefault null `
 -BackFemale null `
 -BackShiny null `
 -BackShinyFemale null
```

- Convert the resource to JSON
```powershell
$PokemonSpritesOtherShowdown | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

