
# Table `PaginatedMoveTargetSummaryList`
(mapped from: PaginatedMoveTargetSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveTargetSummary&gt;**](MoveTargetSummary.md) |  |  [optional]





# **Table `PaginatedMoveTargetSummaryListMoveTargetSummary`**
(mapped from: PaginatedMoveTargetSummaryListMoveTargetSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMoveTargetSummaryList | paginatedMoveTargetSummaryList | long | | kotlin.Long | Primary Key | *one*
moveTargetSummary | moveTargetSummary | long | | kotlin.Long | Foreign Key | *many*



