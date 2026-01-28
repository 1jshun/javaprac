package com.be24.api.Board.model;

import jakarta.servlet.http.HttpServletRequest;

public class BoardDto {
    private Integer boardIdx;
    private String title;
    private String contents;

    public BoardDto() {
    }
    public BoardDto(Integer boardIdx, String contents, String title) {
        this.boardIdx = boardIdx;
        this.contents = contents;
        this.title = title;
    }

    // (public 전체 호출), (static 객체), (반환 타입 BoardDto), (HttpServletRequest 클라이언트가 보낸 요청 전체를 req에 담음)
    public static BoardDto toDto(HttpServletRequest req) {
        BoardDto dto = new BoardDto(
                null, // 게시글 idx는 auto라서 null값으로
                req.getParameter("title"), // 요청 파라미터에서 name이 title인 값을 가져옴
                req.getParameter("contents") // 요청 파라미터에서 name이 contents인 값을 가져옴
        );

        return dto;
    }

    public Integer getBoardIdx() {
        return boardIdx;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setBoardIdx(Integer boardIdx) {
        this.boardIdx = boardIdx;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
