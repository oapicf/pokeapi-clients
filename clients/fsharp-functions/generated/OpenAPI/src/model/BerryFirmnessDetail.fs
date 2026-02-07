namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFirmnessName
open OpenAPI.Model.BerrySummary

module BerryFirmnessDetail =

  //#region BerryFirmnessDetail

  [<CLIMutable>]
  type BerryFirmnessDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "berries")>]
    Berries : BerrySummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : BerryFirmnessName[];
  }

  //#endregion
