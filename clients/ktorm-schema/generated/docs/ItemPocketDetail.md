
# Table `ItemPocketDetail`
(mapped from: ItemPocketDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**categories** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemCategorySummary&gt;**](ItemCategorySummary.md) | A list of item categories that are relevant to this item pocket. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemPocketName&gt;**](ItemPocketName.md) | The name of this resource listed in different languages. |  [readonly]




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



