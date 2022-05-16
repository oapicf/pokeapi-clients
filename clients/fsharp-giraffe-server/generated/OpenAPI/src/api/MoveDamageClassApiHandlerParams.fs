namespace OpenAPI

open System.Collections.Generic
open System

module MoveDamageClassApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MoveDamageClassListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MoveDamageClassListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveDamageClassListResult = MoveDamageClassListDefaultStatusCode of MoveDamageClassListDefaultStatusCodeResponse

    type MoveDamageClassListArgs = {
      queryParams:Result<MoveDamageClassListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MoveDamageClassReadPathParams = {
      id : int ;
    }
    //#endregion


    type MoveDamageClassReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MoveDamageClassReadResult = MoveDamageClassReadDefaultStatusCode of MoveDamageClassReadDefaultStatusCodeResponse

    type MoveDamageClassReadArgs = {
      pathParams:MoveDamageClassReadPathParams;
    }
