import { MoveBattleStyleName } from './move-battle-style-name';


export interface MoveBattleStyleDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<MoveBattleStyleName>;
}

