import { TypeDetailPastDamageRelationsInnerDamageRelations } from './type-detail-past-damage-relations-inner-damage-relations';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface TypeDetailPastDamageRelationsInner { 
  generation: AbilityDetailPokemonInnerPokemon;
  damage_relations: TypeDetailPastDamageRelationsInnerDamageRelations;
}

