
# Table `PokeathlonStatDetail`
(mapped from: PokeathlonStatDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**affectingNatures** | affecting_natures | long NOT NULL |  | [**PokeathlonStatAffectingNatures**](PokeathlonStatAffectingNatures.md) | A detail of natures which affect this Pokéathlon stat positively or negatively. |  [readonly] [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokeathlonStatName&gt;**](PokeathlonStatName.md) | The name of this resource listed in different languages. |  [readonly]





# **Table `PokeathlonStatDetailPokeathlonStatName`**
(mapped from: PokeathlonStatDetailPokeathlonStatName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokeathlonStatDetail | pokeathlonStatDetail | long | | kotlin.Long | Primary Key | *one*
pokeathlonStatName | pokeathlonStatName | long | | kotlin.Long | Foreign Key | *many*



