namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type PokemonDetail = {
    Id : int;
    Name : string;
    BaseExperience : int option;
    Height : int option;
    IsDefault : bool;
    Order : int option;
    Weight : int option;
    Abilities : PokemonAbility[];
    PastAbilities : PokemonPastAbility[];
    Forms : PokemonFormSummary[];
    GameIndices : PokemonGameIndex[];
    HeldItems : PokemonHeldItemSummary[];
    LocationAreaEncounters : string;
    Moves : PokemonMove[];
    Species : PokemonSpeciesSummary;
    Sprites : PokemonSprites;
    Cries : PokemonCries;
    Stats : PokemonStat[];
    PastStats : PokemonPastStat[];
    Types : PokemonType[];
    PastTypes : PokemonPastType[];
  }
  //#endregion
