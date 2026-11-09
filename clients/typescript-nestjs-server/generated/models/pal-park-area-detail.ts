import { PalParkEncounter } from './pal-park-encounter';
import { PalParkAreaName } from './pal-park-area-name';


export interface PalParkAreaDetail { 
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
  readonly names: Array<PalParkAreaName>;
  /**
   * A list of Pokémon encountered in thi pal park area along with details.
   */
  readonly pokemon_encounters: Array<PalParkEncounter>;
}

