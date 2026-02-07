namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaSummary
open OpenAPI.Model.LocationGameIndex
open OpenAPI.Model.LocationName
open OpenAPI.Model.RegionSummary

module LocationDetail =

  //#region LocationDetail


  type LocationDetail = {
    Id : int;
    Name : string;
    Region : RegionSummary;
    Names : LocationName[];
    GameIndices : LocationGameIndex[];
    Areas : LocationAreaSummary[];
  }
  //#endregion
