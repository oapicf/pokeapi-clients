package controllers;

import apimodels.GenerationDetail;
import apimodels.PaginatedGenerationSummaryList;
import apimodels.PaginatedPokedexSummaryList;
import apimodels.PaginatedVersionGroupSummaryList;
import apimodels.PaginatedVersionSummaryList;
import apimodels.PokedexDetail;
import apimodels.VersionDetail;
import apimodels.VersionGroupDetail;

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
public class GamesApiControllerImp extends GamesApiControllerImpInterface {
    @Override
    public PaginatedGenerationSummaryList generationList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedGenerationSummaryList();
    }

    @Override
    public GenerationDetail generationRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new GenerationDetail();
    }

    @Override
    public PaginatedPokedexSummaryList pokedexList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokedexSummaryList();
    }

    @Override
    public PokedexDetail pokedexRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokedexDetail();
    }

    @Override
    public PaginatedVersionGroupSummaryList versionGroupList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedVersionGroupSummaryList();
    }

    @Override
    public VersionGroupDetail versionGroupRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new VersionGroupDetail();
    }

    @Override
    public PaginatedVersionSummaryList versionList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedVersionSummaryList();
    }

    @Override
    public VersionDetail versionRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new VersionDetail();
    }

}
