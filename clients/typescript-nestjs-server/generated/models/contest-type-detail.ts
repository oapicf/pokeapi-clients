import { BerryFlavorSummary } from './berry-flavor-summary';
import { ContestTypeName } from './contest-type-name';


export interface ContestTypeDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The berry flavor that correlates with this contest type.
   */
  readonly berry_flavor: BerryFlavorSummary;
  /**
   * The name of this contest type listed in different languages.
   */
  readonly names: Array<ContestTypeName>;
}

