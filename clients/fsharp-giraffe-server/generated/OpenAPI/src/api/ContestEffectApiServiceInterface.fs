namespace OpenAPI
open ContestEffectApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ContestEffectApiServiceInterface =

    //#region Service interface
    type IContestEffectApiService =
      abstract member ContestEffectList:HttpContext -> ContestEffectListArgs->ContestEffectListResult
      abstract member ContestEffectRead:HttpContext -> ContestEffectReadArgs->ContestEffectReadResult
    //#endregion