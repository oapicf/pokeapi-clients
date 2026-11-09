import { PokemonMove } from './pokemon-move';
import { PokemonStat } from './pokemon-stat';
import { PokemonAbility } from './pokemon-ability';
import { PokemonHeldItemSummary } from './pokemon-held-item-summary';
import { PokemonType } from './pokemon-type';
import { PokemonPastType } from './pokemon-past-type';
import { PokemonPastStat } from './pokemon-past-stat';
import { PokemonGameIndex } from './pokemon-game-index';
import { PokemonPastAbility } from './pokemon-past-ability';
import { PokemonCries } from './pokemon-cries';
import { PokemonFormSummary } from './pokemon-form-summary';
import { PokemonSprites } from './pokemon-sprites';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The base experience gained for defeating this Pokémon.
   */
  base_experience?: number | null;
  /**
   * The height of this Pokémon in decimetres.
   */
  height?: number | null;
  /**
   * Set for exactly one Pokémon used as the default for each species.
   */
  is_default?: boolean;
  /**
   * Order for sorting. Almost national order, except families are grouped together.
   */
  order?: number | null;
  /**
   * The weight of this Pokémon in hectograms.
   */
  weight?: number | null;
  /**
   * A list of abilities this Pokémon could potentially have.
   */
  readonly abilities: Array<PokemonAbility>;
  /**
   * A list of details showing abilities this pokémon had in previous generations
   */
  readonly past_abilities: Array<PokemonPastAbility>;
  /**
   * A list of forms this Pokémon can take on.
   */
  readonly forms: Array<PokemonFormSummary>;
  /**
   * A list of game indices relevent to Pokémon item by generation.
   */
  readonly game_indices: Array<PokemonGameIndex>;
  /**
   * A list of items this Pokémon may be holding when encountered.
   */
  readonly held_items: Array<PokemonHeldItemSummary>;
  /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   */
  readonly location_area_encounters: string;
  /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   */
  readonly moves: Array<PokemonMove>;
  /**
   * The species this Pokémon belongs to.
   */
  species: PokemonSpeciesSummary;
  /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href=\'https://github.com/PokeAPI/sprites#sprites\'>PokeAPI/sprites</a>
   */
  readonly sprites: PokemonSprites;
  /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href=\'https://github.com/PokeAPI/cries#cries\'>PokeAPI/cries</a>
   */
  readonly cries: PokemonCries;
  /**
   * A list of base stat values for this Pokémon.
   */
  readonly stats: Array<PokemonStat>;
  /**
   * A list of details showing stats this pokémon had in previous generations
   */
  readonly past_stats: Array<PokemonPastStat>;
  /**
   * A list of details showing types this Pokémon has.
   */
  readonly types: Array<PokemonType>;
  /**
   * A list of details showing types this pokémon had in previous generations
   */
  readonly past_types: Array<PokemonPastType>;
}

