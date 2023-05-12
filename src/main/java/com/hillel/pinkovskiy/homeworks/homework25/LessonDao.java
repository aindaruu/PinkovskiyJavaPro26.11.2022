package com.hillel.pinkovskiy.homeworks.homework25;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {
    private DataBaseConnection connectionProvider;

    public LessonDao(DataBaseConnection connectionProvider) {
        this.connectionProvider = connectionProvider;
    }
    public void addLesson(Lesson lesson) throws SQLException {
        String query = "INSERT INTO Lesson (name, homework_id) VALUES (?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connectionProvider.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, lesson.getName());
            statement.setLong(2, lesson.getHomework().getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteLesson(Long id) throws SQLException {
        String query = "DELETE FROM Lesson WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connectionProvider.getConnection();
            statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Lesson> getAllLessons() throws SQLException {
        String query = "SELECT l.id, l.name, h.id, h.name, h.description " +
                "FROM Lesson l INNER JOIN Homework h ON l.homework_id = h.id";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionProvider.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            List<Lesson> lessons = new ArrayList<>();
            while (resultSet.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(resultSet.getLong(1));
                lesson.setName(resultSet.getString(2));
                Homework homework = new Homework();
                homework.setId(resultSet.getLong(3));
                homework.setName(resultSet.getString(4));
                homework.setDescription(resultSet.getString(5));
                lesson.setHomework(homework);
                lessons.add(lesson);
            }
            return lessons;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
