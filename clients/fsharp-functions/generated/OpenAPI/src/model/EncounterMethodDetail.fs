namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterMethodName
open OpenAPI.Model.int option

module EncounterMethodDetail =

  //#region EncounterMethodDetail

  [<CLIMutable>]
  type EncounterMethodDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "order")>]
    Order : int option;
    [<JsonProperty(PropertyName = "names")>]
    Names : EncounterMethodName[];
  }

  //#endregion
