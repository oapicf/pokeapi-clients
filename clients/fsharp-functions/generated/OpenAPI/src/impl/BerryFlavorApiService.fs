namespace OpenAPI
open BerryFlavorApiHandlerParams
open BerryFlavorApiServiceInterface
open System.Collections.Generic
open System

module BerryFlavorApiServiceImplementation =

    //#region Service implementation
    type BerryFlavorApiServiceImpl() =
      interface IBerryFlavorApiService with

        member this.BerryFlavorList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFlavorListDefaultStatusCode { content = content }

        member this.BerryFlavorRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFlavorReadDefaultStatusCode { content = content }

      //#endregion

    let BerryFlavorApiService = BerryFlavorApiServiceImpl() :> IBerryFlavorApiService