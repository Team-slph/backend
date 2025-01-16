package com.tone.tone.playlist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ply")
@Getter @Setter
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String img;

    @Column(name = "theme_id", nullable = false)
    private Long themeId;

    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL)
    private List<PlaylistUser> playlistUsers;

    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL)
    private List<PlaylistMusic> playlistMusics;

    @OneToMany(mappedBy = "playlist")
    private List<Like> likes;

    @OneToMany(mappedBy = "playlist")
    private List<Bookmark> bookmarks;
}