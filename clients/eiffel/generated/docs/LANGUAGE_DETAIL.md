# LANGUAGE_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**official** | **BOOLEAN** | Whether or not the games are published in this language. | [optional] [default to null]
**iso639** | [**STRING_32**](STRING_32.md) | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | [default to null]
**iso3166** | [**STRING_32**](STRING_32.md) | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | [default to null]
**names** | [**LIST [LANGUAGE_NAME]**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


