# openapi::LanguageDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**official** | **character** | Whether or not the games are published in this language. | [optional] 
**iso639** | **character** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | [Max. length: 10] 
**iso3166** | **character** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | [Max. length: 2] 
**names** | [**array[LanguageName]**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] 


