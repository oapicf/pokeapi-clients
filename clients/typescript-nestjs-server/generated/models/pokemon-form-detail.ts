import { PokemonFormFlavorText } from './pokemon-form-flavor-text';
import { VersionGroupSummary } from './version-group-summary';
import { PokemonFormSprites } from './pokemon-form-sprites';
import { PokemonFormTriggerCondition } from './pokemon-form-trigger-condition';
import { PokemonSummary } from './pokemon-summary';
import { PokemonFormName } from './pokemon-form-name';
import { PokemonFormType } from './pokemon-form-type';


export interface PokemonFormDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   */
  order?: number | null;
  /**
   * The order in which forms should be sorted within a species\' forms.
   */
  form_order?: number | null;
  /**
   * True for exactly one form used as the default for each Pokémon.
   */
  is_default?: boolean;
  /**
   * Whether or not this form can only happen during battle.
   */
  is_battle_only?: boolean;
  /**
   * Whether or not this form requires mega evolution.
   */
  is_mega?: boolean;
  /**
   * The name of this form.
   */
  form_name: string;
  /**
   * The Pokémon that can take on this form.
   */
  pokemon: PokemonSummary;
  /**
   * A set of sprites used to depict this Pokémon form in the game.
   */
  readonly sprites: PokemonFormSprites;
  /**
   * The version group this Pokémon form was introduced in.
   */
  version_group: VersionGroupSummary;
  /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   */
  readonly form_names: Array<PokemonFormName>;
  /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   */
  readonly names: Array<PokemonFormName>;
  /**
   * A list of details showing types this Pokémon form has.
   */
  readonly types: Array<PokemonFormType>;
  /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   */
  readonly trigger_conditions: Array<PokemonFormTriggerCondition>;
  /**
   * The flavor text of this form listed in different languages and versions.
   */
  readonly flavor_text_entries: Array<PokemonFormFlavorText>;
}

