namespace OpenAPI
open PokemonApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokemonApiServiceInterface =

    //#region Service interface
    type IPokemonApiService =
      abstract member PokemonList:HttpContext -> PokemonListArgs->PokemonListResult
      abstract member PokemonRead:HttpContext -> PokemonReadArgs->PokemonReadResult
    //#endregion