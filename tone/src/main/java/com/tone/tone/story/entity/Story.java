package com.tone.tone.story.entity;

import com.tone.tone.playlist.entity.Comment;
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

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "music_id", nullable = false)
    private Long musicId;

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