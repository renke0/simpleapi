package org.renke.openapidemo.configuration;

import static org.renke.simpleapi.annotations.OpenApi3.OpenApi3Version.VERSION_3_0_1;

import org.renke.simpleapi.annotations.Contact;
import org.renke.simpleapi.annotations.Info;
import org.renke.simpleapi.annotations.License;
import org.renke.simpleapi.autoconfigure.EnableOpenApi3;
import org.renke.simpleapi.configuration.OpenApi3AnnotationBasedConfigurer;

@EnableOpenApi3(
    openapi = VERSION_3_0_1,
    info = @Info(
        title = "Swagger Petstore",
        version = "1.0.0",
        description = "A sample API that uses a petstore as an example to demonstrate features in "
            + "the OpenAPI 3.0 specification",
        termsOfService = "http://swagger.io/terms/",
        contact = @Contact(
            name = "Swagger API Team",
            email = "apiteam@swagger.io",
            url = "http://swagger.io"),
        license = @License(
            name = "Apache 2.0",
            url = "https://www.apache.org/licenses/LICENSE-2.0.html")))
public class OpenApiConfiguration implements OpenApi3AnnotationBasedConfigurer {
}
