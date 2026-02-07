namespace OpenAPI
open MovesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MovesApiServiceInterface =

    //#region Service interface
    type IMovesApiService =
      abstract member MoveAilmentList : unit -> MoveAilmentListResult
      abstract member MoveAilmentRetrieve : unit -> MoveAilmentRetrieveResult
      abstract member MoveBattleStyleList : unit -> MoveBattleStyleListResult
      abstract member MoveBattleStyleRetrieve : unit -> MoveBattleStyleRetrieveResult
      abstract member MoveCategoryList : unit -> MoveCategoryListResult
      abstract member MoveCategoryRetrieve : unit -> MoveCategoryRetrieveResult
      abstract member MoveLearnMethodList : unit -> MoveLearnMethodListResult
      abstract member MoveLearnMethodRetrieve : unit -> MoveLearnMethodRetrieveResult
      abstract member MoveList : unit -> MoveListResult
      abstract member MoveRetrieve : unit -> MoveRetrieveResult
      abstract member MoveTargetList : unit -> MoveTargetListResult
      abstract member MoveTargetRetrieve : unit -> MoveTargetRetrieveResult
    //#endregion