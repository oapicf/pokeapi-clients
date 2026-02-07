
# Table `PaginatedItemAttributeSummaryList`
(mapped from: PaginatedItemAttributeSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemAttributeSummary&gt;**](ItemAttributeSummary.md) |  |  [optional]





# **Table `PaginatedItemAttributeSummaryListItemAttributeSummary`**
(mapped from: PaginatedItemAttributeSummaryListItemAttributeSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedItemAttributeSummaryList | paginatedItemAttributeSummaryList | long | | kotlin.Long | Primary Key | *one*
itemAttributeSummary | itemAttributeSummary | long | | kotlin.Long | Foreign Key | *many*



