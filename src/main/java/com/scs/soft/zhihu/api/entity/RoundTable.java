package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoundTable {
    private int id;
    private String name;
    private String banner;
    private String tinyBanner;
    private String urlToken;
    private int visitsCount;
    private int includeCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTinyBanner() {
        return tinyBanner;
    }

    public void setTinyBanner(String tinyBanner) {
        this.tinyBanner = tinyBanner;
    }

    public String getUrlToken() {
        return urlToken;
    }

    public void setUrlToken(String urlToken) {
        this.urlToken = urlToken;
    }

    public int getVisitsCount() {
        return visitsCount;
    }

    public void setVisitsCount(int visitsCount) {
        this.visitsCount = visitsCount;
    }

    public int getIncludeCount() {
        return includeCount;
    }

    public void setIncludeCount(int includeCount) {
        this.includeCount = includeCount;
    }
}
