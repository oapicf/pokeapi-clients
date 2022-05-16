namespace OpenAPI
open MoveTargetApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MoveTargetApiServiceInterface =

    //#region Service interface
    type IMoveTargetApiService =
      abstract member MoveTargetList : unit -> MoveTargetListResult
      abstract member MoveTargetRead : unit -> MoveTargetReadResult
    //#endregion