
# Table `LocationAreaDetail`
(mapped from: LocationAreaDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**gameIndex** | game_index | int NOT NULL |  | **kotlin.Int** | The internal id of an API resource within game data. | 
**encounterMethodRates** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaEncounterRate&gt;**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. |  [readonly]
**location** | location | long NOT NULL |  | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaName&gt;**](LocationAreaName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonEncounters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaPokemonEncounter&gt;**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. |  [readonly]





# **Table `LocationAreaDetailLocationAreaEncounterRate`**
(mapped from: LocationAreaDetailLocationAreaEncounterRate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetail | locationAreaDetail | long | | kotlin.Long | Primary Key | *one*
locationAreaEncounterRate | locationAreaEncounterRate | long | | kotlin.Long | Foreign Key | *many*




# **Table `LocationAreaDetailLocationAreaName`**
(mapped from: LocationAreaDetailLocationAreaName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetail | locationAreaDetail | long | | kotlin.Long | Primary Key | *one*
locationAreaName | locationAreaName | long | | kotlin.Long | Foreign Key | *many*



# **Table `LocationAreaDetailLocationAreaPokemonEncounter`**
(mapped from: LocationAreaDetailLocationAreaPokemonEncounter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetail | locationAreaDetail | long | | kotlin.Long | Primary Key | *one*
locationAreaPokemonEncounter | locationAreaPokemonEncounter | long | | kotlin.Long | Foreign Key | *many*



