namespace OpenAPI
open NatureApiHandlerParams
open NatureApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module NatureApiServiceImplementation =

    //#region Service implementation
    type NatureApiServiceImpl() =
      interface INatureApiService with

        member this.NatureList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NatureListDefaultStatusCode { content = content }

        member this.NatureRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NatureReadDefaultStatusCode { content = content }

      //#endregion

    let NatureApiService = NatureApiServiceImpl() :> INatureApiService