# CREATE TABLE

```sql
CREATE TABLE product (
  product_id int AUTO_INCREMENT,
  product_name varchar(100) NOT NULL,
  price int unsigned NOT NULL,
  category varchar(100) NOT NULL,
  sales int unsigned NOT NULL DEFAULT 0,
  PRIMARY KEY(product_id)
)
```

# INSERT

```sql
INSERT INTO product (product_name, price, category, sales) VALUES ('아메리카노', 2000, '커피', 10);
INSERT INTO product (product_name, price, category, sales) VALUES ('카페라떼', 3000, '커피', 5);
INSERT INTO product (product_name, price, category, sales) VALUES ('바닐라라떼', 3500, '커피', 3);
INSERT INTO product (product_name, price, category, sales) VALUES ('마카롱', 2000, '디저트', 2);
INSERT INTO product (product_name, price, category, sales) VALUES ('치즈케이크', 4000, '디저트', 1);
```
