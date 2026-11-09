namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NatureSummary

module PokeathlonStatAffectingNature =

  //#region PokeathlonStatAffectingNature

  [<CLIMutable>]
  type PokeathlonStatAffectingNature = {
    [<JsonProperty(PropertyName = "max_change")>]
    MaxChange : int;
    [<JsonProperty(PropertyName = "nature")>]
    Nature : NatureSummary;
  }

  //#endregion
