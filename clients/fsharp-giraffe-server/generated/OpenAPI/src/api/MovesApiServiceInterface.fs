namespace OpenAPI
open MovesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MovesApiServiceInterface =

    //#region Service interface
    type IMovesApiService =
      abstract member MoveAilmentList:HttpContext -> MoveAilmentListArgs->MoveAilmentListResult
      abstract member MoveAilmentRetrieve:HttpContext -> MoveAilmentRetrieveArgs->MoveAilmentRetrieveResult
      abstract member MoveBattleStyleList:HttpContext -> MoveBattleStyleListArgs->MoveBattleStyleListResult
      abstract member MoveBattleStyleRetrieve:HttpContext -> MoveBattleStyleRetrieveArgs->MoveBattleStyleRetrieveResult
      abstract member MoveCategoryList:HttpContext -> MoveCategoryListArgs->MoveCategoryListResult
      abstract member MoveCategoryRetrieve:HttpContext -> MoveCategoryRetrieveArgs->MoveCategoryRetrieveResult
      abstract member MoveLearnMethodList:HttpContext -> MoveLearnMethodListArgs->MoveLearnMethodListResult
      abstract member MoveLearnMethodRetrieve:HttpContext -> MoveLearnMethodRetrieveArgs->MoveLearnMethodRetrieveResult
      abstract member MoveList:HttpContext -> MoveListArgs->MoveListResult
      abstract member MoveRetrieve:HttpContext -> MoveRetrieveArgs->MoveRetrieveResult
      abstract member MoveTargetList:HttpContext -> MoveTargetListArgs->MoveTargetListResult
      abstract member MoveTargetRetrieve:HttpContext -> MoveTargetRetrieveArgs->MoveTargetRetrieveResult
    //#endregion