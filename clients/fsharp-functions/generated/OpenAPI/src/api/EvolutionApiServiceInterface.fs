namespace OpenAPI
open EvolutionApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EvolutionApiServiceInterface =

    //#region Service interface
    type IEvolutionApiService =
      abstract member EvolutionChainList : unit -> EvolutionChainListResult
      abstract member EvolutionChainRetrieve : unit -> EvolutionChainRetrieveResult
      abstract member EvolutionTriggerList : unit -> EvolutionTriggerListResult
      abstract member EvolutionTriggerRetrieve : unit -> EvolutionTriggerRetrieveResult
    //#endregion