package com.example.anastasiakruglova.mytestplayer.model;

import java.util.List;

public class ResponceObject {
    private Integer resultCount;
    private List<SongInfo> results;

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<SongInfo> getResults() {
        return results;
    }

    public void setResults(List<SongInfo> results) {
        this.results = results;
    }
}
