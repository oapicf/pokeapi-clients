namespace OpenAPI
open LocationApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LocationApiServiceInterface =

    //#region Service interface
    type ILocationApiService =
      abstract member LocationAreaList:HttpContext -> LocationAreaListArgs->LocationAreaListResult
      abstract member LocationAreaRetrieve:HttpContext -> LocationAreaRetrieveArgs->LocationAreaRetrieveResult
      abstract member LocationList:HttpContext -> LocationListArgs->LocationListResult
      abstract member LocationRetrieve:HttpContext -> LocationRetrieveArgs->LocationRetrieveResult
      abstract member PalParkAreaList:HttpContext -> PalParkAreaListArgs->PalParkAreaListResult
      abstract member PalParkAreaRetrieve:HttpContext -> PalParkAreaRetrieveArgs->PalParkAreaRetrieveResult
      abstract member RegionList:HttpContext -> RegionListArgs->RegionListResult
      abstract member RegionRetrieve:HttpContext -> RegionRetrieveArgs->RegionRetrieveResult
    //#endregion