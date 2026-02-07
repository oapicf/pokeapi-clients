namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFlavorDetailBerriesInnerBerry

module BerryFlavorDetailBerriesInner =

  //#region BerryFlavorDetailBerriesInner

  [<CLIMutable>]
  type BerryFlavorDetailBerriesInner = {
    [<JsonProperty(PropertyName = "potency")>]
    Potency : int;
    [<JsonProperty(PropertyName = "berry")>]
    Berry : BerryFlavorDetailBerriesInnerBerry;
  }

  //#endregion
