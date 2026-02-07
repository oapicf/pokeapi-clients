namespace OpenAPI

open MovesApiHandlerParams
open MovesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MovesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveAilmentList
    /// <summary>
    /// List move meta ailments
    /// </summary>
   [<FunctionName("MoveAilmentList")>]
    let MoveAilmentList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-ailment/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveAilmentList ()
      match result with
      | MoveAilmentListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveAilmentRetrieve
    /// <summary>
    /// Get move meta ailment
    /// </summary>
   [<FunctionName("MoveAilmentRetrieve")>]
    let MoveAilmentRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-ailment/{id}/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveAilmentRetrieve ()
      match result with
      | MoveAilmentRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveBattleStyleList
    /// <summary>
    /// List move battle styles
    /// </summary>
   [<FunctionName("MoveBattleStyleList")>]
    let MoveBattleStyleList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-battle-style/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveBattleStyleList ()
      match result with
      | MoveBattleStyleListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveBattleStyleRetrieve
    /// <summary>
    /// Get move battle style
    /// </summary>
   [<FunctionName("MoveBattleStyleRetrieve")>]
    let MoveBattleStyleRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-battle-style/{id}/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveBattleStyleRetrieve ()
      match result with
      | MoveBattleStyleRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveCategoryList
    /// <summary>
    /// List move meta categories
    /// </summary>
   [<FunctionName("MoveCategoryList")>]
    let MoveCategoryList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-category/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveCategoryList ()
      match result with
      | MoveCategoryListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveCategoryRetrieve
    /// <summary>
    /// Get move meta category
    /// </summary>
   [<FunctionName("MoveCategoryRetrieve")>]
    let MoveCategoryRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-category/{id}/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveCategoryRetrieve ()
      match result with
      | MoveCategoryRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveLearnMethodList
    /// <summary>
    /// List move learn methods
    /// </summary>
   [<FunctionName("MoveLearnMethodList")>]
    let MoveLearnMethodList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-learn-method/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveLearnMethodList ()
      match result with
      | MoveLearnMethodListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveLearnMethodRetrieve
    /// <summary>
    /// Get move learn method
    /// </summary>
   [<FunctionName("MoveLearnMethodRetrieve")>]
    let MoveLearnMethodRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-learn-method/{id}/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveLearnMethodRetrieve ()
      match result with
      | MoveLearnMethodRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveList
    /// <summary>
    /// List moves
    /// </summary>
   [<FunctionName("MoveList")>]
    let MoveList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveList ()
      match result with
      | MoveListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveRetrieve
    /// <summary>
    /// Get move
    /// </summary>
   [<FunctionName("MoveRetrieve")>]
    let MoveRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move/{id}/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveRetrieve ()
      match result with
      | MoveRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveTargetList
    /// <summary>
    /// List move targets
    /// </summary>
   [<FunctionName("MoveTargetList")>]
    let MoveTargetList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-target/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveTargetList ()
      match result with
      | MoveTargetListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveTargetRetrieve
    /// <summary>
    /// Get move target
    /// </summary>
   [<FunctionName("MoveTargetRetrieve")>]
    let MoveTargetRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-target/{id}/")>]
        req:HttpRequest ) =

      let result = MovesApiService.MoveTargetRetrieve ()
      match result with
      | MoveTargetRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

