package org.openapitools.api.impl;

import org.openapitools.api.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class GenderApiServiceImpl implements GenderApi {
    @Override
    public String genderList(Integer limit, Integer offset) {
        // TODO: Implement...
        return null;
    }

    @Override
    public String genderRead(Integer id) {
        // TODO: Implement...
        return null;
    }

}
