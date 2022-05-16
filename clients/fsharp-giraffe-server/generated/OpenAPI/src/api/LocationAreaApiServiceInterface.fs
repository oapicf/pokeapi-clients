namespace OpenAPI
open LocationAreaApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LocationAreaApiServiceInterface =

    //#region Service interface
    type ILocationAreaApiService =
      abstract member LocationAreaList:HttpContext -> LocationAreaListArgs->LocationAreaListResult
      abstract member LocationAreaRead:HttpContext -> LocationAreaReadArgs->LocationAreaReadResult
    //#endregion