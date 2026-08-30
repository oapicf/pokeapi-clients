import { PokemonSpeciesDetailPalParkEncountersInner } from './pokemon-species-detail-pal-park-encounters-inner';
import { PokemonSpeciesDetailVarietiesInner } from './pokemon-species-detail-varieties-inner';
import { GenerationSummary } from './generation-summary';
import { PokemonFormDetailFormNamesInner } from './pokemon-form-detail-form-names-inner';
import { PokemonSpeciesDetailGeneraInner } from './pokemon-species-detail-genera-inner';
import { PokemonSpeciesDescription } from './pokemon-species-description';
import { PokemonDexEntry } from './pokemon-dex-entry';
import { PokemonSpeciesFlavorText } from './pokemon-species-flavor-text';
import { PokemonColorSummary } from './pokemon-color-summary';
import { PokemonShapeSummary } from './pokemon-shape-summary';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { GrowthRateSummary } from './growth-rate-summary';
import { PokemonHabitatSummary } from './pokemon-habitat-summary';
import { EvolutionChainSummary } from './evolution-chain-summary';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonSpeciesDetail { 
  readonly id: number;
  name: string;
  order?: number | null;
  gender_rate?: number | null;
  capture_rate?: number | null;
  base_happiness?: number | null;
  is_baby?: boolean;
  is_legendary?: boolean;
  is_mythical?: boolean;
  hatch_counter?: number | null;
  has_gender_differences?: boolean;
  forms_switchable?: boolean;
  growth_rate: GrowthRateSummary;
  readonly pokedex_numbers: Array<PokemonDexEntry>;
  readonly egg_groups: Array<AbilityDetailPokemonInnerPokemon>;
  color: PokemonColorSummary;
  shape: PokemonShapeSummary;
  evolves_from_species: PokemonSpeciesSummary;
  evolution_chain: EvolutionChainSummary;
  habitat: PokemonHabitatSummary;
  generation: GenerationSummary;
  readonly names: Array<PokemonFormDetailFormNamesInner>;
  readonly pal_park_encounters: Array<PokemonSpeciesDetailPalParkEncountersInner>;
  readonly form_descriptions: Array<PokemonSpeciesDescription>;
  readonly flavor_text_entries: Array<PokemonSpeciesFlavorText>;
  readonly genera: Array<PokemonSpeciesDetailGeneraInner>;
  readonly varieties: Array<PokemonSpeciesDetailVarietiesInner>;
}

