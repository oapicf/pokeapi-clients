namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonAbility
open OpenAPI.Model.PokemonCries
open OpenAPI.Model.PokemonFormSummary
open OpenAPI.Model.PokemonGameIndex
open OpenAPI.Model.PokemonHeldItemSummary
open OpenAPI.Model.PokemonMove
open OpenAPI.Model.PokemonPastAbility
open OpenAPI.Model.PokemonPastStat
open OpenAPI.Model.PokemonPastType
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.PokemonSprites
open OpenAPI.Model.PokemonStat
open OpenAPI.Model.PokemonType
open OpenAPI.Model.int option

module PokemonDetail =

  //#region PokemonDetail

  [<CLIMutable>]
  type PokemonDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "base_experience")>]
    BaseExperience : int option;
    [<JsonProperty(PropertyName = "height")>]
    Height : int option;
    [<JsonProperty(PropertyName = "is_default")>]
    IsDefault : bool;
    [<JsonProperty(PropertyName = "order")>]
    Order : int option;
    [<JsonProperty(PropertyName = "weight")>]
    Weight : int option;
    [<JsonProperty(PropertyName = "abilities")>]
    Abilities : PokemonAbility[];
    [<JsonProperty(PropertyName = "past_abilities")>]
    PastAbilities : PokemonPastAbility[];
    [<JsonProperty(PropertyName = "forms")>]
    Forms : PokemonFormSummary[];
    [<JsonProperty(PropertyName = "game_indices")>]
    GameIndices : PokemonGameIndex[];
    [<JsonProperty(PropertyName = "held_items")>]
    HeldItems : PokemonHeldItemSummary[];
    [<JsonProperty(PropertyName = "location_area_encounters")>]
    LocationAreaEncounters : string;
    [<JsonProperty(PropertyName = "moves")>]
    Moves : PokemonMove[];
    [<JsonProperty(PropertyName = "species")>]
    Species : PokemonSpeciesSummary;
    [<JsonProperty(PropertyName = "sprites")>]
    Sprites : PokemonSprites;
    [<JsonProperty(PropertyName = "cries")>]
    Cries : PokemonCries;
    [<JsonProperty(PropertyName = "stats")>]
    Stats : PokemonStat[];
    [<JsonProperty(PropertyName = "past_stats")>]
    PastStats : PokemonPastStat[];
    [<JsonProperty(PropertyName = "types")>]
    Types : PokemonType[];
    [<JsonProperty(PropertyName = "past_types")>]
    PastTypes : PokemonPastType[];
  }

  //#endregion
