namespace OpenAPI
open MoveBattleStyleApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MoveBattleStyleApiServiceInterface =

    //#region Service interface
    type IMoveBattleStyleApiService =
      abstract member MoveBattleStyleList:HttpContext -> MoveBattleStyleListArgs->MoveBattleStyleListResult
      abstract member MoveBattleStyleRead:HttpContext -> MoveBattleStyleReadArgs->MoveBattleStyleReadResult
    //#endregion