namespace OpenAPI

open System.Collections.Generic
open System

module MoveCategoryApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveCategoryListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MoveCategoryListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveCategoryListResult = MoveCategoryListDefaultStatusCode of MoveCategoryListDefaultStatusCodeResponse

    type MoveCategoryListArgs = {
      queryParams:Result<MoveCategoryListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveCategoryReadPathParams = {
      id : int ;
    }
    //#endregion


    type MoveCategoryReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveCategoryReadResult = MoveCategoryReadDefaultStatusCode of MoveCategoryReadDefaultStatusCodeResponse

    type MoveCategoryReadArgs = {
      pathParams:MoveCategoryReadPathParams;
    }
