namespace OpenAPI

open System.Collections.Generic
open System

module VersionGroupApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type VersionGroupListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type VersionGroupListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type VersionGroupListResult = VersionGroupListDefaultStatusCode of VersionGroupListDefaultStatusCodeResponse

    type VersionGroupListArgs = {
      queryParams:Result<VersionGroupListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type VersionGroupReadPathParams = {
      id : int ;
    }
    //#endregion


    type VersionGroupReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type VersionGroupReadResult = VersionGroupReadDefaultStatusCode of VersionGroupReadDefaultStatusCodeResponse

    type VersionGroupReadArgs = {
      pathParams:VersionGroupReadPathParams;
    }
