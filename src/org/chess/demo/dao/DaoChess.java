package org.chess.demo.dao;

import org.chess.demo.model.Pawn;
import org.chess.demo.model.Piece;
import org.chess.demo.model.Rook;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DaoChess {
    public List<Piece> fetch(){
        List<Piece> pieces = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mariadb//localhost/chess", "root", "root")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name, x, y, is_black, is_captured FROM piece OrDER BY y, x");
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int x = resultSet.getInt("x");
                int y = resultSet.getInt("y");
                boolean isblack = resultSet.getBoolean("is_black");
                boolean iscaptured = resultSet.getBoolean("is_captured");
                switch (name){
                    case "p":
                        pieces.add(new Pawn(name,x ,y , isblack, iscaptured);
                        break;
                    case "T":
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
