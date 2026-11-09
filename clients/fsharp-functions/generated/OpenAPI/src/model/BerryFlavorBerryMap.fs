namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerrySummary

module BerryFlavorBerryMap =

  //#region BerryFlavorBerryMap

  [<CLIMutable>]
  type BerryFlavorBerryMap = {
    [<JsonProperty(PropertyName = "potency")>]
    Potency : int;
    [<JsonProperty(PropertyName = "berry")>]
    Berry : BerrySummary;
  }

  //#endregion
