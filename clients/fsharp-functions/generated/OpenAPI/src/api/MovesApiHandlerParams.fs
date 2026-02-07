namespace OpenAPI

open OpenAPI.Model.MoveBattleStyleDetail
open OpenAPI.Model.MoveDetail
open OpenAPI.Model.MoveLearnMethodDetail
open OpenAPI.Model.MoveMetaAilmentDetail
open OpenAPI.Model.MoveMetaCategoryDetail
open OpenAPI.Model.MoveTargetDetail
open OpenAPI.Model.PaginatedMoveBattleStyleSummaryList
open OpenAPI.Model.PaginatedMoveLearnMethodSummaryList
open OpenAPI.Model.PaginatedMoveMetaAilmentSummaryList
open OpenAPI.Model.PaginatedMoveMetaCategorySummaryList
open OpenAPI.Model.PaginatedMoveSummaryList
open OpenAPI.Model.PaginatedMoveTargetSummaryList
open System.Collections.Generic
open System

module MovesApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveAilmentListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MoveAilmentListStatusCode200Response = {
      content:PaginatedMoveMetaAilmentSummaryList;
      
    }
    type MoveAilmentListResult = MoveAilmentListStatusCode200 of MoveAilmentListStatusCode200Response

    type MoveAilmentListArgs = {
      queryParams:Result<MoveAilmentListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveAilmentRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MoveAilmentRetrieveStatusCode200Response = {
      content:MoveMetaAilmentDetail;
      
    }
    type MoveAilmentRetrieveResult = MoveAilmentRetrieveStatusCode200 of MoveAilmentRetrieveStatusCode200Response

    type MoveAilmentRetrieveArgs = {
      pathParams:MoveAilmentRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MoveBattleStyleListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MoveBattleStyleListStatusCode200Response = {
      content:PaginatedMoveBattleStyleSummaryList;
      
    }
    type MoveBattleStyleListResult = MoveBattleStyleListStatusCode200 of MoveBattleStyleListStatusCode200Response

    type MoveBattleStyleListArgs = {
      queryParams:Result<MoveBattleStyleListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveBattleStyleRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MoveBattleStyleRetrieveStatusCode200Response = {
      content:MoveBattleStyleDetail;
      
    }
    type MoveBattleStyleRetrieveResult = MoveBattleStyleRetrieveStatusCode200 of MoveBattleStyleRetrieveStatusCode200Response

    type MoveBattleStyleRetrieveArgs = {
      pathParams:MoveBattleStyleRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MoveCategoryListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MoveCategoryListStatusCode200Response = {
      content:PaginatedMoveMetaCategorySummaryList;
      
    }
    type MoveCategoryListResult = MoveCategoryListStatusCode200 of MoveCategoryListStatusCode200Response

    type MoveCategoryListArgs = {
      queryParams:Result<MoveCategoryListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveCategoryRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MoveCategoryRetrieveStatusCode200Response = {
      content:MoveMetaCategoryDetail;
      
    }
    type MoveCategoryRetrieveResult = MoveCategoryRetrieveStatusCode200 of MoveCategoryRetrieveStatusCode200Response

    type MoveCategoryRetrieveArgs = {
      pathParams:MoveCategoryRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MoveLearnMethodListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MoveLearnMethodListStatusCode200Response = {
      content:PaginatedMoveLearnMethodSummaryList;
      
    }
    type MoveLearnMethodListResult = MoveLearnMethodListStatusCode200 of MoveLearnMethodListStatusCode200Response

    type MoveLearnMethodListArgs = {
      queryParams:Result<MoveLearnMethodListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveLearnMethodRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MoveLearnMethodRetrieveStatusCode200Response = {
      content:MoveLearnMethodDetail;
      
    }
    type MoveLearnMethodRetrieveResult = MoveLearnMethodRetrieveStatusCode200 of MoveLearnMethodRetrieveStatusCode200Response

    type MoveLearnMethodRetrieveArgs = {
      pathParams:MoveLearnMethodRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MoveListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MoveListStatusCode200Response = {
      content:PaginatedMoveSummaryList;
      
    }
    type MoveListResult = MoveListStatusCode200 of MoveListStatusCode200Response

    type MoveListArgs = {
      queryParams:Result<MoveListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MoveRetrieveStatusCode200Response = {
      content:MoveDetail;
      
    }
    type MoveRetrieveResult = MoveRetrieveStatusCode200 of MoveRetrieveStatusCode200Response

    type MoveRetrieveArgs = {
      pathParams:MoveRetrievePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MoveTargetListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MoveTargetListStatusCode200Response = {
      content:PaginatedMoveTargetSummaryList;
      
    }
    type MoveTargetListResult = MoveTargetListStatusCode200 of MoveTargetListStatusCode200Response

    type MoveTargetListArgs = {
      queryParams:Result<MoveTargetListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveTargetRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MoveTargetRetrieveStatusCode200Response = {
      content:MoveTargetDetail;
      
    }
    type MoveTargetRetrieveResult = MoveTargetRetrieveStatusCode200 of MoveTargetRetrieveStatusCode200Response

    type MoveTargetRetrieveArgs = {
      pathParams:MoveTargetRetrievePathParams;
    }
