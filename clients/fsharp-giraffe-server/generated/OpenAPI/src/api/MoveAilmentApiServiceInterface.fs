namespace OpenAPI
open MoveAilmentApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MoveAilmentApiServiceInterface =

    //#region Service interface
    type IMoveAilmentApiService =
      abstract member MoveAilmentList:HttpContext -> MoveAilmentListArgs->MoveAilmentListResult
      abstract member MoveAilmentRead:HttpContext -> MoveAilmentReadArgs->MoveAilmentReadResult
    //#endregion