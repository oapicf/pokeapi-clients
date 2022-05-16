namespace OpenAPI
open GenderApiHandlerParams
open GenderApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module GenderApiServiceImplementation =

    //#region Service implementation
    type GenderApiServiceImpl() =
      interface IGenderApiService with

        member this.GenderList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenderListDefaultStatusCode { content = content }

        member this.GenderRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenderReadDefaultStatusCode { content = content }

      //#endregion

    let GenderApiService = GenderApiServiceImpl() :> IGenderApiService