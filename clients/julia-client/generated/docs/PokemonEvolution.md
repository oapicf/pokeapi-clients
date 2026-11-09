# PokemonEvolution


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`version_group`** | [**`*VersionGroupSummary`**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. | [default to nothing]
**`is_default`** | **`Bool`** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] [default to nothing]
**`item`** | [**`*ItemSummary`**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. | [default to nothing]
**`trigger`** | [**`*EvolutionTriggerSummary`**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | [default to nothing]
**`gender`** | **`Int64`** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] [default to nothing]
**`held_item`** | [**`*ItemSummary`**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | [default to nothing]
**`known_move`** | [**`*PokemonEvolutionKnownMove`**](PokemonEvolutionKnownMove.md) |  | [default to nothing]
**`known_move_type`** | [**`*PokemonEvolutionKnownMove`**](PokemonEvolutionKnownMove.md) |  | [default to nothing]
**`location`** | [**`*LocationSummary`**](LocationSummary.md) | The location the evolution must be triggered at. | [default to nothing]
**`min_level`** | **`Int64`** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to nothing]
**`min_happiness`** | **`Int64`** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to nothing]
**`min_beauty`** | **`Int64`** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to nothing]
**`min_affection`** | **`Int64`** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to nothing]
**`near_special_rock`** | **`Bool`** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] [default to nothing]
**`needs_multiplayer`** | **`Bool`** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] [default to nothing]
**`needs_overworld_rain`** | **`Bool`** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] [default to nothing]
**`party_species`** | [**`*PokemonSpeciesSummary`**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to nothing]
**`party_type`** | [**`*TypeSummary`**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to nothing]
**`relative_physical_stats`** | **`Int64`** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] [default to nothing]
**`time_of_day`** | **`String`** | The required time of day. Day or night. | [optional] [default to nothing]
**`trade_species`** | [**`*PokemonSpeciesSummary`**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | [default to nothing]
**`turn_upside_down`** | **`Bool`** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] [default to nothing]
**`region`** | [**`*RegionSummary`**](RegionSummary.md) | The required region in which this evolution can occur. | [default to nothing]
**`required_pokemon_form`** | [**`*PokemonFormSummary`**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | [default to nothing]
**`evolved_pokemon_form`** | [**`*PokemonFormSummary`**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | [default to nothing]
**`used_move`** | [**`*MoveSummary`**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | [default to nothing]
**`min_move_count`** | **`Int64`** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] [default to nothing]
**`min_steps`** | **`Int64`** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] [default to nothing]
**`min_damage_taken`** | **`Int64`** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] [default to nothing]
**`allowed_natures`** | [**`Vector{NatureSummary}`**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] [default to nothing]
**`condition_expression`** | [**`*EvolutionConditionExpression`**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


