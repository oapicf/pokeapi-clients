
# Table `PaginatedMoveMetaAilmentSummaryList`
(mapped from: PaginatedMoveMetaAilmentSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveMetaAilmentSummary&gt;**](MoveMetaAilmentSummary.md) |  |  [optional]





# **Table `PaginatedMoveMetaAilmentSummaryListMoveMetaAilmentSummary`**
(mapped from: PaginatedMoveMetaAilmentSummaryListMoveMetaAilmentSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMoveMetaAilmentSummaryList | paginatedMoveMetaAilmentSummaryList | long | | kotlin.Long | Primary Key | *one*
moveMetaAilmentSummary | moveMetaAilmentSummary | long | | kotlin.Long | Foreign Key | *many*



