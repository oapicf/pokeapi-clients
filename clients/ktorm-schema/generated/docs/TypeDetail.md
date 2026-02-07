
# Table `TypeDetail`
(mapped from: TypeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**damageRelations** | damage_relations | long NOT NULL |  | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  |  [foreignkey]
**pastDamageRelations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypeDetailPastDamageRelationsInner&gt;**](TypeDetailPastDamageRelationsInner.md) |  | 
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypeGameIndex&gt;**](TypeGameIndex.md) |  | 
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) |  |  [foreignkey]
**moveDamageClass** | move_damage_class | long NOT NULL |  | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityName&gt;**](AbilityName.md) |  | 
**pokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypeDetailPokemonInner&gt;**](TypeDetailPokemonInner.md) |  | 
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | 
**sprites** | sprites | blob NOT NULL |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, TypeDetailSpritesValueValue&gt;&gt;** |  |  [readonly]





# **Table `TypeDetailTypeDetailPastDamageRelationsInner`**
(mapped from: TypeDetailTypeDetailPastDamageRelationsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
typeDetailPastDamageRelationsInner | typeDetailPastDamageRelationsInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `TypeDetailTypeGameIndex`**
(mapped from: TypeDetailTypeGameIndex)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
typeGameIndex | typeGameIndex | long | | kotlin.Long | Foreign Key | *many*





# **Table `TypeDetailAbilityName`**
(mapped from: TypeDetailAbilityName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
abilityName | abilityName | long | | kotlin.Long | Foreign Key | *many*



# **Table `TypeDetailTypeDetailPokemonInner`**
(mapped from: TypeDetailTypeDetailPokemonInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
typeDetailPokemonInner | typeDetailPokemonInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `TypeDetailMoveSummary`**
(mapped from: TypeDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*




