
# Table `LanguageDetail`
(mapped from: LanguageDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**iso639** | iso639 | text NOT NULL |  | **kotlin.String** |  | 
**iso3166** | iso3166 | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LanguageName&gt;**](LanguageName.md) |  | 
**official** | official | boolean |  | **kotlin.Boolean** |  |  [optional]






# **Table `LanguageDetailLanguageName`**
(mapped from: LanguageDetailLanguageName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
languageDetail | languageDetail | long | | kotlin.Long | Primary Key | *one*
languageName | languageName | long | | kotlin.Long | Foreign Key | *many*




