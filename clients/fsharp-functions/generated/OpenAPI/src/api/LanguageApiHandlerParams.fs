namespace OpenAPI

open System.Collections.Generic
open System

module LanguageApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type LanguageListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type LanguageListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type LanguageListResult = LanguageListDefaultStatusCode of LanguageListDefaultStatusCodeResponse

    type LanguageListArgs = {
      queryParams:Result<LanguageListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LanguageReadPathParams = {
      id : int ;
    }
    //#endregion


    type LanguageReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type LanguageReadResult = LanguageReadDefaultStatusCode of LanguageReadDefaultStatusCodeResponse

    type LanguageReadArgs = {
      pathParams:LanguageReadPathParams;
    }
