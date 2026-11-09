# RegionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**locations** | [**Array&lt;LocationSummary&gt;**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly] [default to undefined]
**main_generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this region was introduced in. | [readonly] [default to undefined]
**names** | [**Array&lt;RegionName&gt;**](RegionName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokedexes** | [**Array&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly] [default to undefined]
**version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly] [default to undefined]

## Example

```typescript
import { RegionDetail } from './api';

const instance: RegionDetail = {
    id,
    name,
    locations,
    main_generation,
    names,
    pokedexes,
    version_groups,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
