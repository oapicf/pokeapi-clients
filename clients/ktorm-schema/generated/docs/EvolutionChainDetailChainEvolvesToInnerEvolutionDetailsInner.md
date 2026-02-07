
# Table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner`
(mapped from: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**gender** | gender | long NOT NULL |  | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  |  [foreignkey]
**heldItem** | held_item | long NOT NULL |  | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  |  [foreignkey]
**item** | item | long NOT NULL |  | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  |  [foreignkey]
**knownMove** | known_move | blob NOT NULL |  | [**kotlin.Any**](kotlin.Any.md) |  | 
**knownMoveType** | known_move_type | blob NOT NULL |  | [**kotlin.Any**](kotlin.Any.md) |  | 
**location** | location | long NOT NULL |  | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  |  [foreignkey]
**minAffection** | min_affection | int NOT NULL |  | **kotlin.Int** |  | 
**minBeauty** | min_beauty | int NOT NULL |  | **kotlin.Int** |  | 
**minHappiness** | min_happiness | int NOT NULL |  | **kotlin.Int** |  | 
**minLevel** | min_level | int NOT NULL |  | **kotlin.Int** |  | 
**needsOverworldRain** | needs_overworld_rain | boolean NOT NULL |  | **kotlin.Boolean** |  | 
**partySpecies** | party_species | text NOT NULL |  | **kotlin.String** |  | 
**partyType** | party_type | text NOT NULL |  | **kotlin.String** |  | 
**relativePhysicalStats** | relative_physical_stats | text NOT NULL |  | **kotlin.String** |  | 
**timeOfDay** | time_of_day | text NOT NULL |  | **kotlin.String** |  | 
**tradeSpecies** | trade_species | text NOT NULL |  | **kotlin.String** |  | 
**trigger** | trigger | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**turnUpsideDown** | turn_upside_down | boolean NOT NULL |  | **kotlin.Boolean** |  | 




















