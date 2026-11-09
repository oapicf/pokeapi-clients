# GenerationDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**abilities** | [**Array&lt;AbilitySummary&gt;**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] [default to undefined]
**main_region** | [**RegionSummary**](RegionSummary.md) | The main region travelled in this generation. | [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] [default to undefined]
**names** | [**Array&lt;GenerationName&gt;**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] [default to undefined]
**types** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] [default to undefined]
**version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] [default to undefined]

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
