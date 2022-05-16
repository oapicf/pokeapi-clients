namespace OpenAPI
open PokemonFormApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokemonFormApiServiceInterface =

    //#region Service interface
    type IPokemonFormApiService =
      abstract member PokemonFormList : unit -> PokemonFormListResult
      abstract member PokemonFormRead : unit -> PokemonFormReadResult
    //#endregion