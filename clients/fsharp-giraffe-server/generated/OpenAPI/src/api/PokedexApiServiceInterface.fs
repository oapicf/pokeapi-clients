namespace OpenAPI
open PokedexApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokedexApiServiceInterface =

    //#region Service interface
    type IPokedexApiService =
      abstract member PokedexList:HttpContext -> PokedexListArgs->PokedexListResult
      abstract member PokedexRead:HttpContext -> PokedexReadArgs->PokedexReadResult
    //#endregion