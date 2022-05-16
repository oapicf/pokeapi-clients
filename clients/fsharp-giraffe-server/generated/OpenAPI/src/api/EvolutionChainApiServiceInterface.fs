namespace OpenAPI
open EvolutionChainApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EvolutionChainApiServiceInterface =

    //#region Service interface
    type IEvolutionChainApiService =
      abstract member EvolutionChainList:HttpContext -> EvolutionChainListArgs->EvolutionChainListResult
      abstract member EvolutionChainRead:HttpContext -> EvolutionChainReadArgs->EvolutionChainReadResult
    //#endregion