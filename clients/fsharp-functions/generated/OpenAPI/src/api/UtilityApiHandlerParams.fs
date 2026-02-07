namespace OpenAPI

open OpenAPI.Model.LanguageDetail
open OpenAPI.Model.PaginatedLanguageSummaryList
open System.Collections.Generic
open System

module UtilityApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type LanguageListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type LanguageListStatusCode200Response = {
      content:PaginatedLanguageSummaryList;
      
    }
    type LanguageListResult = LanguageListStatusCode200 of LanguageListStatusCode200Response

    type LanguageListArgs = {
      queryParams:Result<LanguageListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LanguageRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type LanguageRetrieveStatusCode200Response = {
      content:LanguageDetail;
      
    }
    type LanguageRetrieveResult = LanguageRetrieveStatusCode200 of LanguageRetrieveStatusCode200Response

    type LanguageRetrieveArgs = {
      pathParams:LanguageRetrievePathParams;
    }
