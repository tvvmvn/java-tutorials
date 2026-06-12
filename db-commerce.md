# SQL


# CREATE TABLE

```sql
CREATE TABLE category (
  categoryId int AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  PRIMARY KEY(categoryId),
)
```

```sql
CREATE TABLE product (
  productId int AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  price int NOT NULL,
  categoryId int NOT NULL,
  PRIMARY KEY(productId),
  FOREIGN KEY(categoryId) REFERENCES category(categoryId)
)
```

# INSERT

```sql
INSERT INTO category (name) VALUES ('');
INSERT INTO category (name) VALUES ('');
INSERT INTO category (name) VALUES ('');
```

```sql
INSERT INTO product (name, price, categoryId) VALUES ('', , );
INSERT INTO product (name, price, categoryId) VALUES ('', , );
INSERT INTO product (name, price, categoryId) VALUES ('', , );
INSERT INTO product (name, price, categoryId) VALUES ('', , );
INSERT INTO product (name, price, categoryId) VALUES ('', , );
```


# SELECT

```sql

```