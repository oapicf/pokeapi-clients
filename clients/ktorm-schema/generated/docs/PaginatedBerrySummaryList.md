
# Table `PaginatedBerrySummaryList`
(mapped from: PaginatedBerrySummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerrySummary&gt;**](BerrySummary.md) |  |  [optional]





# **Table `PaginatedBerrySummaryListBerrySummary`**
(mapped from: PaginatedBerrySummaryListBerrySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedBerrySummaryList | paginatedBerrySummaryList | long | | kotlin.Long | Primary Key | *one*
berrySummary | berrySummary | long | | kotlin.Long | Foreign Key | *many*



