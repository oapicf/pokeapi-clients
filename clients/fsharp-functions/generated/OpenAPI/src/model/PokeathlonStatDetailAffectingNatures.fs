namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokeathlonStatDetailAffectingNaturesDecreaseInner
open OpenAPI.Model.PokeathlonStatDetailAffectingNaturesIncreaseInner

module PokeathlonStatDetailAffectingNatures =

  //#region PokeathlonStatDetailAffectingNatures

  [<CLIMutable>]
  type PokeathlonStatDetailAffectingNatures = {
    [<JsonProperty(PropertyName = "decrease")>]
    Decrease : PokeathlonStatDetailAffectingNaturesDecreaseInner[];
    [<JsonProperty(PropertyName = "increase")>]
    Increase : PokeathlonStatDetailAffectingNaturesIncreaseInner[];
  }

  //#endregion
