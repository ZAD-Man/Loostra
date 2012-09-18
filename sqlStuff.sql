Create Table User(
UserId int auto_increment primary key,
UserDisplayName varchar(20) unique,
Email varchar(20) unique,
birthMonth int,
birthYear int,
birthDay int,
myPassword varchar(20),
myName varchar(20)
);

Create Table Skills(
skillId int primary key,
skillName varchar(20),
skillDescription varchar(100),
user_id int not null
);

Alter Table Skills add constraint skills_user_fk 
foreign key (user_id) references User(userID)