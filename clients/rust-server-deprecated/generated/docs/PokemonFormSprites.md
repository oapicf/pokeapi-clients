# PokemonFormSprites

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **swagger::Nullable<String>** | The default depiction of this Pokémon from the front in battle. | 
**front_shiny** | **swagger::Nullable<String>** | The shiny depiction of this Pokémon from the front in battle. | 
**front_female** | **swagger::Nullable<String>** | The female depiction of this Pokémon from the front in battle. | 
**front_shiny_female** | **swagger::Nullable<String>** | The shiny female depiction of this Pokémon from the front in battle. | 
**back_default** | **swagger::Nullable<String>** | The default depiction of this Pokémon from the back in battle. | 
**back_shiny** | **swagger::Nullable<String>** | The shiny depiction of this Pokémon from the back in battle. | 
**back_female** | **swagger::Nullable<String>** | The female depiction of this Pokémon from the back in battle. | 
**back_shiny_female** | **swagger::Nullable<String>** | The shiny female depiction of this Pokémon from the back in battle. | 
**other** | [***models::PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional] [default to None]
**versions** | [**std::collections::HashMap<String, std::collections::HashMap<String, swagger::Nullable<serde_json::Value>>>**](map.md) | Sprites grouped by generation and game. Available keys vary by resource. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


