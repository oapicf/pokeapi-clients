import { GenerationSummary } from './generation-summary';


export interface TypeGameIndex { 
  /**
   * The internal id of an API resource within game data.
   */
  game_index: number;
  /**
   * The generation relevent to this game index.
   */
  generation: GenerationSummary;
}

