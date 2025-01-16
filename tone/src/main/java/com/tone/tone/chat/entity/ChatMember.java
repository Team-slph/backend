package com.tone.tone.chat.entity;

import com.tone.tone.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "chat_member")
@Getter @Setter
public class ChatMember {

    // User 엔티티와의 다대일 관계 설정
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Chat 엔티티와의 다대일 관계 설정
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_id", insertable = false, updatable = false)
    private ChatRoom chat;
}