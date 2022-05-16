namespace OpenAPI
open NatureApiHandlerParams
open NatureApiServiceInterface
open System.Collections.Generic
open System

module NatureApiServiceImplementation =

    //#region Service implementation
    type NatureApiServiceImpl() =
      interface INatureApiService with

        member this.NatureList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NatureListDefaultStatusCode { content = content }

        member this.NatureRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NatureReadDefaultStatusCode { content = content }

      //#endregion

    let NatureApiService = NatureApiServiceImpl() :> INatureApiService