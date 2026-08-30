import { MoveDamageClassDescription } from './move-damage-class-description';
import { MoveSummary } from './move-summary';
import { MoveDamageClassName } from './move-damage-class-name';


export interface MoveDamageClassDetail { 
  readonly id: number;
  name: string;
  readonly descriptions: Array<MoveDamageClassDescription>;
  readonly moves: Array<MoveSummary>;
  readonly names: Array<MoveDamageClassName>;
}

