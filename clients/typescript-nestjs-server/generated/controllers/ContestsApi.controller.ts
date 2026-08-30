import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ContestsApi } from '../api';
import { ContestEffectDetail, ContestTypeDetail, PaginatedContestEffectSummaryList, PaginatedContestTypeSummaryList, PaginatedSuperContestEffectSummaryList, SuperContestEffectDetail,  } from '../models';

@Controller()
export class ContestsApiController {
  constructor(private readonly contestsApi: ContestsApi) {}

  @Get('/api/v2/contest-effect/')
  contestEffectList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedContestEffectSummaryList | Promise<PaginatedContestEffectSummaryList> | Observable<PaginatedContestEffectSummaryList> {
    return this.contestsApi.contestEffectList(limit, offset, q, request);
  }

  @Get('/api/v2/contest-effect/:id/')
  contestEffectRetrieve(@Param('id') id: string, @Req() request: Request): ContestEffectDetail | Promise<ContestEffectDetail> | Observable<ContestEffectDetail> {
    return this.contestsApi.contestEffectRetrieve(id, request);
  }

  @Get('/api/v2/contest-type/')
  contestTypeList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedContestTypeSummaryList | Promise<PaginatedContestTypeSummaryList> | Observable<PaginatedContestTypeSummaryList> {
    return this.contestsApi.contestTypeList(limit, offset, q, request);
  }

  @Get('/api/v2/contest-type/:id/')
  contestTypeRetrieve(@Param('id') id: string, @Req() request: Request): ContestTypeDetail | Promise<ContestTypeDetail> | Observable<ContestTypeDetail> {
    return this.contestsApi.contestTypeRetrieve(id, request);
  }

  @Get('/api/v2/super-contest-effect/')
  superContestEffectList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedSuperContestEffectSummaryList | Promise<PaginatedSuperContestEffectSummaryList> | Observable<PaginatedSuperContestEffectSummaryList> {
    return this.contestsApi.superContestEffectList(limit, offset, q, request);
  }

  @Get('/api/v2/super-contest-effect/:id/')
  superContestEffectRetrieve(@Param('id') id: string, @Req() request: Request): SuperContestEffectDetail | Promise<SuperContestEffectDetail> | Observable<SuperContestEffectDetail> {
    return this.contestsApi.superContestEffectRetrieve(id, request);
  }

} 