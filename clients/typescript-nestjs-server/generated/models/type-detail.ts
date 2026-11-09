import { TypePokemon } from './type-pokemon';
import { TypeName } from './type-name';
import { TypeGameIndex } from './type-game-index';
import { TypePastRelationships } from './type-past-relationships';
import { MoveDamageClassSummary } from './move-damage-class-summary';
import { TypeRelationships } from './type-relationships';
import { MoveSummary } from './move-summary';
import { GenerationSummary } from './generation-summary';
import { TypeGameSprite } from './type-game-sprite';


/**
 * Serializer for the Type resource
 */
export interface TypeDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A detail of how effective this type is toward others and vice versa.
   */
  readonly damage_relations: TypeRelationships;
  /**
   * A list of details of how effective this type was toward others and vice versa in previous generations
   */
  readonly past_damage_relations: Array<TypePastRelationships>;
  /**
   * A list of game indices relevent to this item by generation.
   */
  readonly game_indices: Array<TypeGameIndex>;
  /**
   * The generation this type was introduced in.
   */
  generation: GenerationSummary;
  /**
   * The class of damage inflicted by this type.
   */
  move_damage_class: MoveDamageClassSummary | null;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<TypeName>;
  /**
   * A list of details of Pokémon that have this type.
   */
  readonly pokemon: Array<TypePokemon>;
  /**
   * A list of moves that have this type.
   */
  readonly moves: Array<MoveSummary>;
  /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   */
  readonly sprites: { [key: string]: { [key: string]: TypeGameSprite; }; };
}

