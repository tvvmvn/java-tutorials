# SQL


# CREATE TABLE

```sql
CREATE TABLE department (
  deptId int AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  phoneNumber varchar(20) NOT NULL,
  address varchar(20) NOT NULL,
  PRIMARY KEY(deptId),
)
```

```sql
CREATE TABLE student (
  studentId int AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  grade int CHECK (grade BETWEEN 1 AND 4) DEFAULT 1 NOT NULL,
  hobby varchar(20),
  deptId int NOT NULL,
  PRIMARY KEY(studentId),
  FOREIGN KEY(deptId) REFERENCES department(deptId)
)
```

# INSERT

```sql
INSERT INTO department (name, phoneNumber, address) VALUES ('', '', '');
INSERT INTO department (name, phoneNumber, address) VALUES ('', '', '');
INSERT INTO department (name, phoneNumber, address) VALUES ('', '', '');
```

```sql
INSERT INTO student (name, grade, hobby, deptId) VALUES ('김모군', 1, '', 3);
INSERT INTO student (name, grade, hobby, deptId) VALUES ('이모군', 1, '', 3);
INSERT INTO student (name, grade, hobby, deptId) VALUES ('박모군', 1, '', 2);
INSERT INTO student (name, grade, hobby, deptId) VALUES ('최모군', 2, '', 2);
INSERT INTO student (name, grade, hobby, deptId) VALUES ('정모군', 2, '', 1);
```


# SELECT

```sql

```