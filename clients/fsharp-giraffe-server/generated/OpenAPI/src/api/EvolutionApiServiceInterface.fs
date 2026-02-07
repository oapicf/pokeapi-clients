namespace OpenAPI
open EvolutionApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EvolutionApiServiceInterface =

    //#region Service interface
    type IEvolutionApiService =
      abstract member EvolutionChainList:HttpContext -> EvolutionChainListArgs->EvolutionChainListResult
      abstract member EvolutionChainRetrieve:HttpContext -> EvolutionChainRetrieveArgs->EvolutionChainRetrieveResult
      abstract member EvolutionTriggerList:HttpContext -> EvolutionTriggerListArgs->EvolutionTriggerListResult
      abstract member EvolutionTriggerRetrieve:HttpContext -> EvolutionTriggerRetrieveArgs->EvolutionTriggerRetrieveResult
    //#endregion