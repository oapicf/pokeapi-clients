
# Table `PalParkAreaDetail`
(mapped from: PalParkAreaDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PalParkAreaName&gt;**](PalParkAreaName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemonEncounters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PalParkEncounter&gt;**](PalParkEncounter.md) | A list of Pokémon encountered in thi pal park area along with details. |  [readonly]




# **Table `PalParkAreaDetailPalParkAreaName`**
(mapped from: PalParkAreaDetailPalParkAreaName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
palParkAreaDetail | palParkAreaDetail | long | | kotlin.Long | Primary Key | *one*
palParkAreaName | palParkAreaName | long | | kotlin.Long | Foreign Key | *many*



# **Table `PalParkAreaDetailPalParkEncounter`**
(mapped from: PalParkAreaDetailPalParkEncounter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
palParkAreaDetail | palParkAreaDetail | long | | kotlin.Long | Primary Key | *one*
palParkEncounter | palParkEncounter | long | | kotlin.Long | Foreign Key | *many*



