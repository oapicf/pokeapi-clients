
# Table `PaginatedMachineSummaryList`
(mapped from: PaginatedMachineSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int NOT NULL |  | **kotlin.Int** | The total number of resources available from this API. | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MachineSummary&gt;**](MachineSummary.md) | A list of API resources on this page. | 
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the next page in the list, or null if there is no next page. |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) | The URL for the previous page in the list, or null if there is no previous page. |  [optional]



# **Table `PaginatedMachineSummaryListMachineSummary`**
(mapped from: PaginatedMachineSummaryListMachineSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMachineSummaryList | paginatedMachineSummaryList | long | | kotlin.Long | Primary Key | *one*
machineSummary | machineSummary | long | | kotlin.Long | Foreign Key | *many*





