import { AbilityPokemonDetail } from './ability-pokemon-detail';
import { AbilityName } from './ability-name';
import { GenerationSummary } from './generation-summary';
import { AbilityChange } from './ability-change';
import { AbilityEffectText } from './ability-effect-text';
import { AbilityFlavorText } from './ability-flavor-text';


export interface AbilityDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * Whether or not this ability originated in the main series of the video games.
   */
  is_main_series?: boolean;
  /**
   * The generation this ability originated in.
   */
  generation: GenerationSummary;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<AbilityName>;
  /**
   * The effect of this ability listed in different languages.
   */
  readonly effect_entries: Array<AbilityEffectText>;
  /**
   * The list of previous effects this ability has had across version groups.
   */
  readonly effect_changes: Array<AbilityChange>;
  /**
   * The flavor text of this ability listed in different languages.
   */
  readonly flavor_text_entries: Array<AbilityFlavorText>;
  /**
   * A list of Pokémon that could potentially have this ability.
   */
  readonly pokemon: Array<AbilityPokemonDetail>;
}

