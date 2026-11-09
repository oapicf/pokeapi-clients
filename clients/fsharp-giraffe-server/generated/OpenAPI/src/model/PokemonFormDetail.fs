namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonFormFlavorText
open OpenAPI.Model.PokemonFormName
open OpenAPI.Model.PokemonFormSprites
open OpenAPI.Model.PokemonFormTriggerCondition
open OpenAPI.Model.PokemonFormType
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
    Sprites : PokemonFormSprites;
    VersionGroup : VersionGroupSummary;
    FormNames : PokemonFormName[];
    Names : PokemonFormName[];
    Types : PokemonFormType[];
    TriggerConditions : PokemonFormTriggerCondition[];
    FlavorTextEntries : PokemonFormFlavorText[];
  }
  //#endregion
