namespace OpenAPI
open ContestsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ContestsApiServiceInterface =

    //#region Service interface
    type IContestsApiService =
      abstract member ContestEffectList:HttpContext -> ContestEffectListArgs->ContestEffectListResult
      abstract member ContestEffectRetrieve:HttpContext -> ContestEffectRetrieveArgs->ContestEffectRetrieveResult
      abstract member ContestTypeList:HttpContext -> ContestTypeListArgs->ContestTypeListResult
      abstract member ContestTypeRetrieve:HttpContext -> ContestTypeRetrieveArgs->ContestTypeRetrieveResult
      abstract member SuperContestEffectList:HttpContext -> SuperContestEffectListArgs->SuperContestEffectListResult
      abstract member SuperContestEffectRetrieve:HttpContext -> SuperContestEffectRetrieveArgs->SuperContestEffectRetrieveResult
    //#endregion