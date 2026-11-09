# VersionGroupDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**order** | **number** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | [default to undefined]
**move_learn_methods** | [**Array&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] [default to undefined]
**pokedexes** | [**Array&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] [default to undefined]
**regions** | [**Array&lt;RegionSummary&gt;**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] [default to undefined]
**versions** | [**Array&lt;VersionSummary&gt;**](VersionSummary.md) | The versions this version group owns. | [readonly] [default to undefined]

## Example

```typescript
import { VersionGroupDetail } from './api';

const instance: VersionGroupDetail = {
    id,
    name,
    order,
    generation,
    move_learn_methods,
    pokedexes,
    regions,
    versions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
