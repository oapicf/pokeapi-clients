namespace OpenAPI
open EvolutionTriggerApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EvolutionTriggerApiServiceInterface =

    //#region Service interface
    type IEvolutionTriggerApiService =
      abstract member EvolutionTriggerList : unit -> EvolutionTriggerListResult
      abstract member EvolutionTriggerRead : unit -> EvolutionTriggerReadResult
    //#endregion