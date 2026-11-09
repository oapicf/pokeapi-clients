import { BerryFirmnessName } from './berry-firmness-name';
import { BerrySummary } from './berry-summary';


export interface BerryFirmnessDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of the berries with this firmness.
   */
  readonly berries: Array<BerrySummary>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<BerryFirmnessName>;
}

