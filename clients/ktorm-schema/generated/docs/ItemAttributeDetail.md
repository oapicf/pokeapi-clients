
# Table `ItemAttributeDetail`
(mapped from: ItemAttributeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemAttributeDescription&gt;**](ItemAttributeDescription.md) |  | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemAttributeName&gt;**](ItemAttributeName.md) |  | 




# **Table `ItemAttributeDetailItemAttributeDescription`**
(mapped from: ItemAttributeDetailItemAttributeDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributeDetail | itemAttributeDetail | long | | kotlin.Long | Primary Key | *one*
itemAttributeDescription | itemAttributeDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemAttributeDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: ItemAttributeDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributeDetail | itemAttributeDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemAttributeDetailItemAttributeName`**
(mapped from: ItemAttributeDetailItemAttributeName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributeDetail | itemAttributeDetail | long | | kotlin.Long | Primary Key | *one*
itemAttributeName | itemAttributeName | long | | kotlin.Long | Foreign Key | *many*



