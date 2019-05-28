package com.Bamboo.vo;

public class SongVo {
	private Long songId;
	private String singer;
	private String title;
	private String genre;
	
	public SongVo() {
		super();
	}

	public Long getSongId() {
		return songId;
	}

	public void setSongId(Long songId) {
		this.songId = songId;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "SongVo [songId=" + songId + ", singer=" + singer + ", title=" + title + ", genre=" + genre + "]";
	}

	
}

