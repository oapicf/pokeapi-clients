
# Table `PaginatedBerrySummaryList`
(mapped from: PaginatedBerrySummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int NOT NULL |  | **kotlin.Int** | The total number of resources available from this API. | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerrySummary&gt;**](BerrySummary.md) | A list of API resources on this page. | 
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the next page in the list, or null if there is no next page. |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the previous page in the list, or null if there is no previous page. |  [optional]



# **Table `PaginatedBerrySummaryListBerrySummary`**
(mapped from: PaginatedBerrySummaryListBerrySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedBerrySummaryList | paginatedBerrySummaryList | long | | kotlin.Long | Primary Key | *one*
berrySummary | berrySummary | long | | kotlin.Long | Foreign Key | *many*





