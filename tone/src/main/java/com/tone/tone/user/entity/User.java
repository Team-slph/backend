package com.tone.tone.user.entity;

import com.tone.tone.chat.entity.ChatMember;
import com.tone.tone.hashtag.entity.PlaylistTag;
import com.tone.tone.hashtag.entity.UserTag;
import com.tone.tone.playlist.entity.Bookmark;
import com.tone.tone.playlist.entity.Comment;
import com.tone.tone.playlist.entity.Likes;
import com.tone.tone.playlist.entity.PlaylistUser;
import com.tone.tone.story.entity.Story;
import com.tone.tone.theme.entity.UserTheme;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(name = "profile_img", nullable = false)
    private String profileImg;

    @Column(name = "login_type", nullable = false)
    private String loginType;  // kakao, google, spotify

    @Column(nullable = false)
    private String email;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status = UserStatus.ACTIVE;

    @Column(nullable = false)
    private String role;  // ROLE_USER, ROLE_ADMIN

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "music_id", nullable = false)
    private Long musicId;

    public enum UserStatus {
        ACTIVE, DELETED
    }

    @OneToMany(mappedBy = "user")
    private List<UserTheme> userThemes;

    @OneToMany(mappedBy = "user")
    private List<PlaylistTag> plyTags;

    @OneToMany(mappedBy = "user")
    private List<UserTag> userTags;

    @OneToMany(mappedBy = "following")
    private List<Friend> followings;

    @OneToMany(mappedBy = "follower")
    private List<Friend> followers;

    @OneToMany(mappedBy = "user")
    private List<ChatMember> chatMembers;

    @OneToMany(mappedBy = "user")
    private List<Story> stories;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @OneToMany(mappedBy = "user")
    private List<PlaylistUser> playlistUsers;

    @OneToMany(mappedBy = "user")
    private List<Likes> likes;

    @OneToMany(mappedBy = "user")
    private List<Bookmark> bookmarks;
}
