import { BerryFlavorBerryMap } from './berry-flavor-berry-map';
import { BerryFlavorName } from './berry-flavor-name';
import { ContestTypeSummary } from './contest-type-summary';


export interface BerryFlavorDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of the berries with this flavor.
   */
  readonly berries: Array<BerryFlavorBerryMap>;
  /**
   * The contest type that correlates with this berry flavor.
   */
  contest_type: ContestTypeSummary;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<BerryFlavorName>;
}

