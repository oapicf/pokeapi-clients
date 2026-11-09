
# Table `TypeDetail`
(mapped from: TypeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**damageRelations** | damage_relations | long NOT NULL |  | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. |  [readonly] [foreignkey]
**pastDamageRelations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypePastRelationships&gt;**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations |  [readonly]
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypeGameIndex&gt;**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. |  [readonly]
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. |  [foreignkey]
**moveDamageClass** | move_damage_class | long NOT NULL |  | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypeName&gt;**](TypeName.md) | The name of this resource listed in different languages. |  [readonly]
**pokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypePokemon&gt;**](TypePokemon.md) | A list of details of Pokémon that have this type. |  [readonly]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have this type. |  [readonly]
**sprites** | sprites | blob NOT NULL |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, TypeGameSprite&gt;&gt;** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. |  [readonly]





# **Table `TypeDetailTypePastRelationships`**
(mapped from: TypeDetailTypePastRelationships)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
typePastRelationships | typePastRelationships | long | | kotlin.Long | Foreign Key | *many*



# **Table `TypeDetailTypeGameIndex`**
(mapped from: TypeDetailTypeGameIndex)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
typeGameIndex | typeGameIndex | long | | kotlin.Long | Foreign Key | *many*





# **Table `TypeDetailTypeName`**
(mapped from: TypeDetailTypeName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
typeName | typeName | long | | kotlin.Long | Foreign Key | *many*



# **Table `TypeDetailTypePokemon`**
(mapped from: TypeDetailTypePokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
typePokemon | typePokemon | long | | kotlin.Long | Foreign Key | *many*



# **Table `TypeDetailMoveSummary`**
(mapped from: TypeDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
typeDetail | typeDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*




