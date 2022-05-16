namespace OpenAPI

open System.Collections.Generic
open System

module VersionApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type VersionListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type VersionListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type VersionListResult = VersionListDefaultStatusCode of VersionListDefaultStatusCodeResponse

    type VersionListArgs = {
      queryParams:Result<VersionListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type VersionReadPathParams = {
      id : int ;
    }
    //#endregion


    type VersionReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type VersionReadResult = VersionReadDefaultStatusCode of VersionReadDefaultStatusCodeResponse

    type VersionReadArgs = {
      pathParams:VersionReadPathParams;
    }
