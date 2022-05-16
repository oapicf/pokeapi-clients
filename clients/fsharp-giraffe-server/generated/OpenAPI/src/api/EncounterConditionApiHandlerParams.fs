namespace OpenAPI

open System.Collections.Generic
open System

module EncounterConditionApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EncounterConditionListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type EncounterConditionListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EncounterConditionListResult = EncounterConditionListDefaultStatusCode of EncounterConditionListDefaultStatusCodeResponse

    type EncounterConditionListArgs = {
      queryParams:Result<EncounterConditionListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EncounterConditionReadPathParams = {
      id : int ;
    }
    //#endregion


    type EncounterConditionReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EncounterConditionReadResult = EncounterConditionReadDefaultStatusCode of EncounterConditionReadDefaultStatusCodeResponse

    type EncounterConditionReadArgs = {
      pathParams:EncounterConditionReadPathParams;
    }
