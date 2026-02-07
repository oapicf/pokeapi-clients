
# Table `LocationAreaDetail`
(mapped from: LocationAreaDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**gameIndex** | game_index | int NOT NULL |  | **kotlin.Int** |  | 
**encounterMethodRates** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaDetailEncounterMethodRatesInner&gt;**](LocationAreaDetailEncounterMethodRatesInner.md) |  | 
**location** | location | long NOT NULL |  | [**LocationSummary**](LocationSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaName&gt;**](LocationAreaName.md) |  | 
**pokemonEncounters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaDetailPokemonEncountersInner&gt;**](LocationAreaDetailPokemonEncountersInner.md) |  | 





# **Table `LocationAreaDetailLocationAreaDetailEncounterMethodRatesInner`**
(mapped from: LocationAreaDetailLocationAreaDetailEncounterMethodRatesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetail | locationAreaDetail | long | | kotlin.Long | Primary Key | *one*
locationAreaDetailEncounterMethodRatesInner | locationAreaDetailEncounterMethodRatesInner | long | | kotlin.Long | Foreign Key | *many*




# **Table `LocationAreaDetailLocationAreaName`**
(mapped from: LocationAreaDetailLocationAreaName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetail | locationAreaDetail | long | | kotlin.Long | Primary Key | *one*
locationAreaName | locationAreaName | long | | kotlin.Long | Foreign Key | *many*



# **Table `LocationAreaDetailLocationAreaDetailPokemonEncountersInner`**
(mapped from: LocationAreaDetailLocationAreaDetailPokemonEncountersInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetail | locationAreaDetail | long | | kotlin.Long | Primary Key | *one*
locationAreaDetailPokemonEncountersInner | locationAreaDetailPokemonEncountersInner | long | | kotlin.Long | Foreign Key | *many*



