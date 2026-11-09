# PokemonSprites

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | Option<**String**> | The default depiction of this Pokémon from the front in battle. | 
**front_shiny** | Option<**String**> | The shiny depiction of this Pokémon from the front in battle. | 
**front_female** | Option<**String**> | The female depiction of this Pokémon from the front in battle. | 
**front_shiny_female** | Option<**String**> | The shiny female depiction of this Pokémon from the front in battle. | 
**back_default** | Option<**String**> | The default depiction of this Pokémon from the back in battle. | 
**back_shiny** | Option<**String**> | The shiny depiction of this Pokémon from the back in battle. | 
**back_female** | Option<**String**> | The female depiction of this Pokémon from the back in battle. | 
**back_shiny_female** | Option<**String**> | The shiny female depiction of this Pokémon from the back in battle. | 
**other** | Option<[**models::PokemonSpritesOther**](PokemonSpritesOther.md)> | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional]
**versions** | Option<**std::collections::HashMap<String, std::collections::HashMap<String, serde_json::Value>>**> | Sprites grouped by generation and game. Available keys vary by resource. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


