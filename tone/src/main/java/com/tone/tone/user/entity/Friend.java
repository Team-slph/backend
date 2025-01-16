package com.tone.tone.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "friend")
@Getter @Setter
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FriendStatus status = FriendStatus.PENDING;

    public enum FriendStatus {
        PENDING, ACCEPTED, BLOCKED
    }

    @ManyToOne
    @JoinColumn(name = "following", nullable = false)
    private User following;

    @ManyToOne
    @JoinColumn(name = "follower", nullable = false)
    private User follower;
}