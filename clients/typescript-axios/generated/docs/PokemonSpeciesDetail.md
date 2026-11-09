# PokemonSpeciesDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**order** | **number** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] [default to undefined]
**gender_rate** | **number** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] [default to undefined]
**capture_rate** | **number** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] [default to undefined]
**base_happiness** | **number** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] [default to undefined]
**is_baby** | **boolean** | Whether or not this is a baby Pokémon. | [optional] [default to undefined]
**is_legendary** | **boolean** | Whether or not this is a legendary Pokémon. | [optional] [default to undefined]
**is_mythical** | **boolean** | Whether or not this is a mythical Pokémon. | [optional] [default to undefined]
**hatch_counter** | **number** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon\&#39;s egg hatches, unless utilizing bonuses like Flame Body\&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] [default to undefined]
**has_gender_differences** | **boolean** | Whether or not this Pokémon has visual gender differences. | [optional] [default to undefined]
**forms_switchable** | **boolean** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] [default to undefined]
**growth_rate** | [**GrowthRateSummary**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | [default to undefined]
**pokedex_numbers** | [**Array&lt;PokemonDexEntry&gt;**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly] [default to undefined]
**egg_groups** | [**Array&lt;EggGroupSummary&gt;**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly] [default to undefined]
**color** | [**PokemonColorSummary**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | [default to undefined]
**shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | [default to undefined]
**evolves_from_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | [default to undefined]
**evolution_chain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | [default to undefined]
**habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this Pokémon species was introduced in. | [default to undefined]
**names** | [**Array&lt;PokemonSpeciesName&gt;**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pal_park_encounters** | [**Array&lt;PokemonSpeciesPalParkEncounter&gt;**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly] [default to undefined]
**form_descriptions** | [**Array&lt;PokemonSpeciesDescription&gt;**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly] [default to undefined]
**flavor_text_entries** | [**Array&lt;PokemonSpeciesFlavorText&gt;**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly] [default to undefined]
**genera** | [**Array&lt;PokemonSpeciesGenus&gt;**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly] [default to undefined]
**varieties** | [**Array&lt;PokemonSpeciesVariety&gt;**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly] [default to undefined]

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
