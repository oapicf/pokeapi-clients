namespace OpenAPI

open System.Collections.Generic
open System

module ItemPocketApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ItemPocketListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type ItemPocketListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemPocketListResult = ItemPocketListDefaultStatusCode of ItemPocketListDefaultStatusCodeResponse

    type ItemPocketListArgs = {
      queryParams:Result<ItemPocketListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemPocketReadPathParams = {
      id : int ;
    }
    //#endregion


    type ItemPocketReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemPocketReadResult = ItemPocketReadDefaultStatusCode of ItemPocketReadDefaultStatusCodeResponse

    type ItemPocketReadArgs = {
      pathParams:ItemPocketReadPathParams;
    }
