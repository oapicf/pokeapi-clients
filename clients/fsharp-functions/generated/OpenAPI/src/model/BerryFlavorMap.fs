namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFlavorSummary

module BerryFlavorMap =

  //#region BerryFlavorMap

  [<CLIMutable>]
  type BerryFlavorMap = {
    [<JsonProperty(PropertyName = "potency")>]
    Potency : int;
    [<JsonProperty(PropertyName = "flavor")>]
    Flavor : BerryFlavorSummary;
  }

  //#endregion
