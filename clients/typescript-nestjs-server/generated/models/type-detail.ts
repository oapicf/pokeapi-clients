import { TypeDetailDamageRelations } from './type-detail-damage-relations';
import { TypeGameIndex } from './type-game-index';
import { TypeDetailSpritesValueValue } from './type-detail-sprites-value-value';
import { MoveDamageClassSummary } from './move-damage-class-summary';
import { MoveSummary } from './move-summary';
import { AbilityName } from './ability-name';
import { GenerationSummary } from './generation-summary';
import { TypeDetailPastDamageRelationsInner } from './type-detail-past-damage-relations-inner';
import { TypeDetailPokemonInner } from './type-detail-pokemon-inner';


/**
 * Serializer for the Type resource
 */
export interface TypeDetail { 
  readonly id: number;
  name: string;
  damage_relations: TypeDetailDamageRelations;
  readonly past_damage_relations: Array<TypeDetailPastDamageRelationsInner>;
  readonly game_indices: Array<TypeGameIndex>;
  generation: GenerationSummary;
  move_damage_class: MoveDamageClassSummary;
  readonly names: Array<AbilityName>;
  readonly pokemon: Array<TypeDetailPokemonInner>;
  readonly moves: Array<MoveSummary>;
  readonly sprites: { [key: string]: { [key: string]: TypeDetailSpritesValueValue; }; };
}

