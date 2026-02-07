
# Table `PaginatedMoveMetaCategorySummaryList`
(mapped from: PaginatedMoveMetaCategorySummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveMetaCategorySummary&gt;**](MoveMetaCategorySummary.md) |  |  [optional]





# **Table `PaginatedMoveMetaCategorySummaryListMoveMetaCategorySummary`**
(mapped from: PaginatedMoveMetaCategorySummaryListMoveMetaCategorySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMoveMetaCategorySummaryList | paginatedMoveMetaCategorySummaryList | long | | kotlin.Long | Primary Key | *one*
moveMetaCategorySummary | moveMetaCategorySummary | long | | kotlin.Long | Foreign Key | *many*



