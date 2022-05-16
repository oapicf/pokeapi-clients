namespace OpenAPI
open MoveLearnMethodApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MoveLearnMethodApiServiceInterface =

    //#region Service interface
    type IMoveLearnMethodApiService =
      abstract member MoveLearnMethodList:HttpContext -> MoveLearnMethodListArgs->MoveLearnMethodListResult
      abstract member MoveLearnMethodRead:HttpContext -> MoveLearnMethodReadArgs->MoveLearnMethodReadResult
    //#endregion