namespace OpenAPI
open PokemonFormApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokemonFormApiServiceInterface =

    //#region Service interface
    type IPokemonFormApiService =
      abstract member PokemonFormList:HttpContext -> PokemonFormListArgs->PokemonFormListResult
      abstract member PokemonFormRead:HttpContext -> PokemonFormReadArgs->PokemonFormReadResult
    //#endregion