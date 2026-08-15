package com.mongo.demo.controller;

import com.mongo.demo.model.Job;
import com.mongo.demo.repository.JobJD;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@AllArgsConstructor
public class JobPost {

    private final JobJD jobJD;

    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/allPosts")
    public List<Job> getAllPosts() {
        return jobJD.findAll();
    }

    @PostMapping("/post")
    public ResponseEntity<Job> addPost(@RequestBody Job job) {
        return ResponseEntity.status(HttpStatus.CREATED).body(jobJD.save(job));
    }
}
