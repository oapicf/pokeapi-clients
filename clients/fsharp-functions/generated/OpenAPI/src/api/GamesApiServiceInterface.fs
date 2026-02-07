namespace OpenAPI
open GamesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module GamesApiServiceInterface =

    //#region Service interface
    type IGamesApiService =
      abstract member GenerationList : unit -> GenerationListResult
      abstract member GenerationRetrieve : unit -> GenerationRetrieveResult
      abstract member PokedexList : unit -> PokedexListResult
      abstract member PokedexRetrieve : unit -> PokedexRetrieveResult
      abstract member VersionGroupList : unit -> VersionGroupListResult
      abstract member VersionGroupRetrieve : unit -> VersionGroupRetrieveResult
      abstract member VersionList : unit -> VersionListResult
      abstract member VersionRetrieve : unit -> VersionRetrieveResult
    //#endregion