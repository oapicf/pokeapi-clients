namespace OpenAPI
open BerryFirmnessApiHandlerParams
open BerryFirmnessApiServiceInterface
open System.Collections.Generic
open System

module BerryFirmnessApiServiceImplementation =

    //#region Service implementation
    type BerryFirmnessApiServiceImpl() =
      interface IBerryFirmnessApiService with

        member this.BerryFirmnessList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFirmnessListDefaultStatusCode { content = content }

        member this.BerryFirmnessRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFirmnessReadDefaultStatusCode { content = content }

      //#endregion

    let BerryFirmnessApiService = BerryFirmnessApiServiceImpl() :> IBerryFirmnessApiService