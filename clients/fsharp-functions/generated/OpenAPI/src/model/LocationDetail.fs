namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationAreaSummary
open OpenAPI.Model.LocationGameIndex
open OpenAPI.Model.LocationName
open OpenAPI.Model.RegionSummary

module LocationDetail =

  //#region LocationDetail

  [<CLIMutable>]
  type LocationDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "region")>]
    Region : RegionSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : LocationName[];
    [<JsonProperty(PropertyName = "game_indices")>]
    GameIndices : LocationGameIndex[];
    [<JsonProperty(PropertyName = "areas")>]
    Areas : LocationAreaSummary[];
  }

  //#endregion
