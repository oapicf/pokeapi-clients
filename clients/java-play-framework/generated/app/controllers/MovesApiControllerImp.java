package controllers;

import apimodels.MoveBattleStyleDetail;
import apimodels.MoveDetail;
import apimodels.MoveLearnMethodDetail;
import apimodels.MoveMetaAilmentDetail;
import apimodels.MoveMetaCategoryDetail;
import apimodels.MoveTargetDetail;
import apimodels.PaginatedMoveBattleStyleSummaryList;
import apimodels.PaginatedMoveLearnMethodSummaryList;
import apimodels.PaginatedMoveMetaAilmentSummaryList;
import apimodels.PaginatedMoveMetaCategorySummaryList;
import apimodels.PaginatedMoveSummaryList;
import apimodels.PaginatedMoveTargetSummaryList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MovesApiControllerImp extends MovesApiControllerImpInterface {
    @Override
    public PaginatedMoveMetaAilmentSummaryList moveAilmentList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMoveMetaAilmentSummaryList();
    }

    @Override
    public MoveMetaAilmentDetail moveAilmentRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MoveMetaAilmentDetail();
    }

    @Override
    public PaginatedMoveBattleStyleSummaryList moveBattleStyleList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMoveBattleStyleSummaryList();
    }

    @Override
    public MoveBattleStyleDetail moveBattleStyleRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MoveBattleStyleDetail();
    }

    @Override
    public PaginatedMoveMetaCategorySummaryList moveCategoryList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMoveMetaCategorySummaryList();
    }

    @Override
    public MoveMetaCategoryDetail moveCategoryRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MoveMetaCategoryDetail();
    }

    @Override
    public PaginatedMoveLearnMethodSummaryList moveLearnMethodList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMoveLearnMethodSummaryList();
    }

    @Override
    public MoveLearnMethodDetail moveLearnMethodRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MoveLearnMethodDetail();
    }

    @Override
    public PaginatedMoveSummaryList moveList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMoveSummaryList();
    }

    @Override
    public MoveDetail moveRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MoveDetail();
    }

    @Override
    public PaginatedMoveTargetSummaryList moveTargetList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMoveTargetSummaryList();
    }

    @Override
    public MoveTargetDetail moveTargetRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MoveTargetDetail();
    }

}
