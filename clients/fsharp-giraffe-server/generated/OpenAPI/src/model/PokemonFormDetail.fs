namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonDetailTypesInner
open OpenAPI.Model.PokemonFormDetailFormNamesInner
open OpenAPI.Model.PokemonFormDetailSprites
open OpenAPI.Model.PokemonSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module PokemonFormDetail =

  //#region PokemonFormDetail


  type PokemonFormDetail = {
    Id : int;
    Name : string;
    Order : int option;
    FormOrder : int option;
    IsDefault : bool;
    IsBattleOnly : bool;
    IsMega : bool;
    FormName : string;
    Pokemon : PokemonSummary;
    Sprites : PokemonFormDetailSprites;
    VersionGroup : VersionGroupSummary;
    FormNames : PokemonFormDetailFormNamesInner[];
    Names : PokemonFormDetailFormNamesInner[];
    Types : PokemonDetailTypesInner[];
  }
  //#endregion
