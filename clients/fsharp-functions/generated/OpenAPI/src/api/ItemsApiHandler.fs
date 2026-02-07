namespace OpenAPI

open ItemsApiHandlerParams
open ItemsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ItemsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemAttributeList
    /// <summary>
    /// List item attributes
    /// </summary>
   [<FunctionName("ItemAttributeList")>]
    let ItemAttributeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-attribute/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemAttributeList ()
      match result with
      | ItemAttributeListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemAttributeRetrieve
    /// <summary>
    /// Get item attribute
    /// </summary>
   [<FunctionName("ItemAttributeRetrieve")>]
    let ItemAttributeRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-attribute/{id}/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemAttributeRetrieve ()
      match result with
      | ItemAttributeRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemCategoryList
    /// <summary>
    /// List item categories
    /// </summary>
   [<FunctionName("ItemCategoryList")>]
    let ItemCategoryList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-category/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemCategoryList ()
      match result with
      | ItemCategoryListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemCategoryRetrieve
    /// <summary>
    /// Get item category
    /// </summary>
   [<FunctionName("ItemCategoryRetrieve")>]
    let ItemCategoryRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-category/{id}/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemCategoryRetrieve ()
      match result with
      | ItemCategoryRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemFlingEffectList
    /// <summary>
    /// List item fling effects
    /// </summary>
   [<FunctionName("ItemFlingEffectList")>]
    let ItemFlingEffectList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-fling-effect/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemFlingEffectList ()
      match result with
      | ItemFlingEffectListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemFlingEffectRetrieve
    /// <summary>
    /// Get item fling effect
    /// </summary>
   [<FunctionName("ItemFlingEffectRetrieve")>]
    let ItemFlingEffectRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-fling-effect/{id}/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemFlingEffectRetrieve ()
      match result with
      | ItemFlingEffectRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemList
    /// <summary>
    /// List items
    /// </summary>
   [<FunctionName("ItemList")>]
    let ItemList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemList ()
      match result with
      | ItemListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemPocketList
    /// <summary>
    /// List item pockets
    /// </summary>
   [<FunctionName("ItemPocketList")>]
    let ItemPocketList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-pocket/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemPocketList ()
      match result with
      | ItemPocketListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemPocketRetrieve
    /// <summary>
    /// Get item pocket
    /// </summary>
   [<FunctionName("ItemPocketRetrieve")>]
    let ItemPocketRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item-pocket/{id}/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemPocketRetrieve ()
      match result with
      | ItemPocketRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ItemRetrieve
    /// <summary>
    /// Get item
    /// </summary>
   [<FunctionName("ItemRetrieve")>]
    let ItemRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/item/{id}/")>]
        req:HttpRequest ) =

      let result = ItemsApiService.ItemRetrieve ()
      match result with
      | ItemRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

