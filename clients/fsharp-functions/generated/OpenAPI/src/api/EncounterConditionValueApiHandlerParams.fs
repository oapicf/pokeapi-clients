namespace OpenAPI

open System.Collections.Generic
open System

module EncounterConditionValueApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EncounterConditionValueListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type EncounterConditionValueListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EncounterConditionValueListResult = EncounterConditionValueListDefaultStatusCode of EncounterConditionValueListDefaultStatusCodeResponse

    type EncounterConditionValueListArgs = {
      queryParams:Result<EncounterConditionValueListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EncounterConditionValueReadPathParams = {
      id : int ;
    }
    //#endregion


    type EncounterConditionValueReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EncounterConditionValueReadResult = EncounterConditionValueReadDefaultStatusCode of EncounterConditionValueReadDefaultStatusCodeResponse

    type EncounterConditionValueReadArgs = {
      pathParams:EncounterConditionValueReadPathParams;
    }
