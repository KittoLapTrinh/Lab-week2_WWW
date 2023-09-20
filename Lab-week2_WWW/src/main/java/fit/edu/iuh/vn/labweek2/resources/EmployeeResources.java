package fit.edu.iuh.vn.labweek2.resources;

import fit.edu.iuh.vn.labweek2.models.Employee;
import fit.edu.iuh.vn.labweek2.services.EmployeeServices;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;


@Path("/employees")
public class EmployeeResources {
    private final EmployeeServices employeeServices;
    private Logger LoggerFactory;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());




    @GET
    @Produces("application/json")
    @Path("/{id}")
    public Response getEmp(@PathParam("id") long eid) {
        Optional<Employee> empOpt = employeeServices.findById(eid);
        if (empOpt.isPresent()) {
            return Response.ok(empOpt.get()).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }

    @GET
    @Produces("application/json")
    public Response getAll() {
        List<Employee> lst = employeeServices.getAll();
        return Response.ok(lst).build();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Employee employee) {
        employeeServices.insertEmp(employee);
        return Response.ok(employee).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") long id) {
        if (employeeServices.delete(id))
            return Response.ok().build();
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    public EmployeeResources() {
        employeeServices = new EmployeeServices();
    }
}
