namespace OpenAPI
open EvolutionTriggerApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EvolutionTriggerApiServiceInterface =

    //#region Service interface
    type IEvolutionTriggerApiService =
      abstract member EvolutionTriggerList:HttpContext -> EvolutionTriggerListArgs->EvolutionTriggerListResult
      abstract member EvolutionTriggerRead:HttpContext -> EvolutionTriggerReadArgs->EvolutionTriggerReadResult
    //#endregion