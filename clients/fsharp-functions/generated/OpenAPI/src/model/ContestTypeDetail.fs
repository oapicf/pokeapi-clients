namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFlavorSummary
open OpenAPI.Model.ContestTypeName

module ContestTypeDetail =

  //#region ContestTypeDetail

  [<CLIMutable>]
  type ContestTypeDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "berry_flavor")>]
    BerryFlavor : BerryFlavorSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : ContestTypeName[];
  }

  //#endregion
