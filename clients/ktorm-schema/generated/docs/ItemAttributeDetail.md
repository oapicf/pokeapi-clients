
# Table `ItemAttributeDetail`
(mapped from: ItemAttributeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemAttributeDescription&gt;**](ItemAttributeDescription.md) | The description of this item attribute listed in different languages. |  [readonly]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that have this attribute. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemAttributeName&gt;**](ItemAttributeName.md) | The name of this item attribute listed in different languages. |  [readonly]




# **Table `ItemAttributeDetailItemAttributeDescription`**
(mapped from: ItemAttributeDetailItemAttributeDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributeDetail | itemAttributeDetail | long | | kotlin.Long | Primary Key | *one*
itemAttributeDescription | itemAttributeDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemAttributeDetailItemSummary`**
(mapped from: ItemAttributeDetailItemSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributeDetail | itemAttributeDetail | long | | kotlin.Long | Primary Key | *one*
itemSummary | itemSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemAttributeDetailItemAttributeName`**
(mapped from: ItemAttributeDetailItemAttributeName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributeDetail | itemAttributeDetail | long | | kotlin.Long | Primary Key | *one*
itemAttributeName | itemAttributeName | long | | kotlin.Long | Foreign Key | *many*



