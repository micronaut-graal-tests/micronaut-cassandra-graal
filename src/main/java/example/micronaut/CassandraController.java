package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/cassandra")
public class CassandraController {
    private final CassandraRepository cassandraRepository;

    public CassandraController(CassandraRepository cassandraRepository) {
        this.cassandraRepository = cassandraRepository;
    }

    @Get("/info")
    public CassandraInfo getCassandraInfo() {
        return cassandraRepository
                .getInfo()
                .orElse(null);
    }
}
