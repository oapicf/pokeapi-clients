
# Table `PaginatedItemCategorySummaryList`
(mapped from: PaginatedItemCategorySummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemCategorySummary&gt;**](ItemCategorySummary.md) |  |  [optional]





# **Table `PaginatedItemCategorySummaryListItemCategorySummary`**
(mapped from: PaginatedItemCategorySummaryListItemCategorySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedItemCategorySummaryList | paginatedItemCategorySummaryList | long | | kotlin.Long | Primary Key | *one*
itemCategorySummary | itemCategorySummary | long | | kotlin.Long | Foreign Key | *many*



