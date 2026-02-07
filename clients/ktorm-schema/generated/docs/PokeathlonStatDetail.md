
# Table `PokeathlonStatDetail`
(mapped from: PokeathlonStatDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**affectingNatures** | affecting_natures | long NOT NULL |  | [**PokeathlonStatDetailAffectingNatures**](PokeathlonStatDetailAffectingNatures.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokeathlonStatName&gt;**](PokeathlonStatName.md) |  | 





# **Table `PokeathlonStatDetailPokeathlonStatName`**
(mapped from: PokeathlonStatDetailPokeathlonStatName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokeathlonStatDetail | pokeathlonStatDetail | long | | kotlin.Long | Primary Key | *one*
pokeathlonStatName | pokeathlonStatName | long | | kotlin.Long | Foreign Key | *many*



