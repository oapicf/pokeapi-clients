
# Table `PaginatedMachineSummaryList`
(mapped from: PaginatedMachineSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MachineSummary&gt;**](MachineSummary.md) |  |  [optional]





# **Table `PaginatedMachineSummaryListMachineSummary`**
(mapped from: PaginatedMachineSummaryListMachineSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedMachineSummaryList | paginatedMachineSummaryList | long | | kotlin.Long | Primary Key | *one*
machineSummary | machineSummary | long | | kotlin.Long | Foreign Key | *many*



