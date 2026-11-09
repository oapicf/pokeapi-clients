# PaginatedPokemonColorSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **number** | The total number of resources available from this API. | [default to undefined]
**next** | **string** | The URL for the next page in the list, or null if there is no next page. | [optional] [default to undefined]
**previous** | **string** | The URL for the previous page in the list, or null if there is no previous page. | [optional] [default to undefined]
**results** | [**Array&lt;PokemonColorSummary&gt;**](PokemonColorSummary.md) | A list of API resources on this page. | [default to undefined]

## Example

```typescript
import { PaginatedPokemonColorSummaryList } from './api';

const instance: PaginatedPokemonColorSummaryList = {
    count,
    next,
    previous,
    results,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
