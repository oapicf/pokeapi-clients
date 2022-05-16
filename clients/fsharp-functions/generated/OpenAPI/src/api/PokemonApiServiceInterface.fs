namespace OpenAPI
open PokemonApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokemonApiServiceInterface =

    //#region Service interface
    type IPokemonApiService =
      abstract member PokemonList : unit -> PokemonListResult
      abstract member PokemonRead : unit -> PokemonReadResult
    //#endregion