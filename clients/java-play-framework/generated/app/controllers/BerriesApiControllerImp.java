package controllers;

import apimodels.BerryDetail;
import apimodels.BerryFirmnessDetail;
import apimodels.BerryFlavorDetail;
import apimodels.PaginatedBerryFirmnessSummaryList;
import apimodels.PaginatedBerryFlavorSummaryList;
import apimodels.PaginatedBerrySummaryList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerriesApiControllerImp extends BerriesApiControllerImpInterface {
    @Override
    public PaginatedBerryFirmnessSummaryList berryFirmnessList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedBerryFirmnessSummaryList();
    }

    @Override
    public BerryFirmnessDetail berryFirmnessRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new BerryFirmnessDetail();
    }

    @Override
    public PaginatedBerryFlavorSummaryList berryFlavorList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedBerryFlavorSummaryList();
    }

    @Override
    public BerryFlavorDetail berryFlavorRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new BerryFlavorDetail();
    }

    @Override
    public PaginatedBerrySummaryList berryList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedBerrySummaryList();
    }

    @Override
    public BerryDetail berryRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new BerryDetail();
    }

}
