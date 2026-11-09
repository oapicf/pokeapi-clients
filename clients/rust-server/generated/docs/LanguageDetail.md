# LanguageDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**official** | **bool** | Whether or not the games are published in this language. | [optional] [default to None]
**iso639** | **String** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | 
**iso3166** | **String** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | 
**names** | [**Vec<models::LanguageName>**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


