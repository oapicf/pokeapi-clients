namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BerryDetailFlavorsInnerFlavor =

  //#region BerryDetailFlavorsInnerFlavor

  [<CLIMutable>]
  type BerryDetailFlavorsInnerFlavor = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
