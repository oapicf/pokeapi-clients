package controllers;

import apimodels.MachineDetail;
import apimodels.PaginatedMachineSummaryList;

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
public class MachinesApiControllerImp extends MachinesApiControllerImpInterface {
    @Override
    public PaginatedMachineSummaryList machineList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMachineSummaryList();
    }

    @Override
    public MachineDetail machineRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MachineDetail();
    }

}
