import { StatSummary } from './stat-summary';
import { CharacteristicDescription } from './characteristic-description';


export interface CharacteristicDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The remainder of the highest stat/IV divided by 5.
   */
  gene_modulo: number;
  /**
   * The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
   */
  readonly possible_values: Array<number>;
  /**
   * The stat which results in this characteristic.
   */
  highest_stat: StatSummary;
  /**
   * The descriptions of this characteristic listed in different languages.
   */
  readonly descriptions: Array<CharacteristicDescription>;
}

