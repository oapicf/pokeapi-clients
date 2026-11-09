# PokeApiClient::PokemonEvolution

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. |  |
| **is_default** | **Boolean** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] |
| **item** | [**ItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. |  |
| **trigger** | [**EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. |  |
| **gender** | **Integer** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] |
| **held_item** | [**ItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. |  |
| **known_move** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  |  |
| **known_move_type** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  |  |
| **location** | [**LocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. |  |
| **min_level** | **Integer** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] |
| **min_happiness** | **Integer** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] |
| **min_beauty** | **Integer** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] |
| **min_affection** | **Integer** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] |
| **near_special_rock** | **Boolean** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] |
| **needs_multiplayer** | **Boolean** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] |
| **needs_overworld_rain** | **Boolean** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] |
| **party_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. |  |
| **party_type** | [**TypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. |  |
| **relative_physical_stats** | **Integer** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] |
| **time_of_day** | **String** | The required time of day. Day or night. | [optional] |
| **trade_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. |  |
| **turn_upside_down** | **Boolean** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] |
| **region** | [**RegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. |  |
| **required_pokemon_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. |  |
| **evolved_pokemon_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. |  |
| **used_move** | [**MoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. |  |
| **min_move_count** | **Integer** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] |
| **min_steps** | **Integer** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] |
| **min_damage_taken** | **Integer** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] |
| **allowed_natures** | [**Array&lt;NatureSummary&gt;**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] |
| **condition_expression** | [**EvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonEvolution.new(
  version_group: null,
  is_default: null,
  item: null,
  trigger: null,
  gender: null,
  held_item: null,
  known_move: null,
  known_move_type: null,
  location: null,
  min_level: null,
  min_happiness: null,
  min_beauty: null,
  min_affection: null,
  near_special_rock: null,
  needs_multiplayer: null,
  needs_overworld_rain: null,
  party_species: null,
  party_type: null,
  relative_physical_stats: null,
  time_of_day: null,
  trade_species: null,
  turn_upside_down: null,
  region: null,
  required_pokemon_form: null,
  evolved_pokemon_form: null,
  used_move: null,
  min_move_count: null,
  min_steps: null,
  min_damage_taken: null,
  allowed_natures: null,
  condition_expression: null
)
```

