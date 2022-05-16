namespace OpenAPI
open MoveBattleStyleApiHandlerParams
open MoveBattleStyleApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MoveBattleStyleApiServiceImplementation =

    //#region Service implementation
    type MoveBattleStyleApiServiceImpl() =
      interface IMoveBattleStyleApiService with

        member this.MoveBattleStyleList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveBattleStyleListDefaultStatusCode { content = content }

        member this.MoveBattleStyleRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveBattleStyleReadDefaultStatusCode { content = content }

      //#endregion

    let MoveBattleStyleApiService = MoveBattleStyleApiServiceImpl() :> IMoveBattleStyleApiService