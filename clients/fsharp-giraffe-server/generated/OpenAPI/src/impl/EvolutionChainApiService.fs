namespace OpenAPI
open EvolutionChainApiHandlerParams
open EvolutionChainApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module EvolutionChainApiServiceImplementation =

    //#region Service implementation
    type EvolutionChainApiServiceImpl() =
      interface IEvolutionChainApiService with

        member this.EvolutionChainList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionChainListDefaultStatusCode { content = content }

        member this.EvolutionChainRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionChainReadDefaultStatusCode { content = content }

      //#endregion

    let EvolutionChainApiService = EvolutionChainApiServiceImpl() :> IEvolutionChainApiService