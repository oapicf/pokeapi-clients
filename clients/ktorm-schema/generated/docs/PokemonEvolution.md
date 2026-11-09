
# Table `PokemonEvolution`
(mapped from: PokemonEvolution)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. |  [foreignkey]
**item** | item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. |  [foreignkey]
**trigger** | trigger | long NOT NULL |  | [**EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. |  [foreignkey]
**heldItem** | held_item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. |  [foreignkey]
**knownMove** | known_move | long NOT NULL |  | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  |  [foreignkey]
**knownMoveType** | known_move_type | long NOT NULL |  | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  |  [foreignkey]
**location** | location | long NOT NULL |  | [**LocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. |  [foreignkey]
**partySpecies** | party_species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. |  [foreignkey]
**partyType** | party_type | long NOT NULL |  | [**TypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. |  [foreignkey]
**tradeSpecies** | trade_species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. |  [foreignkey]
**region** | region | long NOT NULL |  | [**RegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. |  [foreignkey]
**requiredPokemonForm** | required_pokemon_form | long NOT NULL |  | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. |  [foreignkey]
**evolvedPokemonForm** | evolved_pokemon_form | long NOT NULL |  | [**PokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. |  [foreignkey]
**usedMove** | used_move | long NOT NULL |  | [**MoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. |  [foreignkey]
**allowedNatures** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureSummary&gt;**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. |  [readonly]
**conditionExpression** | condition_expression | long NOT NULL |  | [**EvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. |  [readonly] [foreignkey]
**isDefault** | is_default | boolean |  | **kotlin.Boolean** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. |  [optional]
**gender** | gender | int |  | **kotlin.Int** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. |  [optional]
**minLevel** | min_level | int |  | **kotlin.Int** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. |  [optional]
**minHappiness** | min_happiness | int |  | **kotlin.Int** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. |  [optional]
**minBeauty** | min_beauty | int |  | **kotlin.Int** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. |  [optional]
**minAffection** | min_affection | int |  | **kotlin.Int** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. |  [optional]
**nearSpecialRock** | near_special_rock | boolean |  | **kotlin.Boolean** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. |  [optional]
**needsMultiplayer** | needs_multiplayer | boolean |  | **kotlin.Boolean** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). |  [optional]
**needsOverworldRain** | needs_overworld_rain | boolean |  | **kotlin.Boolean** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. |  [optional]
**relativePhysicalStats** | relative_physical_stats | int |  | **kotlin.Int** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. |  [optional]
**timeOfDay** | time_of_day | text |  | **kotlin.String** | The required time of day. Day or night. |  [optional]
**turnUpsideDown** | turn_upside_down | boolean |  | **kotlin.Boolean** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. |  [optional]
**minMoveCount** | min_move_count | int |  | **kotlin.Int** | The minimum number of times a move must be used in order to evolve into this Pokémon species. |  [optional]
**minSteps** | min_steps | int |  | **kotlin.Int** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. |  [optional]
**minDamageTaken** | min_damage_taken | int |  | **kotlin.Int** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. |  [optional]
















# **Table `PokemonEvolutionNatureSummary`**
(mapped from: PokemonEvolutionNatureSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonEvolution | pokemonEvolution | long | | kotlin.Long | Primary Key | *one*
natureSummary | natureSummary | long | | kotlin.Long | Foreign Key | *many*



















