
# Table `PaginatedMoveDamageClassSummaryList`
(mapped from: PaginatedMoveDamageClassSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveDamageClassSummary&gt;**](MoveDamageClassSummary.md) |  |  [optional]





# **Table `PaginatedMoveDamageClassSummaryListMoveDamageClassSummary`**
(mapped from: PaginatedMoveDamageClassSummaryListMoveDamageClassSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMoveDamageClassSummaryList | paginatedMoveDamageClassSummaryList | long | | kotlin.Long | Primary Key | *one*
moveDamageClassSummary | moveDamageClassSummary | long | | kotlin.Long | Foreign Key | *many*



