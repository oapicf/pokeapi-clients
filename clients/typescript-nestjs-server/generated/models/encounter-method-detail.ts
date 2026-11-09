import { EncounterMethodName } from './encounter-method-name';


export interface EncounterMethodDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A good value for sorting.
   */
  order?: number | null;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<EncounterMethodName>;
}

