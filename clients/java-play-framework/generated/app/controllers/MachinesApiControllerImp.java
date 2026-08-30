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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T01:56:05.058856094Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
