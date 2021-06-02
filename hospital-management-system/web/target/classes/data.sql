DROP TABLE IF EXISTS doctor;

CREATE TABLE doctor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  specailist VARCHAR(250) NOT NULL
);

INSERT INTO doctor (name, specailist) VALUES
  ('Aliko', 'Billionaire Industrialist'),
  ('Bill', 'Billionaire Tech Entrepreneur');
