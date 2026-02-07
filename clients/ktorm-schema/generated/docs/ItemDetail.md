
# Table `ItemDetail`
(mapped from: ItemDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**flingEffect** | fling_effect | long NOT NULL |  | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  |  [foreignkey]
**attributes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 
**category** | category | long NOT NULL |  | [**ItemCategorySummary**](ItemCategorySummary.md) |  |  [foreignkey]
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemEffectText&gt;**](ItemEffectText.md) |  | 
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemFlavorText&gt;**](ItemFlavorText.md) |  | 
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemGameIndex&gt;**](ItemGameIndex.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemName&gt;**](ItemName.md) |  | 
**heldByPokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDetailHeldByPokemonInner&gt;**](ItemDetailHeldByPokemonInner.md) |  | 
**sprites** | sprites | long NOT NULL |  | [**ItemDetailSprites**](ItemDetailSprites.md) |  |  [foreignkey]
**babyTriggerFor** | baby_trigger_for | long NOT NULL |  | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  |  [foreignkey]
**machines** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDetailMachinesInner&gt;**](ItemDetailMachinesInner.md) |  | 
**cost** | cost | int |  | **kotlin.Int** |  |  [optional]
**flingPower** | fling_power | int |  | **kotlin.Int** |  |  [optional]





# **Table `ItemDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: ItemDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*




# **Table `ItemDetailItemEffectText`**
(mapped from: ItemDetailItemEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemEffectText | itemEffectText | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemDetailItemFlavorText`**
(mapped from: ItemDetailItemFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemFlavorText | itemFlavorText | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemDetailItemGameIndex`**
(mapped from: ItemDetailItemGameIndex)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemGameIndex | itemGameIndex | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemDetailItemName`**
(mapped from: ItemDetailItemName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemName | itemName | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemDetailItemDetailHeldByPokemonInner`**
(mapped from: ItemDetailItemDetailHeldByPokemonInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemDetailHeldByPokemonInner | itemDetailHeldByPokemonInner | long | | kotlin.Long | Foreign Key | *many*





# **Table `ItemDetailItemDetailMachinesInner`**
(mapped from: ItemDetailItemDetailMachinesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemDetailMachinesInner | itemDetailMachinesInner | long | | kotlin.Long | Foreign Key | *many*





