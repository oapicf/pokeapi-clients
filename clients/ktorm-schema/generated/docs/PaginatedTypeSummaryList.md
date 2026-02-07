
# Table `PaginatedTypeSummaryList`
(mapped from: PaginatedTypeSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TypeSummary&gt;**](TypeSummary.md) |  |  [optional]





# **Table `PaginatedTypeSummaryListTypeSummary`**
(mapped from: PaginatedTypeSummaryListTypeSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedTypeSummaryList | paginatedTypeSummaryList | long | | kotlin.Long | Primary Key | *one*
typeSummary | typeSummary | long | | kotlin.Long | Foreign Key | *many*



