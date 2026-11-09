
# Table `MoveFlavorText`
(mapped from: MoveFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**flavorText** | flavor_text | text NOT NULL |  | **kotlin.String** | The localized flavor text for an api resource in a specific language. | 
**language** | language | long NOT NULL |  | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that uses this flavor text. |  [foreignkey]





