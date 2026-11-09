# PokemonSpritesOther
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DreamWorld** | [**PokemonSpritesOtherDreamWorld**](PokemonSpritesOtherDreamWorld.md) | Pokémon Dream World artwork URLs. | [optional] 
**VarHome** | [**PokemonSpritesOtherHome**](PokemonSpritesOtherHome.md) | Pokémon HOME sprite URLs. | [optional] 
**Showdown** | [**PokemonSpritesOtherShowdown**](PokemonSpritesOtherShowdown.md) | Pokémon Showdown sprite URLs. | [optional] 
**OfficialArtwork** | [**PokemonSpritesOtherOfficialArtwork**](PokemonSpritesOtherOfficialArtwork.md) | Official Pokémon artwork URLs, including shiny artwork and version-specific variants. | [optional] 

## Examples

- Prepare the resource
```powershell
$PokemonSpritesOther = Initialize-PSOpenAPIToolsPokemonSpritesOther  -DreamWorld null `
 -VarHome null `
 -Showdown null `
 -OfficialArtwork null
```

- Convert the resource to JSON
```powershell
$PokemonSpritesOther | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

