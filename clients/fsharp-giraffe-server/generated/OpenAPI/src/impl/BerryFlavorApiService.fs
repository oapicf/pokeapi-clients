namespace OpenAPI
open BerryFlavorApiHandlerParams
open BerryFlavorApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BerryFlavorApiServiceImplementation =

    //#region Service implementation
    type BerryFlavorApiServiceImpl() =
      interface IBerryFlavorApiService with

        member this.BerryFlavorList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFlavorListDefaultStatusCode { content = content }

        member this.BerryFlavorRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFlavorReadDefaultStatusCode { content = content }

      //#endregion

    let BerryFlavorApiService = BerryFlavorApiServiceImpl() :> IBerryFlavorApiService