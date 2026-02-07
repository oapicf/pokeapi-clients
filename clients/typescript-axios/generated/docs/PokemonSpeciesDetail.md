# PokemonSpeciesDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**order** | **number** |  | [optional] [default to undefined]
**gender_rate** | **number** |  | [optional] [default to undefined]
**capture_rate** | **number** |  | [optional] [default to undefined]
**base_happiness** | **number** |  | [optional] [default to undefined]
**is_baby** | **boolean** |  | [optional] [default to undefined]
**is_legendary** | **boolean** |  | [optional] [default to undefined]
**is_mythical** | **boolean** |  | [optional] [default to undefined]
**hatch_counter** | **number** |  | [optional] [default to undefined]
**has_gender_differences** | **boolean** |  | [optional] [default to undefined]
**forms_switchable** | **boolean** |  | [optional] [default to undefined]
**growth_rate** | [**GrowthRateSummary**](GrowthRateSummary.md) |  | [default to undefined]
**pokedex_numbers** | [**Array&lt;PokemonDexEntry&gt;**](PokemonDexEntry.md) |  | [default to undefined]
**egg_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]
**color** | [**PokemonColorSummary**](PokemonColorSummary.md) |  | [default to undefined]
**shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) |  | [default to undefined]
**evolves_from_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | [default to undefined]
**evolution_chain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) |  | [default to undefined]
**habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | [default to undefined]
**names** | [**Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  | [default to undefined]
**pal_park_encounters** | [**Array&lt;PokemonSpeciesDetailPalParkEncountersInner&gt;**](PokemonSpeciesDetailPalParkEncountersInner.md) |  | [default to undefined]
**form_descriptions** | [**Array&lt;PokemonSpeciesDescription&gt;**](PokemonSpeciesDescription.md) |  | [default to undefined]
**flavor_text_entries** | [**Array&lt;PokemonSpeciesFlavorText&gt;**](PokemonSpeciesFlavorText.md) |  | [default to undefined]
**genera** | [**Array&lt;PokemonSpeciesDetailGeneraInner&gt;**](PokemonSpeciesDetailGeneraInner.md) |  | [default to undefined]
**varieties** | [**Array&lt;PokemonSpeciesDetailVarietiesInner&gt;**](PokemonSpeciesDetailVarietiesInner.md) |  | [default to undefined]

## Example

```typescript
import { PokemonSpeciesDetail } from './api';

const instance: PokemonSpeciesDetail = {
    id,
    name,
    order,
    gender_rate,
    capture_rate,
    base_happiness,
    is_baby,
    is_legendary,
    is_mythical,
    hatch_counter,
    has_gender_differences,
    forms_switchable,
    growth_rate,
    pokedex_numbers,
    egg_groups,
    color,
    shape,
    evolves_from_species,
    evolution_chain,
    habitat,
    generation,
    names,
    pal_park_encounters,
    form_descriptions,
    flavor_text_entries,
    genera,
    varieties,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
