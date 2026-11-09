# PokemonShapeDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**awesome_names** | [**Array&lt;PokemonShapeAwesomeName&gt;**](PokemonShapeAwesomeName.md) | The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages. | [readonly] [default to undefined]
**names** | [**Array&lt;PokemonShapeName&gt;**](PokemonShapeName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of the Pokémon species that have this shape. | [readonly] [default to undefined]

## Example

```typescript
import { PokemonShapeDetail } from './api';

const instance: PokemonShapeDetail = {
    id,
    name,
    awesome_names,
    names,
    pokemon_species,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
