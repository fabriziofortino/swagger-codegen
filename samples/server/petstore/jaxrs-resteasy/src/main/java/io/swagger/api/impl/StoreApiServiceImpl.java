package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.Map;
import io.swagger.model.Order;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-02-04T01:58:20.368+07:00")

public class StoreApiServiceImpl extends StoreApiService {

    @Override
    public Response getInventory(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    /*
     *      * comment out as the method (for testing) does not exit in the original swagger spec
     *           * we'll uncomment this code block later if we update the petstore server
    @Override
    public Response getInventoryInObject(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    */

    @Override
    public Response placeOrder(Order body,SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response getOrderById(Long orderId,SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response deleteOrder(String orderId,SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    /*
     *      * comment out as the method (for testing) does not exit in the original swagger spec
     *           * we'll uncomment this code block later if we update the petstore server
    @Override
    public Response findOrdersByStatus(String status, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    */

}

