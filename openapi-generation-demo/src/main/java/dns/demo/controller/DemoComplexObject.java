package dns.demo.controller;

import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public record DemoComplexObject(
        @NotNull
        @PositiveOrZero
        @Schema(example = "1111111.1234", description = "A BigDecimal", extensions = {
                @Extension(properties = {
                        @ExtensionProperty(name = "x-field-extra-annotation", value = "@jakarta.validation.constraints.PositiveOrZero")
                })
        })
        BigDecimal bigDecimal,

        @NotNull
        @Schema(description = "A BigInteger", format = "biginteger")
        BigInteger bigInteger,

        @NotBlank @Size(min = 1, max = 255)
        @Schema(description = "A String", pattern = "[a-z]+")
        String string,

        @Schema(description = "A long", minimum = "0", maximum = "100")
        long longInteger,

        @Min(0) @Max(100)
        @Schema(description = "An int")
        int integer,

        @Min(-10) @Max(10)
        @Schema(description = "A short")
        short aShort,

        @Schema(description = "A byte")
        byte aByte,

        @Schema(description = "A uuid")
        UUID uuid,

        @NotNull
        @Schema(example = "2022-02-15T18:35:24.00Z", description = "An Instant") Instant instant,

        @NotNull @Size(min = 1, max = 10)
        @Schema(description = "A List<InnerObject>")
        List<InnerObject> list,

        @NotNull @Size(min = 1, max = 10)
        @Schema(description = "A Set<InnerObject>")
        Set<InnerObject> set,

        @NotNull @Size(min = 1, max = 10)
        @Schema(description = "A Map<String, InnerObject>")
        Map<String, InnerObject> map

) {

}
