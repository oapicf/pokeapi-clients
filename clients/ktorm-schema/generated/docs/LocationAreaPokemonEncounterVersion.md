
# Table `LocationAreaPokemonEncounterVersion`
(mapped from: LocationAreaPokemonEncounterVersion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**version** | version | long NOT NULL |  | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. |  [foreignkey]
**maxChance** | max_chance | int NOT NULL |  | **kotlin.Int** | The total percentage of all encounter potential. | 
**encounterDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaEncounterDetail&gt;**](LocationAreaEncounterDetail.md) | A list of encounters and their specifics. | 




# **Table `LocationAreaPokemonEncounterVersionLocationAreaEncounterDetail`**
(mapped from: LocationAreaPokemonEncounterVersionLocationAreaEncounterDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaPokemonEncounterVersion | locationAreaPokemonEncounterVersion | long | | kotlin.Long | Primary Key | *one*
locationAreaEncounterDetail | locationAreaEncounterDetail | long | | kotlin.Long | Foreign Key | *many*



