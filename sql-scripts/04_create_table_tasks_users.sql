-- Table: public.tasks_users

-- DROP TABLE IF EXISTS public.tasks_users;

CREATE TABLE IF NOT EXISTS "tasks_users"
(
    "id" SERIAL PRIMARY KEY,
    "title" VARCHAR(255),
    "content" VARCHAR(1024),
    "status" INTEGER DEFAULT 0,
    "priority" INTEGER DEFAULT 0,
    "created_datetime" TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    "due_datetime" TIMESTAMP WITHOUT TIME ZONE,
    "deleted_datetime" TIMESTAMP WITHOUT TIME ZONE,
    "is_deleted" BOOLEAN DEFAULT FALSE,
    "user_id" INTEGER CONSTRAINT "fk_user_tasks" REFERENCES "users" ("id") ON DELETE CASCADE
);

INSERT INTO "tasks_users" ("title", "content", "status", "priority", "due_datetime", "user_id")
VALUES
    ('To write an article', 'Write an article for the scientific and practical conference "Is there life on Mars"', 0, 0, '2024-06-30 23:59', 1),
    ('To write a book', 'Write a book about the history of the development of the Internet', 1, 1, '2025-11-30 10:00', 1),
    ('To write an essay', 'Write an essay on the topic "The role of the Internet in the modern world"', 2, 2, '2024-09-10 11:00', 1),
    ('To write a report', 'Write a report on the current state of the Internet', 3, 0, '2024-05-15 12:00', 2),
    ('To write a review', 'Write a review of the book "The History of the Internet"', 0, 1, '2024-07-20 13:00', 2),
    ('To write an ode', 'Write an ode to the Internet', 1, 2, '2024-07-20 13:00', 2),
    ('To write a sonnet', 'Write a sonnet about the Internet', 2, 0, '2024-07-20 13:00', 3),
    ('To write a ballad', 'Write a ballad about the Internet', 3, 1, '2024-07-20 13:00', 3),
    ('To write a limerick', 'Write a limerick about the Internet', 0, 2, '2024-07-20 13:00', 3),
    ('To write a haiku', 'Write a haiku about the Internet', 1, 0, '2024-07-20 13:00', 4),
    ('To write an epic', 'Write an epic about the Internet', 2, 1, '2024-07-20 13:00', 4),
    ('To write a novel', 'Write a novel about the Internet', 3, 2, '2024-07-20 13:00', 4);