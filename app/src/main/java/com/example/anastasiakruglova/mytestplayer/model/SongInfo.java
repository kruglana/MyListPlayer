package com.example.anastasiakruglova.mytestplayer.model;

import java.io.Serializable;

public class SongInfo implements Serializable {
    private String wrapperType; //:"track" //            "kind":"song",
    private String kind;//            "artistId":110357036,
    private Integer artistId;//            "collectionId":854168069,
    private Integer collectionId;//            "trackId":854168086,
    private Integer trackId;//            "artistName":"Naughty Boy",
    private String artistName;//            "collectionName":"Hotel Cabana (Deluxe Version)",
    private String collectionName;//            "trackName":"La La La (feat. Sam Smith)",
    private String trackName;//            "collectionCensoredName":"Hotel Cabana (Deluxe Version)",
    private String collectionCensoredName;//            "trackCensoredName":"La La La (feat. Sam Smith)",
    private String trackCensoredName;//            "artistViewUrl":"https://itunes.apple.com/us/artist/naughty-boy/110357036?uo=4",
    private String artistViewUrl;//            "collectionViewUrl":"https://itunes.apple.com/us/album/la-la-la-feat-sam-smith/854168069?i=854168086&uo=4",
    private String collectionViewUrl;//            "trackViewUrl":"https://itunes.apple.com/us/album/la-la-la-feat-sam-smith/854168069?i=854168086&uo=4",
    private String trackViewUrl;//            "previewUrl":"https://audio-ssl.itunes.apple.com/apple-assets-us-std-000001/Music4/v4/cd/13/07/cd130749-8fd1-d8a1-da00-93f9caa93f67/mzaf_5419311521014425724.plus.aac.p.m4a",
    private String previewUrl;//            "artworkUrl30":"https://is4-ssl.mzstatic.com/image/thumb/Music/v4/1a/4c/07/1a4c07c4-2e4a-0ed8-0c11-6987cc308df3/source/30x30bb.jpg",
    private String artworkUrl30;//            "artworkUrl60":"https://is4-ssl.mzstatic.com/image/thumb/Music/v4/1a/4c/07/1a4c07c4-2e4a-0ed8-0c11-6987cc308df3/source/60x60bb.jpg",
    private String artworkUrl60;//            "artworkUrl100":"https://is4-ssl.mzstatic.com/image/thumb/Music/v4/1a/4c/07/1a4c07c4-2e4a-0ed8-0c11-6987cc308df3/source/100x100bb.jpg",
    private String artworkUrl100;//            "collectionPrice":11.99,
    private Float collectionPrice;//            "trackPrice":1.29,
    private Float trackPrice;//            "releaseDate":"2013-05-18T07:00:00Z",
    private String releaseDate;//            "collectionExplicitness":"explicit",
    private String collectionExplicitness;//            "trackExplicitness":"notExplicit",
    private String trackExplicitness;

    private Integer discCount;//            "discCount":1,
    private Integer discNumber;//            "discNumber":1,
    private Integer trackCount;//            "trackCount":21,
    private Integer trackNumber;//            "trackNumber":8,
    private Integer trackTimeMillis;//            "trackTimeMillis":222200,
    private String country;//            "country":"USA",
    private String currency;//            "currency":"USD",
    private String primaryGenreName; //Pop//            "primaryGenreName":"Pop",
    private Boolean isStreamable;//            "isStreamable":true


    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }
}
