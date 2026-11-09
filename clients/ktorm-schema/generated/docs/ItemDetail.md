
# Table `ItemDetail`
(mapped from: ItemDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**flingEffect** | fling_effect | long NOT NULL |  | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. |  [foreignkey]
**attributes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemAttributeSummary&gt;**](ItemAttributeSummary.md) | A list of attributes this item has. |  [readonly]
**category** | category | long NOT NULL |  | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. |  [foreignkey]
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemEffectText&gt;**](ItemEffectText.md) | The effect of this ability listed in different languages. |  [readonly]
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemFlavorText&gt;**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. |  [readonly]
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemGameIndex&gt;**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. |  [readonly]
**prices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemPrice&gt;**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemName&gt;**](ItemName.md) | The name of this item listed in different languages. |  [readonly]
**heldByPokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonHeldItem&gt;**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. |  [readonly]
**sprites** | sprites | long NOT NULL |  | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. |  [readonly] [foreignkey]
**babyTriggerFor** | baby_trigger_for | long NOT NULL |  | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. |  [readonly] [foreignkey]
**machines** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines related to this item. |  [readonly]
**flingPower** | fling_power | int |  | **kotlin.Int** | The power of the move Fling when used with this item. |  [optional]





# **Table `ItemDetailItemAttributeSummary`**
(mapped from: ItemDetailItemAttributeSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemAttributeSummary | itemAttributeSummary | long | | kotlin.Long | Foreign Key | *many*




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



# **Table `ItemDetailItemPrice`**
(mapped from: ItemDetailItemPrice)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemPrice | itemPrice | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemDetailItemName`**
(mapped from: ItemDetailItemName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemName | itemName | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemDetailPokemonHeldItem`**
(mapped from: ItemDetailPokemonHeldItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
pokemonHeldItem | pokemonHeldItem | long | | kotlin.Long | Foreign Key | *many*





# **Table `ItemDetailItemMachine`**
(mapped from: ItemDetailItemMachine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemDetail | itemDetail | long | | kotlin.Long | Primary Key | *one*
itemMachine | itemMachine | long | | kotlin.Long | Foreign Key | *many*




