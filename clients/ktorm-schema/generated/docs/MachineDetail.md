
# Table `MachineDetail`
(mapped from: MachineDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**item** | item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) | The TM or HM item that corresponds to this machine. |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that this machine applies to. |  [foreignkey]
**move** | move | long NOT NULL |  | [**MoveSummary**](MoveSummary.md) | The move that is taught by this machine. |  [foreignkey]






