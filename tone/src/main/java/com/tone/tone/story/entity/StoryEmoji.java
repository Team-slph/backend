package com.tone.tone.story.entity;

import com.tone.tone.user.entity.Emoji;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "story_emoji")
@Getter @Setter
public class StoryEmoji {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emoji_id", nullable = false)
    private Emoji emoji;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "story_id", nullable = false)
    private Story story;
}