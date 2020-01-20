package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Favorite {
    private int id;
    private String title;
    private String creator_name;
    private String creator_avatar;
    private int followers;
    private int total_count;
    private String question_title;
    private String answer_author_name;
    private String answer_content;
    private int voteup_count;
    private int comment_count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name;
    }

    public String getCreator_avatar() {
        return creator_avatar;
    }

    public void setCreator_avatar(String creator_avatar) {
        this.creator_avatar = creator_avatar;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    public String getAnswer_author_name() {
        return answer_author_name;
    }

    public void setAnswer_author_name(String answer_author_name) {
        this.answer_author_name = answer_author_name;
    }

    public String getAnswer_content() {
        return answer_content;
    }

    public void setAnswer_content(String answer_content) {
        this.answer_content = answer_content;
    }

    public int getVoteup_count() {
        return voteup_count;
    }

    public void setVoteup_count(int voteup_count) {
        this.voteup_count = voteup_count;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }
}
