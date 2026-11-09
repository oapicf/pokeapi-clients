
# Table `ItemMachine`
(mapped from: ItemMachine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**machine** | machine | long NOT NULL |  | [**MachineSummary**](MachineSummary.md) | The machine that teaches a move from an item. |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group of this specific machine. |  [foreignkey]




