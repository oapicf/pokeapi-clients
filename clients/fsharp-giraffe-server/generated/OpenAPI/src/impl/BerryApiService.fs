namespace OpenAPI
open BerryApiHandlerParams
open BerryApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BerryApiServiceImplementation =

    //#region Service implementation
    type BerryApiServiceImpl() =
      interface IBerryApiService with

        member this.BerryList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryListDefaultStatusCode { content = content }

        member this.BerryRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryReadDefaultStatusCode { content = content }

      //#endregion

    let BerryApiService = BerryApiServiceImpl() :> IBerryApiService