namespace OpenAPI
open StatApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module StatApiServiceInterface =

    //#region Service interface
    type IStatApiService =
      abstract member StatList : unit -> StatListResult
      abstract member StatRead : unit -> StatReadResult
    //#endregion