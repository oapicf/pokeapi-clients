
# Table `MoveMetaCategoryDetail`
(mapped from: MoveMetaCategoryDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveMetaCategoryDescription&gt;**](MoveMetaCategoryDescription.md) |  | 
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 




# **Table `MoveMetaCategoryDetailMoveMetaCategoryDescription`**
(mapped from: MoveMetaCategoryDetailMoveMetaCategoryDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaCategoryDetail | moveMetaCategoryDetail | long | | kotlin.Long | Primary Key | *one*
moveMetaCategoryDescription | moveMetaCategoryDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveMetaCategoryDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: MoveMetaCategoryDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaCategoryDetail | moveMetaCategoryDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



