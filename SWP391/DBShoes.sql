USE [master]
GO

/****** Object:  Database [ShoesStylize]    Script Date: 10/22/2023 11:44:02 PM ******/
DROP DATABASE [ShoesStylize]
GO
Create database [ShoesStylize]
go
USE [ShoesStylize]
GO
/****** Object:  Table [dbo].[BlogPosts]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BlogPosts](
	[PostID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int]  NULL,
	[Title] [nvarchar] (30) NULL,
	[Content] [text] NULL,
	[PostDay] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[PostID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Brand]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Brand](
	[BrandID] [int] IDENTITY(1,1) NOT NULL,
	[BrandName] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[BrandID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SizeList](
	[SizeID] [int] IDENTITY(1,1) NOT NULL,
	[ShoeID] [int] NULL,
	[Size] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[SizeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]



GO
/****** Object:  Table [dbo].[Comment]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Comment](
	[CommentID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NULL,
	[ShoeID] [int] NULL,
	[Content] [text] NULL,
PRIMARY KEY CLUSTERED 
(
	[CommentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CustomizeShoes]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CustomizeShoes](
	[CusShoeID] [int] IDENTITY(1,1) NOT NULL,
	[OrderID] [int] NULL,
	[ShoeID] [int] NULL,
	[UserID] [int] NULL,
	[ServiceID] [int] NULL,
	[ShoesName] [nvarchar](20) NULL,
	[ImageLink1] [nvarchar](max) NULL,
	[ImageLink2] [nvarchar](max) NULL,
	[ImageLink3] [nvarchar](max) NULL,
	[ImageLink4] [nvarchar](max) NULL,
	[ImageLink5] [nvarchar](max) NULL,
	[ImageLink6] [nvarchar](max) NULL,
	[OutLeft] [bit] NULL,
	[OutRight] [bit] NULL,
	[InLeft] [bit] NULL,
	[InRight] [bit] NULL,
	[Back] [bit] NULL,
	[Overlook] [bit] NULL,
	[Gender] [varchar](10) NULL,
	[Size] [nvarchar](10) NULL,
	[totalamount] [int] NULL,
PRIMARY KEY CLUSTERED
(
	[CusShoeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] 

GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Service](
	[ServiceID] [int] IDENTITY(1,1) NOT NULL,
	[OutLeftCost] [int] NULL,
	[OutRightCost] [int] NULL,
	[InLeftCost] [int] NULL,
	[InRightCost] [int] NULL,
	[BackCost] [int] NULL,
	[OverlookCost] [int] NULL,
PRIMARY KEY CLUSTERED
(
	[ServiceID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] 

GO
/****** Object:  Table [dbo].[Feedback]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Feedback](
	[FeedbackID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NULL,
	[ShoeID] [int] NULL,
	[Category] [varchar](20) NULL,
	[Title] [varchar](100) NULL,
	[Rating] [int] NULL,
	[Content] [text] NULL,
PRIMARY KEY CLUSTERED 
(
	[FeedbackID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

/****** Object:  Table [dbo].[Orders]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NULL,
	[OrderDate] [date] NULL,
	[OrderTime] [date] NULL,
	[TotalAmount] [int] NULL,
	[Status] [nvarchar](20) NULL,
	[Quantity] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Shoes]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Shoes](
	[ShoeID] [int] IDENTITY(1,1) NOT NULL,
	[BrandID] [int] NULL,
	[ShoesName] [nvarchar](20) NULL,
	[Category] [varchar](20) NULL,
	[Description] [text] NULL,
	[Image] [nvarchar](max) NULL,
	[Quantity] [int] NULL,
	[Price] [int] NULL

PRIMARY KEY CLUSTERED 
(
	[ShoeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Users]    Script Date: 10/22/2023 11:39:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[UserID] [int] IDENTITY(1,1) NOT NULL,
	[Email] [nvarchar](30) NOT NULL,
	[Password] [nvarchar](30) NOT NULL,
	[FullName] [nvarchar](20) NULL,
	[PhoneNumber] [nvarchar](20) NOT NULL,
	[Birthdate] [date] NULL,
	[RoleID] [varchar](50) NULL,
	[Gender] [nvarchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [UQ__Users__A9D10534DCD602DB]    Script Date: 10/22/2023 11:39:51 PM ******/
