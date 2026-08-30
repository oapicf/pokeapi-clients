import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { MovesApi } from '../api';
import { MoveBattleStyleDetail, MoveDetail, MoveLearnMethodDetail, MoveMetaAilmentDetail, MoveMetaCategoryDetail, MoveTargetDetail, PaginatedMoveBattleStyleSummaryList, PaginatedMoveLearnMethodSummaryList, PaginatedMoveMetaAilmentSummaryList, PaginatedMoveMetaCategorySummaryList, PaginatedMoveSummaryList, PaginatedMoveTargetSummaryList,  } from '../models';

@Controller()
export class MovesApiController {
  constructor(private readonly movesApi: MovesApi) {}

  @Get('/api/v2/move-ailment/')
  moveAilmentList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMoveMetaAilmentSummaryList | Promise<PaginatedMoveMetaAilmentSummaryList> | Observable<PaginatedMoveMetaAilmentSummaryList> {
    return this.movesApi.moveAilmentList(limit, offset, q, request);
  }

  @Get('/api/v2/move-ailment/:id/')
  moveAilmentRetrieve(@Param('id') id: string, @Req() request: Request): MoveMetaAilmentDetail | Promise<MoveMetaAilmentDetail> | Observable<MoveMetaAilmentDetail> {
    return this.movesApi.moveAilmentRetrieve(id, request);
  }

  @Get('/api/v2/move-battle-style/')
  moveBattleStyleList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMoveBattleStyleSummaryList | Promise<PaginatedMoveBattleStyleSummaryList> | Observable<PaginatedMoveBattleStyleSummaryList> {
    return this.movesApi.moveBattleStyleList(limit, offset, q, request);
  }

  @Get('/api/v2/move-battle-style/:id/')
  moveBattleStyleRetrieve(@Param('id') id: string, @Req() request: Request): MoveBattleStyleDetail | Promise<MoveBattleStyleDetail> | Observable<MoveBattleStyleDetail> {
    return this.movesApi.moveBattleStyleRetrieve(id, request);
  }

  @Get('/api/v2/move-category/')
  moveCategoryList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMoveMetaCategorySummaryList | Promise<PaginatedMoveMetaCategorySummaryList> | Observable<PaginatedMoveMetaCategorySummaryList> {
    return this.movesApi.moveCategoryList(limit, offset, q, request);
  }

  @Get('/api/v2/move-category/:id/')
  moveCategoryRetrieve(@Param('id') id: string, @Req() request: Request): MoveMetaCategoryDetail | Promise<MoveMetaCategoryDetail> | Observable<MoveMetaCategoryDetail> {
    return this.movesApi.moveCategoryRetrieve(id, request);
  }

  @Get('/api/v2/move-learn-method/')
  moveLearnMethodList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMoveLearnMethodSummaryList | Promise<PaginatedMoveLearnMethodSummaryList> | Observable<PaginatedMoveLearnMethodSummaryList> {
    return this.movesApi.moveLearnMethodList(limit, offset, q, request);
  }

  @Get('/api/v2/move-learn-method/:id/')
  moveLearnMethodRetrieve(@Param('id') id: string, @Req() request: Request): MoveLearnMethodDetail | Promise<MoveLearnMethodDetail> | Observable<MoveLearnMethodDetail> {
    return this.movesApi.moveLearnMethodRetrieve(id, request);
  }

  @Get('/api/v2/move/')
  moveList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMoveSummaryList | Promise<PaginatedMoveSummaryList> | Observable<PaginatedMoveSummaryList> {
    return this.movesApi.moveList(limit, offset, q, request);
  }

  @Get('/api/v2/move/:id/')
  moveRetrieve(@Param('id') id: string, @Req() request: Request): MoveDetail | Promise<MoveDetail> | Observable<MoveDetail> {
    return this.movesApi.moveRetrieve(id, request);
  }

  @Get('/api/v2/move-target/')
  moveTargetList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMoveTargetSummaryList | Promise<PaginatedMoveTargetSummaryList> | Observable<PaginatedMoveTargetSummaryList> {
    return this.movesApi.moveTargetList(limit, offset, q, request);
  }

  @Get('/api/v2/move-target/:id/')
  moveTargetRetrieve(@Param('id') id: string, @Req() request: Request): MoveTargetDetail | Promise<MoveTargetDetail> | Observable<MoveTargetDetail> {
    return this.movesApi.moveTargetRetrieve(id, request);
  }

} 