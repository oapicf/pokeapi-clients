namespace OpenAPI
open PalParkAreaApiHandlerParams
open PalParkAreaApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PalParkAreaApiServiceImplementation =

    //#region Service implementation
    type PalParkAreaApiServiceImpl() =
      interface IPalParkAreaApiService with

        member this.PalParkAreaList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PalParkAreaListDefaultStatusCode { content = content }

        member this.PalParkAreaRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PalParkAreaReadDefaultStatusCode { content = content }

      //#endregion

    let PalParkAreaApiService = PalParkAreaApiServiceImpl() :> IPalParkAreaApiService