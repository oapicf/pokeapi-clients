namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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
    Sprites : PokemonFormSprites;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "form_names")>]
    FormNames : PokemonFormName[];
    [<JsonProperty(PropertyName = "names")>]
    Names : PokemonFormName[];
    [<JsonProperty(PropertyName = "types")>]
    Types : PokemonFormType[];
    [<JsonProperty(PropertyName = "trigger_conditions")>]
    TriggerConditions : PokemonFormTriggerCondition[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : PokemonFormFlavorText[];
  }

  //#endregion
