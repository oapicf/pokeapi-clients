import { LanguageName } from './language-name';


export interface LanguageDetail { 
  readonly id: number;
  name: string;
  official?: boolean;
  iso639: string;
  iso3166: string;
  readonly names: Array<LanguageName>;
}

