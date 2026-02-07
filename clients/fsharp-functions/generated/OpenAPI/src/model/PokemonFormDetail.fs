namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonDetailTypesInner
open OpenAPI.Model.PokemonFormDetailFormNamesInner
open OpenAPI.Model.PokemonFormDetailSprites
open OpenAPI.Model.PokemonSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module PokemonFormDetail =

  //#region PokemonFormDetail

  [<CLIMutable>]
  type PokemonFormDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "order")>]
    Order : int option;
    [<JsonProperty(PropertyName = "form_order")>]
    FormOrder : int option;
    [<JsonProperty(PropertyName = "is_default")>]
    IsDefault : bool;
    [<JsonProperty(PropertyName = "is_battle_only")>]
    IsBattleOnly : bool;
    [<JsonProperty(PropertyName = "is_mega")>]
    IsMega : bool;
    [<JsonProperty(PropertyName = "form_name")>]
    FormName : string;
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : PokemonSummary;
    [<JsonProperty(PropertyName = "sprites")>]
    Sprites : PokemonFormDetailSprites;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "form_names")>]
    FormNames : PokemonFormDetailFormNamesInner[];
    [<JsonProperty(PropertyName = "names")>]
    Names : PokemonFormDetailFormNamesInner[];
    [<JsonProperty(PropertyName = "types")>]
    Types : PokemonDetailTypesInner[];
  }

  //#endregion
