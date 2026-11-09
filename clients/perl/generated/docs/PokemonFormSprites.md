# WWW::OpenAPIClient::Object::PokemonFormSprites

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PokemonFormSprites;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **string** | The default depiction of this Pokémon from the front in battle. | 
**front_shiny** | **string** | The shiny depiction of this Pokémon from the front in battle. | 
**front_female** | **string** | The female depiction of this Pokémon from the front in battle. | 
**front_shiny_female** | **string** | The shiny female depiction of this Pokémon from the front in battle. | 
**back_default** | **string** | The default depiction of this Pokémon from the back in battle. | 
**back_shiny** | **string** | The shiny depiction of this Pokémon from the back in battle. | 
**back_female** | **string** | The female depiction of this Pokémon from the back in battle. | 
**back_shiny_female** | **string** | The shiny female depiction of this Pokémon from the back in battle. | 
**other** | [**PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional] 
**versions** | **HASH[string,HASH[string,object]]** | Sprites grouped by generation and game. Available keys vary by resource. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


