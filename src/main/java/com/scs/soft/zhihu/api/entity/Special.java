package com.scs.soft.zhihu.api.entity;
import lombok.Builder;
import lombok.Data;
import java.util.Date;
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date update;
    public String getSpecialId() {
    return specialId;
}
public void setSpecialId(String specialId) {
    this.specialId = specialId;
}public String getTitle() {
    return title;
}public void setTitle(String title) {
    this.title = title;
}public String getIntroduction() {
    return introduction;
}public void setIntroduction(String introduction) {
    this.introduction = introduction;
}public String getBanner() {
    return banner;
}public void setBanner(String banner) {
    this.banner = banner;
}public Integer getViewCount() {
    return viewCount;
}public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
}public Integer getFollowersCount() {
    return followersCount;
}public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
}
}
