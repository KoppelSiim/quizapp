package quizapp.dao;
import quizapp.model.Question;
import quizapp.model.Topic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DaoQuestion {
    private final Connection connection;
    public DaoQuestion(Connection connection) {
        this.connection = connection;
    }


}
