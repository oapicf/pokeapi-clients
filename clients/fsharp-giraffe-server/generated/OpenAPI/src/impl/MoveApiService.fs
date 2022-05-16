namespace OpenAPI
open MoveApiHandlerParams
open MoveApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MoveApiServiceImplementation =

    //#region Service implementation
    type MoveApiServiceImpl() =
      interface IMoveApiService with

        member this.MoveList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveListDefaultStatusCode { content = content }

        member this.MoveRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveReadDefaultStatusCode { content = content }

      //#endregion

    let MoveApiService = MoveApiServiceImpl() :> IMoveApiService