namespace OpenAPI
open LocationApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LocationApiServiceInterface =

    //#region Service interface
    type ILocationApiService =
      abstract member LocationList : unit -> LocationListResult
      abstract member LocationRead : unit -> LocationReadResult
    //#endregion