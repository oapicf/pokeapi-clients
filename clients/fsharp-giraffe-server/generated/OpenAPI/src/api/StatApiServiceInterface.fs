namespace OpenAPI
open StatApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module StatApiServiceInterface =

    //#region Service interface
    type IStatApiService =
      abstract member StatList:HttpContext -> StatListArgs->StatListResult
      abstract member StatRead:HttpContext -> StatReadArgs->StatReadResult
    //#endregion