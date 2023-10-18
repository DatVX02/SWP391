GO
CREATE DATABASE ShoesStylize;

GO
USE ShoesStylize;

CREATE TABLE Users (
    UserID VARCHAR(50) PRIMARY KEY,
    Email VARCHAR(255) UNIQUE NOT NULL,
    Password VARCHAR(255) NOT NULL,
	FullName VARCHAR(50),
	PhoneNumber varchar(50),
	Birthdate date,
	RoleID varchar(50),
	Gender binary not null,
	Image varchar(50)	
);

CREATE TABLE Brand (
    BrandID VARCHAR(50) PRIMARY KEY,
    BrandName VARCHAR(100),
);

CREATE TABLE Shoes (
    ShoeID VARCHAR(50) PRIMARY KEY,
    BrandID VARCHAR(50),
    ShoesName VARCHAR(100),
	Description text,
    Size VARCHAR(10),
    Color VARCHAR(50),
	Image varchar(50),
	Quantity INT,
	Price DECIMAL(10, 2)
	FOREIGN KEY (BrandID) REFERENCES Brand(BrandID)
);

CREATE TABLE Feedback (
    FeedbackID VARCHAR(50) PRIMARY KEY,
	FeedbackType varchar(50),
    UserID VARCHAR(50),
	ShoeID VARCHAR(50),
	Title varchar(100),
	Rating INT,
    Content TEXT,
    Timestamp TIMESTAMP,
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
	FOREIGN KEY (ShoeID) REFERENCES Shoes(ShoeID)
);

CREATE TABLE BlogPosts (
    PostID VARCHAR(50) PRIMARY KEY,
    UserID VARCHAR(50),
	ShoeID VARCHAR(50),
	Title varchar(100),
	Rating INT,
    Content TEXT,
    Timestamp TIMESTAMP,
    Category VARCHAR(100),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);

CREATE TABLE CustomizeShoes (
    CusShoeID VARCHAR(50) PRIMARY KEY,
	ShoeID VARCHAR(50),
	UserID VARCHAR(50),
	ShoesName VARCHAR(100),
	CustomizationDetails TEXT,
	Image varchar(50),
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
	FOREIGN KEY (ShoeID) REFERENCES Shoes(ShoeID)
);

CREATE TABLE Orders (
    OrderID VARCHAR(50) PRIMARY KEY,
    UserID VARCHAR(50),
    OrderDate DATE,
    TotalAmount DECIMAL(10, 2),
	Status BINARY,
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);

CREATE TABLE OrderDetails (
    OrderDetailID VARCHAR(50) PRIMARY KEY,
    OrderID VARCHAR(50),
    ShoeID VARCHAR(50),
	CusShoeID VARCHAR(50),
	Status BINARY,
    Quantity INT,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ShoeID) REFERENCES Shoes(ShoeID),
	FOREIGN KEY (CusShoeID) REFERENCES CustomizeShoes(CusShoeID)
);

CREATE TABLE Comment (
    CommentID VARCHAR(50) PRIMARY KEY,
    UserID VARCHAR(50),
	ShoeID VARCHAR(50),
    Content TEXT,
    Timestamp TIMESTAMP,
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
	FOREIGN KEY (ShoeID) REFERENCES Shoes(ShoeID)
);