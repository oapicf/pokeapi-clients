namespace OpenAPI
open MoveLearnMethodApiHandlerParams
open MoveLearnMethodApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MoveLearnMethodApiServiceImplementation =

    //#region Service implementation
    type MoveLearnMethodApiServiceImpl() =
      interface IMoveLearnMethodApiService with

        member this.MoveLearnMethodList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveLearnMethodListDefaultStatusCode { content = content }

        member this.MoveLearnMethodRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveLearnMethodReadDefaultStatusCode { content = content }

      //#endregion

    let MoveLearnMethodApiService = MoveLearnMethodApiServiceImpl() :> IMoveLearnMethodApiService