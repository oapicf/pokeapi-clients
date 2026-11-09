namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.MoveLearnMethodSummary
open OpenAPI.Model.PokedexSummary
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.VersionSummary
open OpenAPI.Model.int option

module VersionGroupDetail =

  //#region VersionGroupDetail

  [<CLIMutable>]
  type VersionGroupDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "order")>]
    Order : int option;
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "move_learn_methods")>]
    MoveLearnMethods : MoveLearnMethodSummary[];
    [<JsonProperty(PropertyName = "pokedexes")>]
    Pokedexes : PokedexSummary[];
    [<JsonProperty(PropertyName = "regions")>]
    Regions : RegionSummary[];
    [<JsonProperty(PropertyName = "versions")>]
    Versions : VersionSummary[];
  }

  //#endregion
