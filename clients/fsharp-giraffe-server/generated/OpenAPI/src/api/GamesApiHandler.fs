namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open GamesApiHandlerParams
open GamesApiServiceInterface
open GamesApiServiceImplementation
open OpenAPI.Model.GenerationDetail
open OpenAPI.Model.PaginatedGenerationSummaryList
open OpenAPI.Model.PaginatedPokedexSummaryList
open OpenAPI.Model.PaginatedVersionGroupSummaryList
open OpenAPI.Model.PaginatedVersionSummaryList
open OpenAPI.Model.PokedexDetail
open OpenAPI.Model.VersionDetail
open OpenAPI.Model.VersionGroupDetail

module GamesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GenerationList
    /// <summary>
    /// List genrations
    /// </summary>

    let GenerationList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerationListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GenerationListArgs
          let result = GamesApiService.GenerationList ctx serviceArgs
          return! (match result with
                      | GenerationListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerationRetrieve
    /// <summary>
    /// Get genration
    /// </summary>

    let GenerationRetrieve (pathParams:GenerationRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GenerationRetrieveArgs
          let result = GamesApiService.GenerationRetrieve ctx serviceArgs
          return! (match result with
                      | GenerationRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokedexList
    /// <summary>
    /// List pokedex
    /// </summary>

    let PokedexList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokedexListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokedexListArgs
          let result = GamesApiService.PokedexList ctx serviceArgs
          return! (match result with
                      | PokedexListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokedexRetrieve
    /// <summary>
    /// Get pokedex
    /// </summary>

    let PokedexRetrieve (pathParams:PokedexRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokedexRetrieveArgs
          let result = GamesApiService.PokedexRetrieve ctx serviceArgs
          return! (match result with
                      | PokedexRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region VersionGroupList
    /// <summary>
    /// List version groups
    /// </summary>

    let VersionGroupList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<VersionGroupListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : VersionGroupListArgs
          let result = GamesApiService.VersionGroupList ctx serviceArgs
          return! (match result with
                      | VersionGroupListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region VersionGroupRetrieve
    /// <summary>
    /// Get version group
    /// </summary>

    let VersionGroupRetrieve (pathParams:VersionGroupRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : VersionGroupRetrieveArgs
          let result = GamesApiService.VersionGroupRetrieve ctx serviceArgs
          return! (match result with
                      | VersionGroupRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region VersionList
    /// <summary>
    /// List versions
    /// </summary>

    let VersionList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<VersionListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : VersionListArgs
          let result = GamesApiService.VersionList ctx serviceArgs
          return! (match result with
                      | VersionListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region VersionRetrieve
    /// <summary>
    /// Get version
    /// </summary>

    let VersionRetrieve (pathParams:VersionRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : VersionRetrieveArgs
          let result = GamesApiService.VersionRetrieve ctx serviceArgs
          return! (match result with
                      | VersionRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

