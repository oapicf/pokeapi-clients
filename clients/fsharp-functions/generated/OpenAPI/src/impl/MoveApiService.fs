namespace OpenAPI
open MoveApiHandlerParams
open MoveApiServiceInterface
open System.Collections.Generic
open System

module MoveApiServiceImplementation =

    //#region Service implementation
    type MoveApiServiceImpl() =
      interface IMoveApiService with

        member this.MoveList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveListDefaultStatusCode { content = content }

        member this.MoveRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveReadDefaultStatusCode { content = content }

      //#endregion

    let MoveApiService = MoveApiServiceImpl() :> IMoveApiService