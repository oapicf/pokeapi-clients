namespace OpenAPI
open OpenAPI.Model.EvolutionChainDetail
open OpenAPI.Model.EvolutionTriggerDetail
open OpenAPI.Model.PaginatedEvolutionChainSummaryList
open OpenAPI.Model.PaginatedEvolutionTriggerSummaryList
open EvolutionApiHandlerParams
open EvolutionApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module EvolutionApiServiceImplementation =

    //#region Service implementation
    type EvolutionApiServiceImpl() =
      interface IEvolutionApiService with

        member this.EvolutionChainList ctx args =
            let content = "" :> obj :?> PaginatedEvolutionChainSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionChainListStatusCode200 { content = content }

        member this.EvolutionChainRetrieve ctx args =
            let content = "" :> obj :?> EvolutionChainDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionChainRetrieveStatusCode200 { content = content }

        member this.EvolutionTriggerList ctx args =
            let content = "" :> obj :?> PaginatedEvolutionTriggerSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionTriggerListStatusCode200 { content = content }

        member this.EvolutionTriggerRetrieve ctx args =
            let content = "" :> obj :?> EvolutionTriggerDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EvolutionTriggerRetrieveStatusCode200 { content = content }

      //#endregion

    let EvolutionApiService = EvolutionApiServiceImpl() :> IEvolutionApiService