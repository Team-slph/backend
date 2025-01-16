package com.tone.tone.playlist.entity;

import com.tone.tone.user.entity.Emoji;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "comm_emoji")
@Getter @Setter
public class CommentEmoji {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emoji_id", nullable = false)
    private Emoji emoji;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comm_id", nullable = false)
    private Comment comment;
}