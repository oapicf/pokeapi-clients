import { MoveTargetDescription } from './move-target-description';
import { MoveSummary } from './move-summary';
import { MoveTargetName } from './move-target-name';


export interface MoveTargetDetail { 
  readonly id: number;
  name: string;
  readonly descriptions: Array<MoveTargetDescription>;
  readonly moves: Array<MoveSummary>;
  readonly names: Array<MoveTargetName>;
}

