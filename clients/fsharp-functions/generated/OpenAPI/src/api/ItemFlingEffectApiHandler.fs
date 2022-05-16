namespace OpenAPI

open ItemFlingEffectApiHandlerParams
open ItemFlingEffectApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ItemFlingEffectApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemFlingEffectList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemFlingEffectList")>]
    let ItemFlingEffectList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/item-fling-effect/")>]
        req:HttpRequest ) =

      let result = ItemFlingEffectApiService.ItemFlingEffectList ()
      match result with
      | ItemFlingEffectListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ItemFlingEffectRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ItemFlingEffectRead")>]
    let ItemFlingEffectRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/item-fling-effect/{id}/")>]
        req:HttpRequest ) =

      let result = ItemFlingEffectApiService.ItemFlingEffectRead ()
      match result with
      | ItemFlingEffectReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

