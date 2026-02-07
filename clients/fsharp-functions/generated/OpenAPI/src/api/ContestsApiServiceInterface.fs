namespace OpenAPI
open ContestsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ContestsApiServiceInterface =

    //#region Service interface
    type IContestsApiService =
      abstract member ContestEffectList : unit -> ContestEffectListResult
      abstract member ContestEffectRetrieve : unit -> ContestEffectRetrieveResult
      abstract member ContestTypeList : unit -> ContestTypeListResult
      abstract member ContestTypeRetrieve : unit -> ContestTypeRetrieveResult
      abstract member SuperContestEffectList : unit -> SuperContestEffectListResult
      abstract member SuperContestEffectRetrieve : unit -> SuperContestEffectRetrieveResult
    //#endregion