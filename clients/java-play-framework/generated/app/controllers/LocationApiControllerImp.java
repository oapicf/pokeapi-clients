package controllers;

import apimodels.LocationAreaDetail;
import apimodels.LocationDetail;
import apimodels.PaginatedLocationAreaSummaryList;
import apimodels.PaginatedLocationSummaryList;
import apimodels.PaginatedPalParkAreaSummaryList;
import apimodels.PaginatedRegionSummaryList;
import apimodels.PalParkAreaDetail;
import apimodels.RegionDetail;

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
public class LocationApiControllerImp extends LocationApiControllerImpInterface {
    @Override
    public PaginatedLocationAreaSummaryList locationAreaList(Http.Request request, Integer limit, Integer offset) throws Exception {
        //Do your magic!!!
        return new PaginatedLocationAreaSummaryList();
    }

    @Override
    public LocationAreaDetail locationAreaRetrieve(Http.Request request, Integer id) throws Exception {
        //Do your magic!!!
        return new LocationAreaDetail();
    }

    @Override
    public PaginatedLocationSummaryList locationList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedLocationSummaryList();
    }

    @Override
    public LocationDetail locationRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new LocationDetail();
    }

    @Override
    public PaginatedPalParkAreaSummaryList palParkAreaList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPalParkAreaSummaryList();
    }

    @Override
    public PalParkAreaDetail palParkAreaRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PalParkAreaDetail();
    }

    @Override
    public PaginatedRegionSummaryList regionList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedRegionSummaryList();
    }

    @Override
    public RegionDetail regionRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new RegionDetail();
    }

}
