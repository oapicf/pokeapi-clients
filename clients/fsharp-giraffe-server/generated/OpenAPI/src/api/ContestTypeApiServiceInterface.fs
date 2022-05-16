namespace OpenAPI
open ContestTypeApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ContestTypeApiServiceInterface =

    //#region Service interface
    type IContestTypeApiService =
      abstract member ContestTypeList:HttpContext -> ContestTypeListArgs->ContestTypeListResult
      abstract member ContestTypeRead:HttpContext -> ContestTypeReadArgs->ContestTypeReadResult
    //#endregion