
# Table `AbilityDetail`
(mapped from: AbilityDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityName&gt;**](AbilityName.md) | The name of this resource listed in different languages. |  [readonly]
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityEffectText&gt;**](AbilityEffectText.md) | The effect of this ability listed in different languages. |  [readonly]
**effectChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityChange&gt;**](AbilityChange.md) | The list of previous effects this ability has had across version groups. |  [readonly]
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. |  [readonly]
**pokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityPokemonDetail&gt;**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. |  [readonly]
**isMainSeries** | is_main_series | boolean |  | **kotlin.Boolean** | Whether or not this ability originated in the main series of the video games. |  [optional]





# **Table `AbilityDetailAbilityName`**
(mapped from: AbilityDetailAbilityName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
abilityDetail | abilityDetail | long | | kotlin.Long | Primary Key | *one*
abilityName | abilityName | long | | kotlin.Long | Foreign Key | *many*



# **Table `AbilityDetailAbilityEffectText`**
(mapped from: AbilityDetailAbilityEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
abilityDetail | abilityDetail | long | | kotlin.Long | Primary Key | *one*
abilityEffectText | abilityEffectText | long | | kotlin.Long | Foreign Key | *many*



# **Table `AbilityDetailAbilityChange`**
(mapped from: AbilityDetailAbilityChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
abilityDetail | abilityDetail | long | | kotlin.Long | Primary Key | *one*
abilityChange | abilityChange | long | | kotlin.Long | Foreign Key | *many*



# **Table `AbilityDetailAbilityFlavorText`**
(mapped from: AbilityDetailAbilityFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
abilityDetail | abilityDetail | long | | kotlin.Long | Primary Key | *one*
abilityFlavorText | abilityFlavorText | long | | kotlin.Long | Foreign Key | *many*



# **Table `AbilityDetailAbilityPokemonDetail`**
(mapped from: AbilityDetailAbilityPokemonDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
abilityDetail | abilityDetail | long | | kotlin.Long | Primary Key | *one*
abilityPokemonDetail | abilityPokemonDetail | long | | kotlin.Long | Foreign Key | *many*




