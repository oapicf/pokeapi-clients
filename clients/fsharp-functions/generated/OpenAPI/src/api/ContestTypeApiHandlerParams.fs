namespace OpenAPI

open System.Collections.Generic
open System

module ContestTypeApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ContestTypeListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type ContestTypeListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ContestTypeListResult = ContestTypeListDefaultStatusCode of ContestTypeListDefaultStatusCodeResponse

    type ContestTypeListArgs = {
      queryParams:Result<ContestTypeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ContestTypeReadPathParams = {
      id : int ;
    }
    //#endregion


    type ContestTypeReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type ContestTypeReadResult = ContestTypeReadDefaultStatusCode of ContestTypeReadDefaultStatusCodeResponse

    type ContestTypeReadArgs = {
      pathParams:ContestTypeReadPathParams;
    }
