
# Table `MoveFlavorText`
(mapped from: MoveFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**flavorText** | flavor_text | text NOT NULL |  | **kotlin.String** |  | 
**language** | language | long NOT NULL |  | [**LanguageSummary**](LanguageSummary.md) |  |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  [foreignkey]





