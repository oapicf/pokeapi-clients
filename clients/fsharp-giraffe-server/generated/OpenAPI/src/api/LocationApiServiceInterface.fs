namespace OpenAPI
open LocationApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LocationApiServiceInterface =

    //#region Service interface
    type ILocationApiService =
      abstract member LocationList:HttpContext -> LocationListArgs->LocationListResult
      abstract member LocationRead:HttpContext -> LocationReadArgs->LocationReadResult
    //#endregion