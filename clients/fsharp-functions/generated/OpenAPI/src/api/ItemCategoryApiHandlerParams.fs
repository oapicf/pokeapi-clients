namespace OpenAPI

open System.Collections.Generic
open System

module ItemCategoryApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ItemCategoryListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type ItemCategoryListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemCategoryListResult = ItemCategoryListDefaultStatusCode of ItemCategoryListDefaultStatusCodeResponse

    type ItemCategoryListArgs = {
      queryParams:Result<ItemCategoryListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemCategoryReadPathParams = {
      id : int ;
    }
    //#endregion


    type ItemCategoryReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemCategoryReadResult = ItemCategoryReadDefaultStatusCode of ItemCategoryReadDefaultStatusCodeResponse

    type ItemCategoryReadArgs = {
      pathParams:ItemCategoryReadPathParams;
    }
