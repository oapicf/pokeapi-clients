import { MoveSummary } from './move-summary';
import { MoveMetaCategoryDescription } from './move-meta-category-description';


export interface MoveMetaCategoryDetail { 
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
  readonly descriptions: Array<MoveMetaCategoryDescription>;
  /**
   * A list of moves that fall into this category.
   */
  readonly moves: Array<MoveSummary>;
}

