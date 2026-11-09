namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NatureSummary

module StatAffectingNatures =

  //#region StatAffectingNatures

  [<CLIMutable>]
  type StatAffectingNatures = {
    [<JsonProperty(PropertyName = "increase")>]
    Increase : NatureSummary[];
    [<JsonProperty(PropertyName = "decrease")>]
    Decrease : NatureSummary[];
  }

  //#endregion
