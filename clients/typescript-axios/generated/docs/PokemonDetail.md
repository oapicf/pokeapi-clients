# PokemonDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**base_experience** | **number** | The base experience gained for defeating this Pokémon. | [optional] [default to undefined]
**height** | **number** | The height of this Pokémon in decimetres. | [optional] [default to undefined]
**is_default** | **boolean** | Set for exactly one Pokémon used as the default for each species. | [optional] [default to undefined]
**order** | **number** | Order for sorting. Almost national order, except families are grouped together. | [optional] [default to undefined]
**weight** | **number** | The weight of this Pokémon in hectograms. | [optional] [default to undefined]
**abilities** | [**Array&lt;PokemonAbility&gt;**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] [default to undefined]
**past_abilities** | [**Array&lt;PokemonPastAbility&gt;**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] [default to undefined]
**forms** | [**Array&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] [default to undefined]
**game_indices** | [**Array&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] [default to undefined]
**held_items** | [**Array&lt;PokemonHeldItemSummary&gt;**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] [default to undefined]
**location_area_encounters** | **string** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] [default to undefined]
**moves** | [**Array&lt;PokemonMove&gt;**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] [default to undefined]
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | [default to undefined]
**sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;\&#39;https://github.com/PokeAPI/sprites#sprites\&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] [default to undefined]
**cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;\&#39;https://github.com/PokeAPI/cries#cries\&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] [default to undefined]
**stats** | [**Array&lt;PokemonStat&gt;**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] [default to undefined]
**past_stats** | [**Array&lt;PokemonPastStat&gt;**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] [default to undefined]
**types** | [**Array&lt;PokemonType&gt;**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] [default to undefined]
**past_types** | [**Array&lt;PokemonPastType&gt;**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] [default to undefined]

## Example

```typescript
import { PokemonDetail } from './api';

const instance: PokemonDetail = {
    id,
    name,
    base_experience,
    height,
    is_default,
    order,
    weight,
    abilities,
    past_abilities,
    forms,
    game_indices,
    held_items,
    location_area_encounters,
    moves,
    species,
    sprites,
    cries,
    stats,
    past_stats,
    types,
    past_types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
