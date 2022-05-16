namespace OpenAPI
open MoveTargetApiHandlerParams
open MoveTargetApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MoveTargetApiServiceImplementation =

    //#region Service implementation
    type MoveTargetApiServiceImpl() =
      interface IMoveTargetApiService with

        member this.MoveTargetList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveTargetListDefaultStatusCode { content = content }

        member this.MoveTargetRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveTargetReadDefaultStatusCode { content = content }

      //#endregion

    let MoveTargetApiService = MoveTargetApiServiceImpl() :> IMoveTargetApiService