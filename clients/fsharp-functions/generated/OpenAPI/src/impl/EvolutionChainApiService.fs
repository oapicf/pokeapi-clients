namespace OpenAPI
open EvolutionChainApiHandlerParams
open EvolutionChainApiServiceInterface
open System.Collections.Generic
open System

module EvolutionChainApiServiceImplementation =

    //#region Service implementation
    type EvolutionChainApiServiceImpl() =
      interface IEvolutionChainApiService with

        member this.EvolutionChainList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionChainListDefaultStatusCode { content = content }

        member this.EvolutionChainRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionChainReadDefaultStatusCode { content = content }

      //#endregion

    let EvolutionChainApiService = EvolutionChainApiServiceImpl() :> IEvolutionChainApiService