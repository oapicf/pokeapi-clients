namespace OpenAPI
open PokedexApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokedexApiServiceInterface =

    //#region Service interface
    type IPokedexApiService =
      abstract member PokedexList : unit -> PokedexListResult
      abstract member PokedexRead : unit -> PokedexReadResult
    //#endregion