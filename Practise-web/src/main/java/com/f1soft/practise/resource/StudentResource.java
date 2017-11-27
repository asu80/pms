package com.f1soft.practise.resource;

import com.f1soft.practise.constant.PathConstant;
import com.f1soft.practise.service.StudentService;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import javax.ws.rs.core.Response;

/**
 *
 * @author asmita.shrestha
 */
@Path(PathConstant.STUDENT)
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class StudentResource {

    
    @Inject
    private StudentService studentService;
    
    @GET
    @Path(PathConstant.STUDENT_INFO)
    public Response getAllStudents() {
        
        return null;
    }
}
