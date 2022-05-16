namespace OpenAPI
open MoveApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MoveApiServiceInterface =

    //#region Service interface
    type IMoveApiService =
      abstract member MoveList : unit -> MoveListResult
      abstract member MoveRead : unit -> MoveReadResult
    //#endregion