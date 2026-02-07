namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokeathlonStatDetailAffectingNatures
open OpenAPI.Model.PokeathlonStatName

module PokeathlonStatDetail =

  //#region PokeathlonStatDetail

  [<CLIMutable>]
  type PokeathlonStatDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "affecting_natures")>]
    AffectingNatures : PokeathlonStatDetailAffectingNatures;
    [<JsonProperty(PropertyName = "names")>]
    Names : PokeathlonStatName[];
  }

  //#endregion
