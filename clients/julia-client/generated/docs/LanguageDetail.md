# LanguageDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`official`** | **`Bool`** | Whether or not the games are published in this language. | [optional] [default to nothing]
**`iso639`** | **`String`** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | [default to nothing]
**`iso3166`** | **`String`** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | [default to nothing]
**`names`** | [**`Vector{LanguageName}`**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


