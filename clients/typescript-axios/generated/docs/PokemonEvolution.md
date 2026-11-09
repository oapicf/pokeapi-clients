# PokemonEvolution


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. | [default to undefined]
**is_default** | **boolean** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one \&#39;default\&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] [default to undefined]
**item** | [**ItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. | [default to undefined]
**trigger** | [**EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | [default to undefined]
**gender** | **number** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] [default to undefined]
**held_item** | [**ItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | [default to undefined]
**known_move** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  | [default to undefined]
**known_move_type** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  | [default to undefined]
**location** | [**LocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. | [default to undefined]
**min_level** | **number** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to undefined]
**min_happiness** | **number** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to undefined]
**min_beauty** | **number** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to undefined]
**min_affection** | **number** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to undefined]
**near_special_rock** | **boolean** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] [default to undefined]
**needs_multiplayer** | **boolean** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] [default to undefined]
**needs_overworld_rain** | **boolean** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] [default to undefined]
**party_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to undefined]
**party_type** | [**TypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to undefined]
**relative_physical_stats** | **number** | The required relation between the Pokémon\&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] [default to undefined]
**time_of_day** | **string** | The required time of day. Day or night. | [optional] [default to undefined]
**trade_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | [default to undefined]
**turn_upside_down** | **boolean** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] [default to undefined]
**region** | [**RegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. | [default to undefined]
**required_pokemon_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | [default to undefined]
**evolved_pokemon_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | [default to undefined]
**used_move** | [**MoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | [default to undefined]
**min_move_count** | **number** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] [default to undefined]
**min_steps** | **number** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] [default to undefined]
**min_damage_taken** | **number** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] [default to undefined]
**allowed_natures** | [**Array&lt;NatureSummary&gt;**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] [default to undefined]
**condition_expression** | [**EvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] [default to undefined]

## Example

```typescript
import { PokemonEvolution } from './api';

const instance: PokemonEvolution = {
    version_group,
    is_default,
    item,
    trigger,
    gender,
    held_item,
    known_move,
    known_move_type,
    location,
    min_level,
    min_happiness,
    min_beauty,
    min_affection,
    near_special_rock,
    needs_multiplayer,
    needs_overworld_rain,
    party_species,
    party_type,
    relative_physical_stats,
    time_of_day,
    trade_species,
    turn_upside_down,
    region,
    required_pokemon_form,
    evolved_pokemon_form,
    used_move,
    min_move_count,
    min_steps,
    min_damage_taken,
    allowed_natures,
    condition_expression,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
