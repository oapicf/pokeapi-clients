namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TypeSummary

module TypeRelationships =

  //#region TypeRelationships


  type TypeRelationships = {
    NoDamageTo : TypeSummary[];
    HalfDamageTo : TypeSummary[];
    DoubleDamageTo : TypeSummary[];
    NoDamageFrom : TypeSummary[];
    HalfDamageFrom : TypeSummary[];
    DoubleDamageFrom : TypeSummary[];
  }
  //#endregion
