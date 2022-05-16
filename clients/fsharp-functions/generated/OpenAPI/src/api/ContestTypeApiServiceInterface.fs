namespace OpenAPI
open ContestTypeApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ContestTypeApiServiceInterface =

    //#region Service interface
    type IContestTypeApiService =
      abstract member ContestTypeList : unit -> ContestTypeListResult
      abstract member ContestTypeRead : unit -> ContestTypeReadResult
    //#endregion