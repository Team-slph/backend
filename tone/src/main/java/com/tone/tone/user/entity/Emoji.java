package com.tone.tone.user.entity;

import com.tone.tone.chat.entity.ChatEmoji;
import com.tone.tone.playlist.entity.CommentEmoji;
import com.tone.tone.story.entity.StoryEmoji;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "emoji")
@Getter @Setter
public class Emoji {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @OneToMany(mappedBy = "emoji")
    private List<ChatEmoji> chatEmojis;

    @OneToMany(mappedBy = "emoji")
    private List<CommentEmoji> commentEmojis;

    @OneToMany(mappedBy = "emoji")
    private List<StoryEmoji> storyEmojis;
}