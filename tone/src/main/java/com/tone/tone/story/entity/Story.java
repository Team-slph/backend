package com.tone.tone.story.entity;

import com.tone.tone.playlist.entity.Comment;
import com.tone.tone.playlist.entity.Music;
import com.tone.tone.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "story")
@Getter @Setter
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "music_id")
    private Music music;

    @Column(nullable = false)
    private String content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "visibility", nullable = false)
    private Visibility visibility;

    public enum Visibility {
        ALL, FRIEND, PRIVATE
    }

    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL)
    private List<StoryEmoji> storyEmojis;
}