### table schema

CREATE TABLE TodoList (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    due_date DATE,
    completed BOOLEAN DEFAULT false
);

INSERT INTO TodoList (title, description, due_date, completed) VALUES
('Complete project proposal', 'Write and finalize project proposal document', '2024-03-10', false),
('Prepare for meeting', 'Review meeting agenda and prepare presentation slides', '2024-03-15', false),
('Submit report', 'Submit monthly progress report to supervisor', '2024-03-20', true),
('Update website content', 'Add new blog post and update product information', '2024-03-25', false),
('Review code changes', 'Review and approve code changes for upcoming release', '2024-03-30', true);
