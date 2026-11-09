# PokemonSprites
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | **String** | The default depiction of this Pokémon from the front in battle. | 
**FrontShiny** | **String** | The shiny depiction of this Pokémon from the front in battle. | 
**FrontFemale** | **String** | The female depiction of this Pokémon from the front in battle. | 
**FrontShinyFemale** | **String** | The shiny female depiction of this Pokémon from the front in battle. | 
**BackDefault** | **String** | The default depiction of this Pokémon from the back in battle. | 
**BackShiny** | **String** | The shiny depiction of this Pokémon from the back in battle. | 
**BackFemale** | **String** | The female depiction of this Pokémon from the back in battle. | 
**BackShinyFemale** | **String** | The shiny female depiction of this Pokémon from the back in battle. | 
**Other** | [**PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional] 
**Versions** | [**System.Collections.Hashtable**](Map.md) | Sprites grouped by generation and game. Available keys vary by resource. | [optional] 

## Examples

- Prepare the resource
```powershell
$PokemonSprites = Initialize-PSOpenAPIToolsPokemonSprites  -FrontDefault null `
 -FrontShiny null `
 -FrontFemale null `
 -FrontShinyFemale null `
 -BackDefault null `
 -BackShiny null `
 -BackFemale null `
 -BackShinyFemale null `
 -Other null `
 -Versions null
```

- Convert the resource to JSON
```powershell
$PokemonSprites | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

