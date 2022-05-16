namespace OpenAPI

open System.Collections.Generic
open System

module MoveAilmentApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveAilmentListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MoveAilmentListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveAilmentListResult = MoveAilmentListDefaultStatusCode of MoveAilmentListDefaultStatusCodeResponse

    type MoveAilmentListArgs = {
      queryParams:Result<MoveAilmentListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveAilmentReadPathParams = {
      id : int ;
    }
    //#endregion


    type MoveAilmentReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveAilmentReadResult = MoveAilmentReadDefaultStatusCode of MoveAilmentReadDefaultStatusCodeResponse

    type MoveAilmentReadArgs = {
      pathParams:MoveAilmentReadPathParams;
    }
