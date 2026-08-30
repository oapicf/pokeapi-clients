import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { GenerationDetail, PaginatedGenerationSummaryList, PaginatedPokedexSummaryList, PaginatedVersionGroupSummaryList, PaginatedVersionSummaryList, PokedexDetail, VersionDetail, VersionGroupDetail,  } from '../models';


@Injectable()
export abstract class GamesApi {

  abstract generationList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedGenerationSummaryList | Promise<PaginatedGenerationSummaryList> | Observable<PaginatedGenerationSummaryList>;


  abstract generationRetrieve(id: string,  request: Request): GenerationDetail | Promise<GenerationDetail> | Observable<GenerationDetail>;


  abstract pokedexList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPokedexSummaryList | Promise<PaginatedPokedexSummaryList> | Observable<PaginatedPokedexSummaryList>;


  abstract pokedexRetrieve(id: string,  request: Request): PokedexDetail | Promise<PokedexDetail> | Observable<PokedexDetail>;


  abstract versionGroupList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedVersionGroupSummaryList | Promise<PaginatedVersionGroupSummaryList> | Observable<PaginatedVersionGroupSummaryList>;


  abstract versionGroupRetrieve(id: string,  request: Request): VersionGroupDetail | Promise<VersionGroupDetail> | Observable<VersionGroupDetail>;


  abstract versionList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedVersionSummaryList | Promise<PaginatedVersionSummaryList> | Observable<PaginatedVersionSummaryList>;


  abstract versionRetrieve(id: string,  request: Request): VersionDetail | Promise<VersionDetail> | Observable<VersionDetail>;

} 