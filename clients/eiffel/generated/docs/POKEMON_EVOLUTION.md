# POKEMON_EVOLUTION

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version_group** | [**VERSION_GROUP_SUMMARY**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. | [default to null]
**is_default** | **BOOLEAN** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] [default to null]
**item** | [**ITEM_SUMMARY**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. | [default to null]
**trigger** | [**EVOLUTION_TRIGGER_SUMMARY**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | [default to null]
**gender** | **INTEGER_32** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] [default to null]
**held_item** | [**ITEM_SUMMARY**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | [default to null]
**known_move** | [**POKEMON_EVOLUTION_KNOWN_MOVE**](PokemonEvolution_known_move.md) |  | [default to null]
**known_move_type** | [**POKEMON_EVOLUTION_KNOWN_MOVE**](PokemonEvolution_known_move.md) |  | [default to null]
**location** | [**LOCATION_SUMMARY**](LocationSummary.md) | The location the evolution must be triggered at. | [default to null]
**min_level** | **INTEGER_32** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**min_happiness** | **INTEGER_32** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**min_beauty** | **INTEGER_32** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**min_affection** | **INTEGER_32** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] [default to null]
**near_special_rock** | **BOOLEAN** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] [default to null]
**needs_multiplayer** | **BOOLEAN** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] [default to null]
**needs_overworld_rain** | **BOOLEAN** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] [default to null]
**party_species** | [**POKEMON_SPECIES_SUMMARY**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to null]
**party_type** | [**TYPE_SUMMARY**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | [default to null]
**relative_physical_stats** | **INTEGER_32** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] [default to null]
**time_of_day** | [**STRING_32**](STRING_32.md) | The required time of day. Day or night. | [optional] [default to null]
**trade_species** | [**POKEMON_SPECIES_SUMMARY**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | [default to null]
**turn_upside_down** | **BOOLEAN** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] [default to null]
**region** | [**REGION_SUMMARY**](RegionSummary.md) | The required region in which this evolution can occur. | [default to null]
**required_pokemon_form** | [**POKEMON_FORM_SUMMARY**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | [default to null]
**evolved_pokemon_form** | [**POKEMON_FORM_SUMMARY**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | [default to null]
**used_move** | [**MOVE_SUMMARY**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | [default to null]
**min_move_count** | **INTEGER_32** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] [default to null]
**min_steps** | **INTEGER_32** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] [default to null]
**min_damage_taken** | **INTEGER_32** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] [default to null]
**allowed_natures** | [**LIST [NATURE_SUMMARY]**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] [default to null]
**condition_expression** | [**EVOLUTION_CONDITION_EXPRESSION**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


