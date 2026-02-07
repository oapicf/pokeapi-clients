namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFlavorDetailBerriesInner
open OpenAPI.Model.BerryFlavorName
open OpenAPI.Model.ContestTypeSummary

module BerryFlavorDetail =

  //#region BerryFlavorDetail

  [<CLIMutable>]
  type BerryFlavorDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "berries")>]
    Berries : BerryFlavorDetailBerriesInner[];
    [<JsonProperty(PropertyName = "contest_type")>]
    ContestType : ContestTypeSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : BerryFlavorName[];
  }

  //#endregion
