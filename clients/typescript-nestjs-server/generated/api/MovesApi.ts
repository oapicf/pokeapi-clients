import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { MoveBattleStyleDetail, MoveDetail, MoveLearnMethodDetail, MoveMetaAilmentDetail, MoveMetaCategoryDetail, MoveTargetDetail, PaginatedMoveBattleStyleSummaryList, PaginatedMoveLearnMethodSummaryList, PaginatedMoveMetaAilmentSummaryList, PaginatedMoveMetaCategorySummaryList, PaginatedMoveSummaryList, PaginatedMoveTargetSummaryList,  } from '../models';


@Injectable()
export abstract class MovesApi {

  abstract moveAilmentList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMoveMetaAilmentSummaryList | Promise<PaginatedMoveMetaAilmentSummaryList> | Observable<PaginatedMoveMetaAilmentSummaryList>;


  abstract moveAilmentRetrieve(id: string,  request: Request): MoveMetaAilmentDetail | Promise<MoveMetaAilmentDetail> | Observable<MoveMetaAilmentDetail>;


  abstract moveBattleStyleList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMoveBattleStyleSummaryList | Promise<PaginatedMoveBattleStyleSummaryList> | Observable<PaginatedMoveBattleStyleSummaryList>;


  abstract moveBattleStyleRetrieve(id: string,  request: Request): MoveBattleStyleDetail | Promise<MoveBattleStyleDetail> | Observable<MoveBattleStyleDetail>;


  abstract moveCategoryList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMoveMetaCategorySummaryList | Promise<PaginatedMoveMetaCategorySummaryList> | Observable<PaginatedMoveMetaCategorySummaryList>;


  abstract moveCategoryRetrieve(id: string,  request: Request): MoveMetaCategoryDetail | Promise<MoveMetaCategoryDetail> | Observable<MoveMetaCategoryDetail>;


  abstract moveLearnMethodList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMoveLearnMethodSummaryList | Promise<PaginatedMoveLearnMethodSummaryList> | Observable<PaginatedMoveLearnMethodSummaryList>;


  abstract moveLearnMethodRetrieve(id: string,  request: Request): MoveLearnMethodDetail | Promise<MoveLearnMethodDetail> | Observable<MoveLearnMethodDetail>;


  abstract moveList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMoveSummaryList | Promise<PaginatedMoveSummaryList> | Observable<PaginatedMoveSummaryList>;


  abstract moveRetrieve(id: string,  request: Request): MoveDetail | Promise<MoveDetail> | Observable<MoveDetail>;


  abstract moveTargetList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMoveTargetSummaryList | Promise<PaginatedMoveTargetSummaryList> | Observable<PaginatedMoveTargetSummaryList>;


  abstract moveTargetRetrieve(id: string,  request: Request): MoveTargetDetail | Promise<MoveTargetDetail> | Observable<MoveTargetDetail>;

} 