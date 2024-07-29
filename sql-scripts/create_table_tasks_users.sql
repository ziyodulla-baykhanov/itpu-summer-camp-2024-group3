CREATE TABLE tasks_users
(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    content VARCHAR(1024),
    status INTEGER DEFAULT 0,
    priority INTEGER DEFAULT 0,
    created_datetime TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    due_datetime TIMESTAMP WITHOUT TIME ZONE,
    deleted_datetime TIMESTAMP WITHOUT TIME ZONE,
    is_deleted BOOLEAN DEFAULT FALSE,
    user_id INTEGER CONSTRAINT fk_user_tasks REFERENCES users
);

INSERT INTO tasks_users (title, content, status, priority, due_datetime, user_id)
VALUES
('To write an article', 'Write an article for the scientific and practical conference "Is there life on Mars"', 0, 1, '2024-06-30 23:59', 1),
('To write a book', 'Write a book about the history of the development of the Internet', 1, 2, '2025-11-30 10:00', 2),
('To write an essay', 'Write an essay on the topic "The role of the Internet in the modern world"', 2, 0, '2024-09-10 11:00', 3),
('To write a report', 'Write a report on the current state of the Internet', 1, 3, '2024-05-15 12:00', 4),
('To write a review', 'Write a review of the book "The History of the Internet"', 0, 1, '2024-07-20 13:00', 5);