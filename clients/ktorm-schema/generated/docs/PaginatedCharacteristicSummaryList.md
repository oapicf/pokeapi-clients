
# Table `PaginatedCharacteristicSummaryList`
(mapped from: PaginatedCharacteristicSummaryList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**count** | count | int |  | **kotlin.Int** |  |  [optional]
**next** | next | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**previous** | previous | text |  | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CharacteristicSummary&gt;**](CharacteristicSummary.md) |  |  [optional]





# **Table `PaginatedCharacteristicSummaryListCharacteristicSummary`**
(mapped from: PaginatedCharacteristicSummaryListCharacteristicSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginatedCharacteristicSummaryList | paginatedCharacteristicSummaryList | long | | kotlin.Long | Primary Key | *one*
characteristicSummary | characteristicSummary | long | | kotlin.Long | Foreign Key | *many*



