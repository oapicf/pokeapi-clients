
# Table `PaginatedNatureSummaryList`
(mapped from: PaginatedNatureSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureSummary&gt;**](NatureSummary.md) |  |  [optional]





# **Table `PaginatedNatureSummaryListNatureSummary`**
(mapped from: PaginatedNatureSummaryListNatureSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedNatureSummaryList | paginatedNatureSummaryList | long | | kotlin.Long | Primary Key | *one*
natureSummary | natureSummary | long | | kotlin.Long | Foreign Key | *many*



