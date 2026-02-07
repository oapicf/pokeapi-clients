
# Table `PaginatedMoveSummaryList`
(mapped from: PaginatedMoveSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) |  |  [optional]





# **Table `PaginatedMoveSummaryListMoveSummary`**
(mapped from: PaginatedMoveSummaryListMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMoveSummaryList | paginatedMoveSummaryList | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*



