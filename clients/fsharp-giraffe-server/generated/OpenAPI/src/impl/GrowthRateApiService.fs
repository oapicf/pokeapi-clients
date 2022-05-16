namespace OpenAPI
open GrowthRateApiHandlerParams
open GrowthRateApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module GrowthRateApiServiceImplementation =

    //#region Service implementation
    type GrowthRateApiServiceImpl() =
      interface IGrowthRateApiService with

        member this.GrowthRateList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GrowthRateListDefaultStatusCode { content = content }

        member this.GrowthRateRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GrowthRateReadDefaultStatusCode { content = content }

      //#endregion

    let GrowthRateApiService = GrowthRateApiServiceImpl() :> IGrowthRateApiService