import { MoveSummary } from './move-summary';
import { MoveMetaAilmentName } from './move-meta-ailment-name';


export interface MoveMetaAilmentDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of moves that cause this ailment.
   */
  readonly moves: Array<MoveSummary>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<MoveMetaAilmentName>;
}

