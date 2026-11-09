
# Table `ItemFlingEffectDetail`
(mapped from: ItemFlingEffectDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemFlingEffectEffectText&gt;**](ItemFlingEffectEffectText.md) | The result of this fling effect listed in different languages. |  [readonly]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that have this fling effect. |  [readonly]




# **Table `ItemFlingEffectDetailItemFlingEffectEffectText`**
(mapped from: ItemFlingEffectDetailItemFlingEffectEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemFlingEffectDetail | itemFlingEffectDetail | long | | kotlin.Long | Primary Key | *one*
itemFlingEffectEffectText | itemFlingEffectEffectText | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemFlingEffectDetailItemSummary`**
(mapped from: ItemFlingEffectDetailItemSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemFlingEffectDetail | itemFlingEffectDetail | long | | kotlin.Long | Primary Key | *one*
itemSummary | itemSummary | long | | kotlin.Long | Foreign Key | *many*



