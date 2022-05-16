namespace OpenAPI
open PalParkAreaApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PalParkAreaApiServiceInterface =

    //#region Service interface
    type IPalParkAreaApiService =
      abstract member PalParkAreaList:HttpContext -> PalParkAreaListArgs->PalParkAreaListResult
      abstract member PalParkAreaRead:HttpContext -> PalParkAreaReadArgs->PalParkAreaReadResult
    //#endregion