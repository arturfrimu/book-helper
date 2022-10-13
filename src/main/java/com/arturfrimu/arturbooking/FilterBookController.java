package com.arturfrimu.arturbooking;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/filter")
public class FilterBookController {
    @GetMapping("/extension")
    public Set<String> filterByExtension(@RequestBody Set<String> extension) {
        File folder = new File("D:\\Artur\\books\\Business\\files");
        File[] listOfFiles = folder.listFiles();
        return Arrays.stream(listOfFiles).map(File::getName).collect(Collectors.toSet());
    }
}