package org.chess.demo.dao;

import org.chess.demo.model.*;

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
                        pieces.add(new Rook(name,x ,y , isblack, iscaptured);
                        break;
                    case "c":
                        pieces.add(new Knight(name,x ,y , isblack, iscaptured);
                        break;
                    case "F":
                        pieces.add(new Bishop(name,x ,y , isblack, iscaptured);
                        break;
                    case "D":
                        pieces.add(new Queen(name,x ,y , isblack, iscaptured);
                        break;
                    case "R":
                        pieces.add(new King(name,x ,y , isblack, iscaptured);
                        break;
                    default:
                        throw new RuntimeException("Nom de pièce non supporté" + name);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Erreur avec la base de données");
        }
        return pieces;
    }
}
