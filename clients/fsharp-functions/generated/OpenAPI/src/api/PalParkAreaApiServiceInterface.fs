namespace OpenAPI
open PalParkAreaApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PalParkAreaApiServiceInterface =

    //#region Service interface
    type IPalParkAreaApiService =
      abstract member PalParkAreaList : unit -> PalParkAreaListResult
      abstract member PalParkAreaRead : unit -> PalParkAreaReadResult
    //#endregion