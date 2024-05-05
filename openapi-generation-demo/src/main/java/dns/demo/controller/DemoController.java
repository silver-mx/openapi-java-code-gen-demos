package dns.demo.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/demo-api")
public class DemoController {

    @PostMapping("new-complex")
    public DemoResponse createComplexObject(@RequestBody @Valid DemoComplexObject complexObject) {
        return new DemoResponse();
    }

    @PostMapping("validation/{value}")
    public DemoResponse validatePathVariable(@PathVariable @PositiveOrZero int value) {
        return new DemoResponse();
    }
}
