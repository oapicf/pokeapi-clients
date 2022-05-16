namespace OpenAPI
open LocationAreaApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LocationAreaApiServiceInterface =

    //#region Service interface
    type ILocationAreaApiService =
      abstract member LocationAreaList : unit -> LocationAreaListResult
      abstract member LocationAreaRead : unit -> LocationAreaReadResult
    //#endregion