namespace OpenAPI
open PokeathlonStatApiHandlerParams
open PokeathlonStatApiServiceInterface
open System.Collections.Generic
open System

module PokeathlonStatApiServiceImplementation =

    //#region Service implementation
    type PokeathlonStatApiServiceImpl() =
      interface IPokeathlonStatApiService with

        member this.PokeathlonStatList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokeathlonStatListDefaultStatusCode { content = content }

        member this.PokeathlonStatRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokeathlonStatReadDefaultStatusCode { content = content }

      //#endregion

    let PokeathlonStatApiService = PokeathlonStatApiServiceImpl() :> IPokeathlonStatApiService