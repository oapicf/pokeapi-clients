
# Table `EggGroupDetail`
(mapped from: EggGroupDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EggGroupName&gt;**](EggGroupName.md) |  | 
**pokemonSpecies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EggGroupDetailPokemonSpeciesInner&gt;**](EggGroupDetailPokemonSpeciesInner.md) |  | 




# **Table `EggGroupDetailEggGroupName`**
(mapped from: EggGroupDetailEggGroupName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
eggGroupDetail | eggGroupDetail | long | | kotlin.Long | Primary Key | *one*
eggGroupName | eggGroupName | long | | kotlin.Long | Foreign Key | *many*



# **Table `EggGroupDetailEggGroupDetailPokemonSpeciesInner`**
(mapped from: EggGroupDetailEggGroupDetailPokemonSpeciesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
eggGroupDetail | eggGroupDetail | long | | kotlin.Long | Primary Key | *one*
eggGroupDetailPokemonSpeciesInner | eggGroupDetailPokemonSpeciesInner | long | | kotlin.Long | Foreign Key | *many*



