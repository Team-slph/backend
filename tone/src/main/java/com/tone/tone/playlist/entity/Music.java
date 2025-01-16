package com.tone.tone.playlist.entity;

import com.tone.tone.story.entity.Story;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "music")
@Getter @Setter
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String song;

    @Column(nullable = false)
    private String singer;

    @Column(nullable = false)
    private String img;

    @Column(name = "release_date", nullable = false)
    private LocalDateTime releaseDate;

    @OneToMany(mappedBy = "music")
    private List<Story> stories;

    @OneToMany(mappedBy = "music")
    private List<PlaylistMusic> playlistMusics;
}