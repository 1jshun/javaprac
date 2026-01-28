package com.be24.api.Board;

import com.be24.api.Board.model.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public interface BoardRepository {
    public BoardDto read(String boardIdx);
    public BoardDto create(BoardDto dto);
}