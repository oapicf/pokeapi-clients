
# Table `PaginatedBerryFirmnessSummaryList`
(mapped from: PaginatedBerryFirmnessSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFirmnessSummary&gt;**](BerryFirmnessSummary.md) |  |  [optional]





# **Table `PaginatedBerryFirmnessSummaryListBerryFirmnessSummary`**
(mapped from: PaginatedBerryFirmnessSummaryListBerryFirmnessSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedBerryFirmnessSummaryList | paginatedBerryFirmnessSummaryList | long | | kotlin.Long | Primary Key | *one*
berryFirmnessSummary | berryFirmnessSummary | long | | kotlin.Long | Foreign Key | *many*



