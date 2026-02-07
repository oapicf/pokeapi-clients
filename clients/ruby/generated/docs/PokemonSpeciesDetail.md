# PokeApiClient::PokemonSpeciesDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **order** | **Integer** |  | [optional] |
| **gender_rate** | **Integer** |  | [optional] |
| **capture_rate** | **Integer** |  | [optional] |
| **base_happiness** | **Integer** |  | [optional] |
| **is_baby** | **Boolean** |  | [optional] |
| **is_legendary** | **Boolean** |  | [optional] |
| **is_mythical** | **Boolean** |  | [optional] |
| **hatch_counter** | **Integer** |  | [optional] |
| **has_gender_differences** | **Boolean** |  | [optional] |
| **forms_switchable** | **Boolean** |  | [optional] |
| **growth_rate** | [**GrowthRateSummary**](GrowthRateSummary.md) |  |  |
| **pokedex_numbers** | [**Array&lt;PokemonDexEntry&gt;**](PokemonDexEntry.md) |  |  |
| **egg_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **color** | [**PokemonColorSummary**](PokemonColorSummary.md) |  |  |
| **shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) |  |  |
| **evolves_from_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  |  |
| **evolution_chain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) |  |  |
| **habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) |  |  |
| **generation** | [**GenerationSummary**](GenerationSummary.md) |  |  |
| **names** | [**Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  |  |
| **pal_park_encounters** | [**Array&lt;PokemonSpeciesDetailPalParkEncountersInner&gt;**](PokemonSpeciesDetailPalParkEncountersInner.md) |  |  |
| **form_descriptions** | [**Array&lt;PokemonSpeciesDescription&gt;**](PokemonSpeciesDescription.md) |  |  |
| **flavor_text_entries** | [**Array&lt;PokemonSpeciesFlavorText&gt;**](PokemonSpeciesFlavorText.md) |  |  |
| **genera** | [**Array&lt;PokemonSpeciesDetailGeneraInner&gt;**](PokemonSpeciesDetailGeneraInner.md) |  |  |
| **varieties** | [**Array&lt;PokemonSpeciesDetailVarietiesInner&gt;**](PokemonSpeciesDetailVarietiesInner.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpeciesDetail.new(
  id: null,
  name: null,
  order: null,
  gender_rate: null,
  capture_rate: null,
  base_happiness: null,
  is_baby: null,
  is_legendary: null,
  is_mythical: null,
  hatch_counter: null,
  has_gender_differences: null,
  forms_switchable: null,
  growth_rate: null,
  pokedex_numbers: null,
  egg_groups: null,
  color: null,
  shape: null,
  evolves_from_species: null,
  evolution_chain: null,
  habitat: null,
  generation: null,
  names: null,
  pal_park_encounters: null,
  form_descriptions: null,
  flavor_text_entries: null,
  genera: null,
  varieties: null
)
```

