namespace OpenAPI
open MoveAilmentApiHandlerParams
open MoveAilmentApiServiceInterface
open System.Collections.Generic
open System

module MoveAilmentApiServiceImplementation =

    //#region Service implementation
    type MoveAilmentApiServiceImpl() =
      interface IMoveAilmentApiService with

        member this.MoveAilmentList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveAilmentListDefaultStatusCode { content = content }

        member this.MoveAilmentRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveAilmentReadDefaultStatusCode { content = content }

      //#endregion

    let MoveAilmentApiService = MoveAilmentApiServiceImpl() :> IMoveAilmentApiService