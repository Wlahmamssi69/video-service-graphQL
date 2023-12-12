package com.example.videoservice;

import com.example.videoservice.model.Creator;
import com.example.videoservice.model.Video;
import com.example.videoservice.repository.CreatorRepo;
import com.example.videoservice.repository.VideoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class VideoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CreatorRepo creatorRepo, VideoRepo videoRepo){
        return args ->{
            List<Creator>creators=List.of(
                    creatorRepo.save(Creator.builder().name("creator1").email("email1").build()),
                    creatorRepo.save(Creator.builder().name("creator2").email("email3").build()),
                    creatorRepo.save(Creator.builder().name("creator3").email("email3").build())
                    );
           creatorRepo.saveAll(creators);

            List<Video>videos=List.of(
                    Video.builder().name("video1").description("desc1").url("url1").datePublication(new Date()).creator(creators.get(1)).build(),
                    Video.builder().name("video2").description("desc2").url("url2").datePublication(new Date()).creator(creators.get(1)).build(),
                    Video.builder().name("video3").description("desc3").url("url3").datePublication(new Date()).creator(creators.get(2)).build(),
                    Video.builder().name("video4").description("desc4").url("url4").datePublication(new Date()).creator(creators.get(2)).build(),
                    Video.builder().name("video5").description("desc5").url("url5").datePublication(new Date()).creator(creators.get(0)).build()

            );

            videoRepo.saveAll(videos);
        };
    }
}
