package org.openapitools.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api/v2/encounter-condition-value")
@Api(value = "/", description = "")
public interface EncounterConditionValueApi  {

    @GET
    
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "encounter-condition-value" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String encounterConditionValueList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset);

    @GET
    @Path("/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "encounter-condition-value" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String encounterConditionValueRead(@PathParam("id") Integer id);
}
