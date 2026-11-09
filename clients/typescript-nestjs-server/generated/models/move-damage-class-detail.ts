import { MoveDamageClassDescription } from './move-damage-class-description';
import { MoveSummary } from './move-summary';
import { MoveDamageClassName } from './move-damage-class-name';


export interface MoveDamageClassDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The description of this resource listed in different languages.
   */
  readonly descriptions: Array<MoveDamageClassDescription>;
  /**
   * A list of moves that fall into this damage class.
   */
  readonly moves: Array<MoveSummary>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<MoveDamageClassName>;
}