ALTER TABLE [dbo].[Users] ADD UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[BlogPosts]  WITH CHECK ADD FOREIGN KEY([UserID])
REFERENCES [dbo].[Users] ([UserID])
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD FOREIGN KEY([ShoeID])
REFERENCES [dbo].[Shoes] ([ShoeID])
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD FOREIGN KEY([UserID])
REFERENCES [dbo].[Users] ([UserID])
GO
ALTER TABLE [dbo].[CustomizeShoes]  WITH CHECK ADD FOREIGN KEY([ShoeID])
REFERENCES [dbo].[Shoes] ([ShoeID])
GO
ALTER TABLE [dbo].[CustomizeShoes]  WITH CHECK ADD FOREIGN KEY([UserID])
REFERENCES [dbo].[Users] ([UserID])
GO
ALTER TABLE [dbo].[Feedback]  WITH CHECK ADD FOREIGN KEY([ShoeID])
REFERENCES [dbo].[Shoes] ([ShoeID])
GO
ALTER TABLE [dbo].[Feedback]  WITH CHECK ADD FOREIGN KEY([UserID])
REFERENCES [dbo].[Users] ([UserID])
GO
ALTER TABLE [dbo].[CustomizeShoes]  WITH CHECK ADD FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders] ([OrderID])
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD FOREIGN KEY([UserID])
REFERENCES [dbo].[Users] ([UserID])
GO
ALTER TABLE [dbo].[Shoes]  WITH CHECK ADD FOREIGN KEY([BrandID])
REFERENCES [dbo].[Brand] ([BrandID])
GO
ALTER TABLE [dbo].[SizeList]  WITH CHECK ADD FOREIGN KEY([ShoeID])
REFERENCES [dbo].[Shoes] ([ShoeID])
GO
ALTER TABLE [dbo].[CustomizeShoes]  WITH CHECK ADD FOREIGN KEY([ServiceID])
REFERENCES [dbo].[Service] ([ServiceID])
GO

INSERT INTO [dbo].[Brand]
           ([BrandName])
     VALUES
           ('Nike'), ('Adidas'),('Air Force'),('Nizza'),('Circut')
GO

INSERT INTO [dbo].[Shoes]
           ([BrandID]
           ,[ShoesName]
           ,[Category]
           ,[Description]
           ,[Image]
           ,[Quantity]
           ,[Price])
     VALUES
           (3,'Air Force 1 Shoes','Party','From the hardwood to the streets to the World Wide Web. These classic sneakers get an Internet-inspired refresh with holographic accents. Jewel-like hardware and a special JDI dubrae add the finishing touch.','https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/e777c881-5b62-4250-92a6-362967f54cca/air-force-1-07-shoe-NMmm1B.png',21,3000000),
		   (4, 'GIÀY PLATFORM NIZZA', 'Party', 'What do skinny jeans and flared skirts have in common? Both pair excellently with a pair of trendy platform shoes like these adidas Nizza shoes. Wear your shoes out and elevate every outfit. Even if you are just walking around.', 'https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/e05ab433db5a48b4abe7abeb000f0a90_9366/Giay_Platform_Nizza_trang_FV5322_01_standard.jpg', 31, 14000000),
		   (5, 'GIÀY PLATFORM NIZZA', 'Party', 'What do skinny jeans and flared skirts have in common? Both pair excellently with a pair of trendy platform shoes like these adidas Nizza shoes. Wear your shoes out and elevate every outfit. Even if you are just walking around.', 'https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/e05ab433db5a48b4abe7abeb000f0a90_9366/Giay_Platform_Nizza_trang_FV5322_01_standard.jpg', 31, 14000000)
GO
INSERT INTO [dbo].[SizeList]
           ([ShoeID]
		   ,[Size])
     VALUES
           (1,'36'),(1,'37'),(1,'38'),(1,'39'),(1,'40'),(1,'41'),(1,'42'),(1,'43')
GO
INSERT INTO [dbo].[Users]
           ([Email]
           ,[Password]
           ,[FullName]
           ,[PhoneNumber]
           ,[Birthdate]
           ,[RoleID]
           ,[Gender])
     VALUES
           ('ha@gmail.com'
           ,'dava3577'
           ,'Vu Duc Anh'
           ,'0123456789'
           ,'2003-1-1'
           ,'ADMIN'
           ,'Male'),

		   ('he@gmail.com'
           ,'dava3577'
           ,'Vu Duc Anh'
           ,'0123456789'
           ,'2003-1-1'
           ,'PROVIDER'
           ,'Male'),

		   ('ok@gmail.com'
           ,'dava3577'
           ,'Vu Duc Anh'
           ,'0123456789'
           ,'2003-1-1'
           ,'CUSTOMER'
           ,'Male')
GO