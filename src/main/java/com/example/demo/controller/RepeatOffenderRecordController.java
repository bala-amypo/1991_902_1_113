package com.example.demo.controller;
import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.service.RepeatOffenderRecordService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/repeat-offenders")
public class RepeatOffenderRecordController {

    private final RepeatOffenderRecordService service;

    public RepeatOffenderRecordController(RepeatOffenderRecordService service) {
        this.service = service;
    }

    @PostMapping("/refresh/{studentId}")
    public void refresh(@PathVariable Long studentId) {
        service.refreshRepeatOffenderData(studentId);
    }

    @GetMapping("/student/{studentId}")
    public RepeatOffenderRecord byStudent(@PathVariable Long studentId) {
        return service.getRecordByStudent(studentId);
    }

    @GetMapping
    public List<RepeatOffenderRecord> all() {
        return service.getAllRepeatOffenders();
    }
}
