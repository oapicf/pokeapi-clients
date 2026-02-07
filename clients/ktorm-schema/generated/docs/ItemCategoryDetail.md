
# Table `ItemCategoryDetail`
(mapped from: ItemCategoryDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemSummary&gt;**](ItemSummary.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemCategoryName&gt;**](ItemCategoryName.md) |  | 
**pocket** | pocket | long NOT NULL |  | [**ItemPocketSummary**](ItemPocketSummary.md) |  |  [foreignkey]




# **Table `ItemCategoryDetailItemSummary`**
(mapped from: ItemCategoryDetailItemSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemCategoryDetail | itemCategoryDetail | long | | kotlin.Long | Primary Key | *one*
itemSummary | itemSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemCategoryDetailItemCategoryName`**
(mapped from: ItemCategoryDetailItemCategoryName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemCategoryDetail | itemCategoryDetail | long | | kotlin.Long | Primary Key | *one*
itemCategoryName | itemCategoryName | long | | kotlin.Long | Foreign Key | *many*




