namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type PokemonDetail = {
    Id : int;
    Name : string;
    BaseExperience : int option;
    Height : int option;
    IsDefault : bool;
    Order : int option;
    Weight : int option;
    Abilities : PokemonDetailAbilitiesInner[];
    PastAbilities : PokemonDetailPastAbilitiesInner[];
    Forms : PokemonFormSummary[];
    GameIndices : PokemonGameIndex[];
    HeldItems : PokemonDetailHeldItems;
    LocationAreaEncounters : string;
    Moves : PokemonDetailMovesInner[];
    Species : PokemonSpeciesSummary;
    Sprites : PokemonDetailSprites;
    Cries : PokemonDetailCries;
    Stats : PokemonStat[];
    Types : PokemonDetailTypesInner[];
    PastTypes : PokemonDetailPastTypesInner[];
  }
  //#endregion
