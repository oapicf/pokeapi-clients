import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { LanguageDetail, PaginatedLanguageSummaryList, PokeapiMetaResponse,  } from '../models';


@Injectable()
export abstract class UtilityApi {

  abstract languageList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedLanguageSummaryList | Promise<PaginatedLanguageSummaryList> | Observable<PaginatedLanguageSummaryList>;


  abstract languageRetrieve(id: string,  request: Request): LanguageDetail | Promise<LanguageDetail> | Observable<LanguageDetail>;


  abstract metaRetrieve( request: Request): PokeapiMetaResponse | Promise<PokeapiMetaResponse> | Observable<PokeapiMetaResponse>;

} 