namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BerryFlavorDetailBerriesInnerBerry =

  //#region BerryFlavorDetailBerriesInnerBerry

  [<CLIMutable>]
  type BerryFlavorDetailBerriesInnerBerry = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
