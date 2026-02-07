
# Table `PaginatedItemFlingEffectSummaryList`
(mapped from: PaginatedItemFlingEffectSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemFlingEffectSummary&gt;**](ItemFlingEffectSummary.md) |  |  [optional]





# **Table `PaginatedItemFlingEffectSummaryListItemFlingEffectSummary`**
(mapped from: PaginatedItemFlingEffectSummaryListItemFlingEffectSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedItemFlingEffectSummaryList | paginatedItemFlingEffectSummaryList | long | | kotlin.Long | Primary Key | *one*
itemFlingEffectSummary | itemFlingEffectSummary | long | | kotlin.Long | Foreign Key | *many*



