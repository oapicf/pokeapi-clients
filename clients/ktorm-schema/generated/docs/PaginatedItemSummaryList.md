
# Table `PaginatedItemSummaryList`
(mapped from: PaginatedItemSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemSummary&gt;**](ItemSummary.md) |  |  [optional]





# **Table `PaginatedItemSummaryListItemSummary`**
(mapped from: PaginatedItemSummaryListItemSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedItemSummaryList | paginatedItemSummaryList | long | | kotlin.Long | Primary Key | *one*
itemSummary | itemSummary | long | | kotlin.Long | Foreign Key | *many*



