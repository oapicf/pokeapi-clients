
# Table `LocationAreaEncounterRate`
(mapped from: LocationAreaEncounterRate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**encounterMethod** | encounter_method | long NOT NULL |  | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method in which Pokémon may be encountered in an area.. |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaEncounterVersionDetail&gt;**](LocationAreaEncounterVersionDetail.md) | The chance of the encounter to occur on a version of the game. | 



# **Table `LocationAreaEncounterRateLocationAreaEncounterVersionDetail`**
(mapped from: LocationAreaEncounterRateLocationAreaEncounterVersionDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaEncounterRate | locationAreaEncounterRate | long | | kotlin.Long | Primary Key | *one*
locationAreaEncounterVersionDetail | locationAreaEncounterVersionDetail | long | | kotlin.Long | Foreign Key | *many*



