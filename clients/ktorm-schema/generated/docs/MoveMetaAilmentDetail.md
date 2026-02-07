
# Table `MoveMetaAilmentDetail`
(mapped from: MoveMetaAilmentDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveMetaAilmentName&gt;**](MoveMetaAilmentName.md) |  | 




# **Table `MoveMetaAilmentDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: MoveMetaAilmentDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaAilmentDetail | moveMetaAilmentDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveMetaAilmentDetailMoveMetaAilmentName`**
(mapped from: MoveMetaAilmentDetailMoveMetaAilmentName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaAilmentDetail | moveMetaAilmentDetail | long | | kotlin.Long | Primary Key | *one*
moveMetaAilmentName | moveMetaAilmentName | long | | kotlin.Long | Foreign Key | *many*



