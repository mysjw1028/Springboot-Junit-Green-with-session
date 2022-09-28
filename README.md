# JUNIT 학습 - 배포를 위해서!

### 1. 테이블 생성
```sql
create table product(
    product_id int primary KEY auto_increment,
    product_name varchar(20) NOT null,
    product_price INT NOT null,
    created_at TIMESTAMP NOT null
);

create table customer(
    customer_id int primary KEY auto_increment,
    username varchar(20) NOT null,
    password VARCHAR(20) NOT null,
    created_at TIMESTAMP
);

create table orders(
    order_id int primary KEY auto_increment,
    customer_id INT NOT null,
    product_id INT NOT null,
    created_at TIMESTAMP
);

```

### 2.더미데이터