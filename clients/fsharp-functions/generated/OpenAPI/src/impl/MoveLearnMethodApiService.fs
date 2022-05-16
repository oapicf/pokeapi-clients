namespace OpenAPI
open MoveLearnMethodApiHandlerParams
open MoveLearnMethodApiServiceInterface
open System.Collections.Generic
open System

module MoveLearnMethodApiServiceImplementation =

    //#region Service implementation
    type MoveLearnMethodApiServiceImpl() =
      interface IMoveLearnMethodApiService with

        member this.MoveLearnMethodList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveLearnMethodListDefaultStatusCode { content = content }

        member this.MoveLearnMethodRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveLearnMethodReadDefaultStatusCode { content = content }

      //#endregion

    let MoveLearnMethodApiService = MoveLearnMethodApiServiceImpl() :> IMoveLearnMethodApiService