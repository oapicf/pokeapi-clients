namespace OpenAPI
open EvolutionChainApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EvolutionChainApiServiceInterface =

    //#region Service interface
    type IEvolutionChainApiService =
      abstract member EvolutionChainList : unit -> EvolutionChainListResult
      abstract member EvolutionChainRead : unit -> EvolutionChainReadResult
    //#endregion