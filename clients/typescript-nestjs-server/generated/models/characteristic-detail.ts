import { StatSummary } from './stat-summary';
import { CharacteristicDescription } from './characteristic-description';


export interface CharacteristicDetail { 
  readonly id: number;
  gene_modulo: number;
  readonly possible_values: Array<number>;
  highest_stat: StatSummary;
  readonly descriptions: Array<CharacteristicDescription>;
}

