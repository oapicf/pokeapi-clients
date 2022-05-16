namespace OpenAPI
open MoveAilmentApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MoveAilmentApiServiceInterface =

    //#region Service interface
    type IMoveAilmentApiService =
      abstract member MoveAilmentList : unit -> MoveAilmentListResult
      abstract member MoveAilmentRead : unit -> MoveAilmentReadResult
    //#endregion