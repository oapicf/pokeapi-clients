namespace OpenAPI

open System.Collections.Generic
open System

module ItemApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ItemListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type ItemListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemListResult = ItemListDefaultStatusCode of ItemListDefaultStatusCodeResponse

    type ItemListArgs = {
      queryParams:Result<ItemListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemReadPathParams = {
      id : int ;
    }
    //#endregion


    type ItemReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ItemReadResult = ItemReadDefaultStatusCode of ItemReadDefaultStatusCodeResponse

    type ItemReadArgs = {
      pathParams:ItemReadPathParams;
    }
