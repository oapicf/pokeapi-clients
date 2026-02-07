
# Table `PaginatedItemPocketSummaryList`
(mapped from: PaginatedItemPocketSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemPocketSummary&gt;**](ItemPocketSummary.md) |  |  [optional]





# **Table `PaginatedItemPocketSummaryListItemPocketSummary`**
(mapped from: PaginatedItemPocketSummaryListItemPocketSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedItemPocketSummaryList | paginatedItemPocketSummaryList | long | | kotlin.Long | Primary Key | *one*
itemPocketSummary | itemPocketSummary | long | | kotlin.Long | Foreign Key | *many*



