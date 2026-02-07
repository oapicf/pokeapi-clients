namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open UtilityApiHandlerParams
open UtilityApiServiceInterface
open UtilityApiServiceImplementation
open OpenAPI.Model.LanguageDetail
open OpenAPI.Model.PaginatedLanguageSummaryList

module UtilityApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LanguageList
    /// <summary>
    /// List languages
    /// </summary>

    let LanguageList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LanguageListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : LanguageListArgs
          let result = UtilityApiService.LanguageList ctx serviceArgs
          return! (match result with
                      | LanguageListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LanguageRetrieve
    /// <summary>
    /// Get language
    /// </summary>

    let LanguageRetrieve (pathParams:LanguageRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LanguageRetrieveArgs
          let result = UtilityApiService.LanguageRetrieve ctx serviceArgs
          return! (match result with
                      | LanguageRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

