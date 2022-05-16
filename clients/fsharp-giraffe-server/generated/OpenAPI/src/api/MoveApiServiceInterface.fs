namespace OpenAPI
open MoveApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MoveApiServiceInterface =

    //#region Service interface
    type IMoveApiService =
      abstract member MoveList:HttpContext -> MoveListArgs->MoveListResult
      abstract member MoveRead:HttpContext -> MoveReadArgs->MoveReadResult
    //#endregion