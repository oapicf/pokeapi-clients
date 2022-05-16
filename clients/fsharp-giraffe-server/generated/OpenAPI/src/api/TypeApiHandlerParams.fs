namespace OpenAPI

open System.Collections.Generic
open System

module TypeApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type TypeListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type TypeListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type TypeListResult = TypeListDefaultStatusCode of TypeListDefaultStatusCodeResponse

    type TypeListArgs = {
      queryParams:Result<TypeListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type TypeReadPathParams = {
      id : int ;
    }
    //#endregion


    type TypeReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type TypeReadResult = TypeReadDefaultStatusCode of TypeReadDefaultStatusCodeResponse

    type TypeReadArgs = {
      pathParams:TypeReadPathParams;
    }
