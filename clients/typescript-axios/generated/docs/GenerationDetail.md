# GenerationDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**abilities** | [**Array&lt;AbilitySummary&gt;**](AbilitySummary.md) |  | [default to undefined]
**main_region** | [**RegionSummary**](RegionSummary.md) |  | [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | [default to undefined]
**names** | [**Array&lt;GenerationName&gt;**](GenerationName.md) |  | [default to undefined]
**pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | [default to undefined]
**types** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) |  | [default to undefined]
**version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) |  | [default to undefined]

## Example

```typescript
import { GenerationDetail } from './api';

const instance: GenerationDetail = {
    id,
    name,
    abilities,
    main_region,
    moves,
    names,
    pokemon_species,
    types,
    version_groups,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
