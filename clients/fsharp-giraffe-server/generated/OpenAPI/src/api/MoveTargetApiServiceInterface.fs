namespace OpenAPI
open MoveTargetApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MoveTargetApiServiceInterface =

    //#region Service interface
    type IMoveTargetApiService =
      abstract member MoveTargetList:HttpContext -> MoveTargetListArgs->MoveTargetListResult
      abstract member MoveTargetRead:HttpContext -> MoveTargetReadArgs->MoveTargetReadResult
    //#endregion