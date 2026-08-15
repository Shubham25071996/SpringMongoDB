package com.mongo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "jobpost")
public class Job {
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
