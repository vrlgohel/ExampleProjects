package org.resteasy.simple.deployment;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.util.List;

@Provider
@Produces( MediaType.APPLICATION_JSON )
public class JacksonProducer implements ContextResolver<ObjectMapper> {

    public JacksonProducer() throws Exception {
        this.json
                = new ObjectMapper()
                .findAndRegisterModules()
                .configure( SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false )
                .configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
    }

    @Override
    public ObjectMapper getContext( Class<?> objectType ) {
        System.out.println("Specific producer");
        List<Module> modules = json.findModules();
        for (Module m : modules) {
            System.out.println("Module: " + m.getModuleName());
        }
        return json;
    }

    private final ObjectMapper json;
}