
# Table `MachineDetail`
(mapped from: MachineDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**item** | item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) |  |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  [foreignkey]
**move** | move | long NOT NULL |  | [**MoveSummary**](MoveSummary.md) |  |  [foreignkey]






