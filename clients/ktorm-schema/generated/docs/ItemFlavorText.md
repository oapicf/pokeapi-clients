
# Table `ItemFlavorText`
(mapped from: ItemFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**text** | text | text NOT NULL |  | **kotlin.String** | The localized flavor text for an API resource in a specific language. | 
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group which uses this flavor text. |  [foreignkey]
**language** | language | long NOT NULL |  | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. |  [foreignkey]





