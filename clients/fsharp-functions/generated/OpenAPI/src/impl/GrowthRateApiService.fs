namespace OpenAPI
open GrowthRateApiHandlerParams
open GrowthRateApiServiceInterface
open System.Collections.Generic
open System

module GrowthRateApiServiceImplementation =

    //#region Service implementation
    type GrowthRateApiServiceImpl() =
      interface IGrowthRateApiService with

        member this.GrowthRateList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GrowthRateListDefaultStatusCode { content = content }

        member this.GrowthRateRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GrowthRateReadDefaultStatusCode { content = content }

      //#endregion

    let GrowthRateApiService = GrowthRateApiServiceImpl() :> IGrowthRateApiService