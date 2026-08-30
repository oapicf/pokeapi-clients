import { LanguageSummary } from './language-summary';
import { VersionSummary } from './version-summary';


export interface PokemonSpeciesFlavorText { 
  flavor_text: string;
  language: LanguageSummary;
  version: VersionSummary;
}

