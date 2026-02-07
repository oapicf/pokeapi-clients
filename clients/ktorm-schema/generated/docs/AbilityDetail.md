
# Table `AbilityDetail`
(mapped from: AbilityDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityName&gt;**](AbilityName.md) |  | 
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityEffectText&gt;**](AbilityEffectText.md) |  | 
**effectChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityChange&gt;**](AbilityChange.md) |  | 
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) |  | 
**pokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInner&gt;**](AbilityDetailPokemonInner.md) |  | 
**isMainSeries** | is_main_series | boolean |  | **kotlin.Boolean** |  |  [optional]





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



# **Table `AbilityDetailAbilityDetailPokemonInner`**
(mapped from: AbilityDetailAbilityDetailPokemonInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
abilityDetail | abilityDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInner | abilityDetailPokemonInner | long | | kotlin.Long | Foreign Key | *many*




