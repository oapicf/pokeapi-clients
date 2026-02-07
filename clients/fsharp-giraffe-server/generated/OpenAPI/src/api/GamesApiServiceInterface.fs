namespace OpenAPI
open GamesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module GamesApiServiceInterface =

    //#region Service interface
    type IGamesApiService =
      abstract member GenerationList:HttpContext -> GenerationListArgs->GenerationListResult
      abstract member GenerationRetrieve:HttpContext -> GenerationRetrieveArgs->GenerationRetrieveResult
      abstract member PokedexList:HttpContext -> PokedexListArgs->PokedexListResult
      abstract member PokedexRetrieve:HttpContext -> PokedexRetrieveArgs->PokedexRetrieveResult
      abstract member VersionGroupList:HttpContext -> VersionGroupListArgs->VersionGroupListResult
      abstract member VersionGroupRetrieve:HttpContext -> VersionGroupRetrieveArgs->VersionGroupRetrieveResult
      abstract member VersionList:HttpContext -> VersionListArgs->VersionListResult
      abstract member VersionRetrieve:HttpContext -> VersionRetrieveArgs->VersionRetrieveResult
    //#endregion