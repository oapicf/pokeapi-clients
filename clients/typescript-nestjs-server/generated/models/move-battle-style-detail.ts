import { MoveBattleStyleName } from './move-battle-style-name';


export interface MoveBattleStyleDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<MoveBattleStyleName>;
}

