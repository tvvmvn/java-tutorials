# SQL


# CREATE TABLE

```sql
CREATE TABLE department (
  dept_id int AUTO_INCREMENT,
  dept_name varchar(100) NOT NULL,
  phone_number varchar(100) NOT NULL,
  PRIMARY KEY(dept_id)
)
```

```sql
CREATE TABLE student (
  student_id int AUTO_INCREMENT,
  student_name varchar(100) NOT NULL,
  grade int CHECK (grade BETWEEN 1 AND 4) DEFAULT 1 NOT NULL,
  dept_id int NOT NULL,
  hobby varchar(100),
  PRIMARY KEY(student_id),
  FOREIGN KEY(dept_id) REFERENCES department(dept_id)
)
```

# INSERT

```sql
INSERT INTO department (dept_name, phone_number) VALUES ('수학과', '1234-5678');
INSERT INTO department (dept_name, phone_number) VALUES ('물리학과', '2345-6789');
INSERT INTO department (dept_name, phone_number) VALUES ('체육학과', '3456-7890');
```

```sql
INSERT INTO student (student_name, grade, dept_id, hobby) VALUES ('김모군', 1, 3, '축구');
INSERT INTO student (student_name, grade, dept_id, hobby) VALUES ('이모군', 1, 2, '독서');
INSERT INTO student (student_name, grade, dept_id, hobby) VALUES ('박모군', 2, 1, '영화감상');
INSERT INTO student (student_name, grade, dept_id, hobby) VALUES ('최모군', 2, 2, '게임');
INSERT INTO student (student_name, grade, dept_id, hobby) VALUES ('정모군', 3, 3, '축구');
```


# SELECT

```sql

```