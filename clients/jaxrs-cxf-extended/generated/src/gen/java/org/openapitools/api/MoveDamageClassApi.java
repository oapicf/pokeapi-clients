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

@Path("/api/v2/move-damage-class")
@Api(value = "/", description = "")
public interface MoveDamageClassApi  {

    @GET
    
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "move-damage-class" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String moveDamageClassList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset);

    @GET
    @Path("/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "move-damage-class" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String moveDamageClassRead(@PathParam("id") Integer id);
}
