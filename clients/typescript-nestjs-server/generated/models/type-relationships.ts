import { TypeSummary } from './type-summary';


export interface TypeRelationships { 
  /**
   * A list of types this type has no effect on.
   */
  no_damage_to: Array<TypeSummary>;
  /**
   * A list of types this type is not very effect against.
   */
  half_damage_to: Array<TypeSummary>;
  /**
   * A list of types this type is very effect against.
   */
  double_damage_to: Array<TypeSummary>;
  /**
   * A list of types that have no effect on this type.
   */
  no_damage_from: Array<TypeSummary>;
  /**
   * A list of types that are not very effective against this type.
   */
  half_damage_from: Array<TypeSummary>;
  /**
   * A list of types that are very effective against this type.
   */
  double_damage_from: Array<TypeSummary>;
}

