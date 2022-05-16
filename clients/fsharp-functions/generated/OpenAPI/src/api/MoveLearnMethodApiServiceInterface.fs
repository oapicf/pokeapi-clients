namespace OpenAPI
open MoveLearnMethodApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MoveLearnMethodApiServiceInterface =

    //#region Service interface
    type IMoveLearnMethodApiService =
      abstract member MoveLearnMethodList : unit -> MoveLearnMethodListResult
      abstract member MoveLearnMethodRead : unit -> MoveLearnMethodReadResult
    //#endregion