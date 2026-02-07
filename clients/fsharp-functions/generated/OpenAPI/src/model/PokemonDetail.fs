namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonDetailAbilitiesInner
open OpenAPI.Model.PokemonDetailCries
open OpenAPI.Model.PokemonDetailHeldItems
open OpenAPI.Model.PokemonDetailMovesInner
open OpenAPI.Model.PokemonDetailPastAbilitiesInner
open OpenAPI.Model.PokemonDetailPastTypesInner
open OpenAPI.Model.PokemonDetailSprites
open OpenAPI.Model.PokemonDetailTypesInner
open OpenAPI.Model.PokemonFormSummary
open OpenAPI.Model.PokemonGameIndex
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.PokemonStat
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
    Abilities : PokemonDetailAbilitiesInner[];
    [<JsonProperty(PropertyName = "past_abilities")>]
    PastAbilities : PokemonDetailPastAbilitiesInner[];
    [<JsonProperty(PropertyName = "forms")>]
    Forms : PokemonFormSummary[];
    [<JsonProperty(PropertyName = "game_indices")>]
    GameIndices : PokemonGameIndex[];
    [<JsonProperty(PropertyName = "held_items")>]
    HeldItems : PokemonDetailHeldItems;
    [<JsonProperty(PropertyName = "location_area_encounters")>]
    LocationAreaEncounters : string;
    [<JsonProperty(PropertyName = "moves")>]
    Moves : PokemonDetailMovesInner[];
    [<JsonProperty(PropertyName = "species")>]
    Species : PokemonSpeciesSummary;
    [<JsonProperty(PropertyName = "sprites")>]
    Sprites : PokemonDetailSprites;
    [<JsonProperty(PropertyName = "cries")>]
    Cries : PokemonDetailCries;
    [<JsonProperty(PropertyName = "stats")>]
    Stats : PokemonStat[];
    [<JsonProperty(PropertyName = "types")>]
    Types : PokemonDetailTypesInner[];
    [<JsonProperty(PropertyName = "past_types")>]
    PastTypes : PokemonDetailPastTypesInner[];
  }

  //#endregion
