import { LanguageName } from './language-name';


export interface LanguageDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * Whether or not the games are published in this language.
   */
  official?: boolean;
  /**
   * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
   */
  iso639: string;
  /**
   * The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
   */
  iso3166: string;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<LanguageName>;
}

