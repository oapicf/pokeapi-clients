namespace OpenAPI
open MoveBattleStyleApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MoveBattleStyleApiServiceInterface =

    //#region Service interface
    type IMoveBattleStyleApiService =
      abstract member MoveBattleStyleList : unit -> MoveBattleStyleListResult
      abstract member MoveBattleStyleRead : unit -> MoveBattleStyleReadResult
    //#endregion