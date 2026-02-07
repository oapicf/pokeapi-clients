
# Table `ItemPocketDetail`
(mapped from: ItemPocketDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**categories** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemCategorySummary&gt;**](ItemCategorySummary.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemPocketName&gt;**](ItemPocketName.md) |  | 




# **Table `ItemPocketDetailItemCategorySummary`**
(mapped from: ItemPocketDetailItemCategorySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemPocketDetail | itemPocketDetail | long | | kotlin.Long | Primary Key | *one*
itemCategorySummary | itemCategorySummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemPocketDetailItemPocketName`**
(mapped from: ItemPocketDetailItemPocketName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemPocketDetail | itemPocketDetail | long | | kotlin.Long | Primary Key | *one*
itemPocketName | itemPocketName | long | | kotlin.Long | Foreign Key | *many*



