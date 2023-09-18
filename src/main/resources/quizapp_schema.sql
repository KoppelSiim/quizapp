CREATE TABLE IF NOT EXISTS topic
(
    topic_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS response
(
    response_id INT AUTO_INCREMENT PRIMARY KEY,
    text VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS question
(
    question_id INT AUTO_INCREMENT PRIMARY KEY,
    difficulty_rank INT NOT NULL,
    content VARCHAR(255) NOT NULL,
    topic_id INT NOT NULL,
    response_id INT NOT NULL,
    FOREIGN KEY (topic_id) REFERENCES topic(topic_id),
    FOREIGN KEY (response_id) REFERENCES response(response_id)
);

CREATE TABLE IF NOT EXISTS question_response (
    question_id INT NOT NULL,
    response_id INT NOT NULL,
    PRIMARY KEY (question_id, response_id),
    FOREIGN KEY (question_id) REFERENCES question(question_id),
    FOREIGN KEY (response_id) REFERENCES response(response_id)
);

CREATE TABLE IF NOT EXISTS quiz
(
    quiz_id INT AUTO_INCREMENT PRIMARY KEY,
    question_id INT NOT NULL,
    FOREIGN KEY(question_id) REFERENCES question(question_id)
);
