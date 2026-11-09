
# Table `LanguageDetail`
(mapped from: LanguageDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**iso639** | iso639 | text NOT NULL |  | **kotlin.String** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | 
**iso3166** | iso3166 | text NOT NULL |  | **kotlin.String** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LanguageName&gt;**](LanguageName.md) | The name of this resource listed in different languages. |  [readonly]
**official** | official | boolean |  | **kotlin.Boolean** | Whether or not the games are published in this language. |  [optional]






# **Table `LanguageDetailLanguageName`**
(mapped from: LanguageDetailLanguageName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
languageDetail | languageDetail | long | | kotlin.Long | Primary Key | *one*
languageName | languageName | long | | kotlin.Long | Foreign Key | *many*




