namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokeathlonStatAffectingNature

module PokeathlonStatAffectingNatures =

  //#region PokeathlonStatAffectingNatures

  [<CLIMutable>]
  type PokeathlonStatAffectingNatures = {
    [<JsonProperty(PropertyName = "increase")>]
    Increase : PokeathlonStatAffectingNature[];
    [<JsonProperty(PropertyName = "decrease")>]
    Decrease : PokeathlonStatAffectingNature[];
  }

  //#endregion
