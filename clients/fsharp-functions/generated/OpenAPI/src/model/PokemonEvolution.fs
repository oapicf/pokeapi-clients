namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionConditionExpression
open OpenAPI.Model.EvolutionTriggerSummary
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.LocationSummary
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.NatureSummary
open OpenAPI.Model.PokemonEvolutionKnownMove
open OpenAPI.Model.PokemonFormSummary
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module PokemonEvolution =

  //#region PokemonEvolution

  [<CLIMutable>]
  type PokemonEvolution = {
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "is_default")>]
    IsDefault : bool;
    [<JsonProperty(PropertyName = "item")>]
    Item : ItemSummary;
    [<JsonProperty(PropertyName = "trigger")>]
    Trigger : EvolutionTriggerSummary;
    [<JsonProperty(PropertyName = "gender")>]
    Gender : int option;
    [<JsonProperty(PropertyName = "held_item")>]
    HeldItem : ItemSummary;
    [<JsonProperty(PropertyName = "known_move")>]
    KnownMove : PokemonEvolutionKnownMove;
    [<JsonProperty(PropertyName = "known_move_type")>]
    KnownMoveType : PokemonEvolutionKnownMove;
    [<JsonProperty(PropertyName = "location")>]
    Location : LocationSummary;
    [<JsonProperty(PropertyName = "min_level")>]
    MinLevel : int option;
    [<JsonProperty(PropertyName = "min_happiness")>]
    MinHappiness : int option;
    [<JsonProperty(PropertyName = "min_beauty")>]
    MinBeauty : int option;
    [<JsonProperty(PropertyName = "min_affection")>]
    MinAffection : int option;
    [<JsonProperty(PropertyName = "near_special_rock")>]
    NearSpecialRock : bool;
    [<JsonProperty(PropertyName = "needs_multiplayer")>]
    NeedsMultiplayer : bool;
    [<JsonProperty(PropertyName = "needs_overworld_rain")>]
    NeedsOverworldRain : bool;
    [<JsonProperty(PropertyName = "party_species")>]
    PartySpecies : PokemonSpeciesSummary;
    [<JsonProperty(PropertyName = "party_type")>]
    PartyType : TypeSummary;
    [<JsonProperty(PropertyName = "relative_physical_stats")>]
    RelativePhysicalStats : int option;
    [<JsonProperty(PropertyName = "time_of_day")>]
    TimeOfDay : string;
    [<JsonProperty(PropertyName = "trade_species")>]
    TradeSpecies : PokemonSpeciesSummary;
    [<JsonProperty(PropertyName = "turn_upside_down")>]
    TurnUpsideDown : bool;
    [<JsonProperty(PropertyName = "region")>]
    Region : RegionSummary;
    [<JsonProperty(PropertyName = "required_pokemon_form")>]
    RequiredPokemonForm : PokemonFormSummary;
    [<JsonProperty(PropertyName = "evolved_pokemon_form")>]
    EvolvedPokemonForm : PokemonFormSummary;
    [<JsonProperty(PropertyName = "used_move")>]
    UsedMove : MoveSummary;
    [<JsonProperty(PropertyName = "min_move_count")>]
    MinMoveCount : int option;
    [<JsonProperty(PropertyName = "min_steps")>]
    MinSteps : int option;
    [<JsonProperty(PropertyName = "min_damage_taken")>]
    MinDamageTaken : int option;
    [<JsonProperty(PropertyName = "allowed_natures")>]
    AllowedNatures : NatureSummary[];
    [<JsonProperty(PropertyName = "condition_expression")>]
    ConditionExpression : EvolutionConditionExpression;
  }

  //#endregion
