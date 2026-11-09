namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionVariableDescription
open OpenAPI.Model.EvolutionVariableName
open OpenAPI.Model.VersionGroupSummary

module EvolutionVariableDetail =

  //#region EvolutionVariableDetail


  type EvolutionVariableDetail = {
    Id : int;
    Name : string;
    Symbol : string;
    DataType : string;
    Source : string;
    VersionGroup : VersionGroupSummary;
    Names : EvolutionVariableName[];
    Descriptions : EvolutionVariableDescription[];
  }
  //#endregion
