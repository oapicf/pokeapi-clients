
# Table `PalParkAreaDetail`
(mapped from: PalParkAreaDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PalParkAreaName&gt;**](PalParkAreaName.md) |  | 
**pokemonEncounters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PalParkAreaDetailPokemonEncountersInner&gt;**](PalParkAreaDetailPokemonEncountersInner.md) |  | 




# **Table `PalParkAreaDetailPalParkAreaName`**
(mapped from: PalParkAreaDetailPalParkAreaName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
palParkAreaDetail | palParkAreaDetail | long | | kotlin.Long | Primary Key | *one*
palParkAreaName | palParkAreaName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PalParkAreaDetailPalParkAreaDetailPokemonEncountersInner`**
(mapped from: PalParkAreaDetailPalParkAreaDetailPokemonEncountersInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
palParkAreaDetail | palParkAreaDetail | long | | kotlin.Long | Primary Key | *one*
palParkAreaDetailPokemonEncountersInner | palParkAreaDetailPokemonEncountersInner | long | | kotlin.Long | Foreign Key | *many*



