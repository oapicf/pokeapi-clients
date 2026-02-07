# PokemonFormDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**order** | **number** |  | [optional] [default to undefined]
**form_order** | **number** |  | [optional] [default to undefined]
**is_default** | **boolean** |  | [optional] [default to undefined]
**is_battle_only** | **boolean** |  | [optional] [default to undefined]
**is_mega** | **boolean** |  | [optional] [default to undefined]
**form_name** | **string** |  | [default to undefined]
**pokemon** | [**PokemonSummary**](PokemonSummary.md) |  | [default to undefined]
**sprites** | [**PokemonFormDetailSprites**](PokemonFormDetailSprites.md) |  | [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | [default to undefined]
**form_names** | [**Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  | [default to undefined]
**names** | [**Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  | [default to undefined]
**types** | [**Array&lt;PokemonDetailTypesInner&gt;**](PokemonDetailTypesInner.md) |  | [default to undefined]

## Example

```typescript
import { PokemonFormDetail } from './api';

const instance: PokemonFormDetail = {
    id,
    name,
    order,
    form_order,
    is_default,
    is_battle_only,
    is_mega,
    form_name,
    pokemon,
    sprites,
    version_group,
    form_names,
    names,
    types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
