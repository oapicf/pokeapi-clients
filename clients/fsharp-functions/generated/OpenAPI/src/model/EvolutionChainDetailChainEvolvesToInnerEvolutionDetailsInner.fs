namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender

module EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner =

  //#region EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner

  [<CLIMutable>]
  type EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner = {
    [<JsonProperty(PropertyName = "gender")>]
    Gender : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    [<JsonProperty(PropertyName = "held_item")>]
    HeldItem : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    [<JsonProperty(PropertyName = "item")>]
    Item : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    [<JsonProperty(PropertyName = "known_move")>]
    KnownMove : obj;
    [<JsonProperty(PropertyName = "known_move_type")>]
    KnownMoveType : obj;
    [<JsonProperty(PropertyName = "location")>]
    Location : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
    [<JsonProperty(PropertyName = "min_affection")>]
    MinAffection : int;
    [<JsonProperty(PropertyName = "min_beauty")>]
    MinBeauty : int;
    [<JsonProperty(PropertyName = "min_happiness")>]
    MinHappiness : int;
    [<JsonProperty(PropertyName = "min_level")>]
    MinLevel : int;
    [<JsonProperty(PropertyName = "needs_overworld_rain")>]
    NeedsOverworldRain : bool;
    [<JsonProperty(PropertyName = "party_species")>]
    PartySpecies : string;
    [<JsonProperty(PropertyName = "party_type")>]
    PartyType : string;
    [<JsonProperty(PropertyName = "relative_physical_stats")>]
    RelativePhysicalStats : string;
    [<JsonProperty(PropertyName = "time_of_day")>]
    TimeOfDay : string;
    [<JsonProperty(PropertyName = "trade_species")>]
    TradeSpecies : string;
    [<JsonProperty(PropertyName = "trigger")>]
    Trigger : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "turn_upside_down")>]
    TurnUpsideDown : bool;
  }

  //#endregion
