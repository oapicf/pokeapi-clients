
# Table `PaginatedPalParkAreaSummaryList`
(mapped from: PaginatedPalParkAreaSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PalParkAreaSummary&gt;**](PalParkAreaSummary.md) |  |  [optional]





# **Table `PaginatedPalParkAreaSummaryListPalParkAreaSummary`**
(mapped from: PaginatedPalParkAreaSummaryListPalParkAreaSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedPalParkAreaSummaryList | paginatedPalParkAreaSummaryList | long | | kotlin.Long | Primary Key | *one*
palParkAreaSummary | palParkAreaSummary | long | | kotlin.Long | Foreign Key | *many*



