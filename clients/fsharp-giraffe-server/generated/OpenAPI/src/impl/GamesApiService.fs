namespace OpenAPI
open OpenAPI.Model.GenerationDetail
open OpenAPI.Model.PaginatedGenerationSummaryList
open OpenAPI.Model.PaginatedPokedexSummaryList
open OpenAPI.Model.PaginatedVersionGroupSummaryList
open OpenAPI.Model.PaginatedVersionSummaryList
open OpenAPI.Model.PokedexDetail
open OpenAPI.Model.VersionDetail
open OpenAPI.Model.VersionGroupDetail
open GamesApiHandlerParams
open GamesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module GamesApiServiceImplementation =

    //#region Service implementation
    type GamesApiServiceImpl() =
      interface IGamesApiService with

        member this.GenerationList ctx args =
            let content = "" :> obj :?> PaginatedGenerationSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerationListStatusCode200 { content = content }

        member this.GenerationRetrieve ctx args =
            let content = "" :> obj :?> GenerationDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerationRetrieveStatusCode200 { content = content }

        member this.PokedexList ctx args =
            let content = "" :> obj :?> PaginatedPokedexSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokedexListStatusCode200 { content = content }

        member this.PokedexRetrieve ctx args =
            let content = "" :> obj :?> PokedexDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokedexRetrieveStatusCode200 { content = content }

        member this.VersionGroupList ctx args =
            let content = "" :> obj :?> PaginatedVersionGroupSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionGroupListStatusCode200 { content = content }

        member this.VersionGroupRetrieve ctx args =
            let content = "" :> obj :?> VersionGroupDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionGroupRetrieveStatusCode200 { content = content }

        member this.VersionList ctx args =
            let content = "" :> obj :?> PaginatedVersionSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionListStatusCode200 { content = content }

        member this.VersionRetrieve ctx args =
            let content = "" :> obj :?> VersionDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VersionRetrieveStatusCode200 { content = content }

      //#endregion

    let GamesApiService = GamesApiServiceImpl() :> IGamesApiService