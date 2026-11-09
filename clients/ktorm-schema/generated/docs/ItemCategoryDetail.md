
# Table `ItemCategoryDetail`
(mapped from: ItemCategoryDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that are a part of this category. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemCategoryName&gt;**](ItemCategoryName.md) | The name of this item category listed in different languages. |  [readonly]
**pocket** | pocket | long NOT NULL |  | [**ItemPocketSummary**](ItemPocketSummary.md) | The pocket items in this category would be put in. |  [foreignkey]




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




