create table category(
                         id int primary key auto_increment,
                         title varchar(255) not null unique,
                         short_description text,
                         long_description text,
                         hex_color varchar(7)
);

create table image(
    id int primary key auto_increment,
    base64encoding mediumtext,
    mimetype varchar(50),
    category_id int,
    foreign key (category_id) references category(id)
);

create table dataset(
    id int primary key auto_increment,
    name varchar(255) not null unique ,
    description text,
    category_id int,
    foreign key (category_id) references category(id)
);

create table update_frequency(
    id int primary key auto_increment,
    value varchar(255) not null unique
);

create table provider(
    id int primary key auto_increment,
    name varchar(255) not null unique,
    url text
);

create table search_uri(
    id int primary key auto_increment,
    value varchar(500) not null
);

create table tag(
    id int primary key auto_increment,
    value varchar(255) not null unique
);

create table joinkey(
    id int primary key auto_increment,
    value varchar(255) not null unique
);

create table join_value(
    id int primary key auto_increment,
    value varchar(255) not null unique,
    joinkey_id int not null,
    foreign key (joinkey_id) references joinkey(id)
);

create table datatable(
    id int primary key auto_increment,
    display_name varchar(255) not null unique,
    row_count int,
    row_count_approx varchar(10),
    created datetime not null,
    last_updated datetime,
    show_explorer bit default 0,
    show_gallery bit default 0,
    name varchar(255) not null,
    description text,
    catalog_order int,
    provider_id int,
    search_uri_id int,
    dataset_id int,
    update_frequency_id int,
    foreign key (provider_id) references provider(id),
    foreign key (search_uri_id) references search_uri(id),
    foreign key (dataset_id) references dataset(id),
    foreign key (update_frequency_id) references update_frequency(id)
);

create table datatable_datatable(
    datatable_id int,
    related_datatable_id int,
    unique (datatable_id, related_datatable_id)
);

create table tag_datatable(
    tag_id int,
    datatable_id int,
    foreign key (tag_id) references tag(id),
    foreign key (datatable_id) references datatable(id),
    unique (tag_id, datatable_id)
);

create table joinvalue_datatable(
    join_value_id int,
    datatable_id int,
    foreign key (join_value_id) references join_value(id),
    foreign key (datatable_id) references datatable(id),
    unique (join_value_id, datatable_id)
);



