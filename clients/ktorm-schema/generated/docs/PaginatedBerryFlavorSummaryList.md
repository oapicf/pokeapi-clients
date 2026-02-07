
# Table `PaginatedBerryFlavorSummaryList`
(mapped from: PaginatedBerryFlavorSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFlavorSummary&gt;**](BerryFlavorSummary.md) |  |  [optional]





# **Table `PaginatedBerryFlavorSummaryListBerryFlavorSummary`**
(mapped from: PaginatedBerryFlavorSummaryListBerryFlavorSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedBerryFlavorSummaryList | paginatedBerryFlavorSummaryList | long | | kotlin.Long | Primary Key | *one*
berryFlavorSummary | berryFlavorSummary | long | | kotlin.Long | Foreign Key | *many*



