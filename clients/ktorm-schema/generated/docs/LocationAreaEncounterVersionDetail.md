
# Table `LocationAreaEncounterVersionDetail`
(mapped from: LocationAreaEncounterVersionDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rate** | rate | int NOT NULL |  | **kotlin.Int** | The chance of an encounter to occur. | 
**version** | version | long NOT NULL |  | [**VersionSummary**](VersionSummary.md) | The version of the game in which the encounter can occur with the given chance. |  [foreignkey]




