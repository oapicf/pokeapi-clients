namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryDetailFlavorsInnerFlavor

module BerryDetailFlavorsInner =

  //#region BerryDetailFlavorsInner

  [<CLIMutable>]
  type BerryDetailFlavorsInner = {
    [<JsonProperty(PropertyName = "potency")>]
    Potency : int;
    [<JsonProperty(PropertyName = "flavor")>]
    Flavor : BerryDetailFlavorsInnerFlavor;
  }

  //#endregion
