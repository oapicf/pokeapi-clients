namespace OpenAPI

open System.Collections.Generic
open System

module ItemAttributeApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ItemAttributeListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type ItemAttributeListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemAttributeListResult = ItemAttributeListDefaultStatusCode of ItemAttributeListDefaultStatusCodeResponse

    type ItemAttributeListArgs = {
      queryParams:Result<ItemAttributeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemAttributeReadPathParams = {
      id : int ;
    }
    //#endregion


    type ItemAttributeReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemAttributeReadResult = ItemAttributeReadDefaultStatusCode of ItemAttributeReadDefaultStatusCodeResponse

    type ItemAttributeReadArgs = {
      pathParams:ItemAttributeReadPathParams;
    }
