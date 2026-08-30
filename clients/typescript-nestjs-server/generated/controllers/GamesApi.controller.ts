import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { GamesApi } from '../api';
import { GenerationDetail, PaginatedGenerationSummaryList, PaginatedPokedexSummaryList, PaginatedVersionGroupSummaryList, PaginatedVersionSummaryList, PokedexDetail, VersionDetail, VersionGroupDetail,  } from '../models';

@Controller()
export class GamesApiController {
  constructor(private readonly gamesApi: GamesApi) {}

  @Get('/api/v2/generation/')
  generationList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedGenerationSummaryList | Promise<PaginatedGenerationSummaryList> | Observable<PaginatedGenerationSummaryList> {
    return this.gamesApi.generationList(limit, offset, q, request);
  }

  @Get('/api/v2/generation/:id/')
  generationRetrieve(@Param('id') id: string, @Req() request: Request): GenerationDetail | Promise<GenerationDetail> | Observable<GenerationDetail> {
    return this.gamesApi.generationRetrieve(id, request);
  }

  @Get('/api/v2/pokedex/')
  pokedexList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPokedexSummaryList | Promise<PaginatedPokedexSummaryList> | Observable<PaginatedPokedexSummaryList> {
    return this.gamesApi.pokedexList(limit, offset, q, request);
  }

  @Get('/api/v2/pokedex/:id/')
  pokedexRetrieve(@Param('id') id: string, @Req() request: Request): PokedexDetail | Promise<PokedexDetail> | Observable<PokedexDetail> {
    return this.gamesApi.pokedexRetrieve(id, request);
  }

  @Get('/api/v2/version-group/')
  versionGroupList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedVersionGroupSummaryList | Promise<PaginatedVersionGroupSummaryList> | Observable<PaginatedVersionGroupSummaryList> {
    return this.gamesApi.versionGroupList(limit, offset, q, request);
  }

  @Get('/api/v2/version-group/:id/')
  versionGroupRetrieve(@Param('id') id: string, @Req() request: Request): VersionGroupDetail | Promise<VersionGroupDetail> | Observable<VersionGroupDetail> {
    return this.gamesApi.versionGroupRetrieve(id, request);
  }

  @Get('/api/v2/version/')
  versionList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedVersionSummaryList | Promise<PaginatedVersionSummaryList> | Observable<PaginatedVersionSummaryList> {
    return this.gamesApi.versionList(limit, offset, q, request);
  }

  @Get('/api/v2/version/:id/')
  versionRetrieve(@Param('id') id: string, @Req() request: Request): VersionDetail | Promise<VersionDetail> | Observable<VersionDetail> {
    return this.gamesApi.versionRetrieve(id, request);
  }

} 