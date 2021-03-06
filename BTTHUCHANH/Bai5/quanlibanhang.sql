USE [QuanLyBanHang]
GO
ALTER TABLE [dbo].[HDBan] DROP CONSTRAINT [FK_HDBan_NhanVien]
GO
ALTER TABLE [dbo].[HDBan] DROP CONSTRAINT [FK_HDBan_Khach]
GO
ALTER TABLE [dbo].[Hang] DROP CONSTRAINT [FK_Hang_ChatLieu]
GO
ALTER TABLE [dbo].[ChiTienHDBan] DROP CONSTRAINT [FK_ChiTienHDBan_HDBan]
GO
ALTER TABLE [dbo].[ChiTienHDBan] DROP CONSTRAINT [FK_ChiTienHDBan_Hang]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 5/21/2018 10:26:51 AM ******/
DROP TABLE [dbo].[NhanVien]
GO
/****** Object:  Table [dbo].[Khach]    Script Date: 5/21/2018 10:26:51 AM ******/
DROP TABLE [dbo].[Khach]
GO
/****** Object:  Table [dbo].[HDBan]    Script Date: 5/21/2018 10:26:51 AM ******/
DROP TABLE [dbo].[HDBan]
GO
/****** Object:  Table [dbo].[Hang]    Script Date: 5/21/2018 10:26:51 AM ******/
DROP TABLE [dbo].[Hang]
GO
/****** Object:  Table [dbo].[ChiTienHDBan]    Script Date: 5/21/2018 10:26:51 AM ******/
DROP TABLE [dbo].[ChiTienHDBan]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 5/21/2018 10:26:51 AM ******/
DROP TABLE [dbo].[ChatLieu]
GO
USE [master]
GO
/****** Object:  Database [QuanLyBanHang]    Script Date: 5/21/2018 10:26:51 AM ******/
DROP DATABASE [QuanLyBanHang]
GO
/****** Object:  Database [QuanLyBanHang]    Script Date: 5/21/2018 10:26:51 AM ******/
CREATE DATABASE [QuanLyBanHang]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyBanHang', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\QuanLyBanHang.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QuanLyBanHang_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\QuanLyBanHang_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QuanLyBanHang] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyBanHang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyBanHang] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyBanHang] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET  ENABLE_BROKER 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyBanHang] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanLyBanHang] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyBanHang] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyBanHang] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyBanHang] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [QuanLyBanHang] SET DELAYED_DURABILITY = DISABLED 
GO
USE [QuanLyBanHang]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 5/21/2018 10:26:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu](
	[MaChatLieu] [nvarchar](50) NOT NULL,
	[TenChatLieu] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaChatLieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTienHDBan]    Script Date: 5/21/2018 10:26:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTienHDBan](
	[MaHDBan] [nvarchar](50) NOT NULL,
	[MaHang] [nvarchar](50) NOT NULL,
	[SoLuong] [float] NOT NULL,
	[DonGia] [float] NOT NULL,
	[GiamGia] [float] NOT NULL,
	[ThanhTien] [float] NOT NULL,
 CONSTRAINT [PK_ChiTienHDBan] PRIMARY KEY CLUSTERED 
(
	[MaHDBan] ASC,
	[MaHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Hang]    Script Date: 5/21/2018 10:26:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hang](
	[MaHang] [nvarchar](50) NOT NULL,
	[TenHang] [nvarchar](50) NOT NULL,
	[MaChatLieu] [nvarchar](50) NOT NULL,
	[SoLuong] [float] NOT NULL,
	[DonGiaNhap] [float] NOT NULL,
	[DonGiaBan] [float] NOT NULL,
	[Anh] [nvarchar](200) NOT NULL,
	[GhiChu] [nvarchar](200) NULL,
 CONSTRAINT [PK_Hang] PRIMARY KEY CLUSTERED 
(
	[MaHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HDBan]    Script Date: 5/21/2018 10:26:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HDBan](
	[MaHDBan] [nvarchar](50) NOT NULL,
	[MaNhanVien] [nvarchar](10) NOT NULL,
	[NgayBan] [nchar](10) NOT NULL,
	[MaKhach] [nvarchar](10) NOT NULL,
	[TongTien] [float] NOT NULL,
 CONSTRAINT [PK_HDBan] PRIMARY KEY CLUSTERED 
(
	[MaHDBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Khach]    Script Date: 5/21/2018 10:26:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khach](
	[MaKhach] [nvarchar](10) NOT NULL,
	[TenKhach] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[DienThoai] [nvarchar](15) NOT NULL,
 CONSTRAINT [PK_Khach] PRIMARY KEY CLUSTERED 
(
	[MaKhach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 5/21/2018 10:26:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [nvarchar](10) NOT NULL,
	[TenNhanVien] [nvarchar](50) NOT NULL,
	[GioiTinh] [nvarchar](10) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[DienThoai] [nvarchar](15) NOT NULL,
	[NgaySinh] [nchar](10) NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[ChatLieu] ([MaChatLieu], [TenChatLieu]) VALUES (N'MCL001', N'Sắt')
INSERT [dbo].[ChatLieu] ([MaChatLieu], [TenChatLieu]) VALUES (N'MCL002', N'Đồng')
INSERT [dbo].[ChiTienHDBan] ([MaHDBan], [MaHang], [SoLuong], [DonGia], [GiamGia], [ThanhTien]) VALUES (N'HDB001', N'H001', 5, 60000, 5000, 55000)
INSERT [dbo].[ChiTienHDBan] ([MaHDBan], [MaHang], [SoLuong], [DonGia], [GiamGia], [ThanhTien]) VALUES (N'HDB002', N'H002', 10, 150000, 0, 150000)
INSERT [dbo].[Hang] ([MaHang], [TenHang], [MaChatLieu], [SoLuong], [DonGiaNhap], [DonGiaBan], [Anh], [GhiChu]) VALUES (N'H001', N'Bút sắt', N'MCL001', 10, 10000, 12000, N'butsat.jpg', N'Đây là cây bút')
INSERT [dbo].[Hang] ([MaHang], [TenHang], [MaChatLieu], [SoLuong], [DonGiaNhap], [DonGiaBan], [Anh], [GhiChu]) VALUES (N'H002', N'Đồng tiền', N'MCL002', 30, 12000, 15000, N'dontien.jpg', N'Đây là đồng tiền')
INSERT [dbo].[HDBan] ([MaHDBan], [MaNhanVien], [NgayBan], [MaKhach], [TongTien]) VALUES (N'HDB001', N'NV001', N'15/5/2017 ', N'K001', 55000)
INSERT [dbo].[HDBan] ([MaHDBan], [MaNhanVien], [NgayBan], [MaKhach], [TongTien]) VALUES (N'HDB002', N'NV002', N'20/5/2017 ', N'K002', 150000)
INSERT [dbo].[HDBan] ([MaHDBan], [MaNhanVien], [NgayBan], [MaKhach], [TongTien]) VALUES (N'HDB003', N'NV001', N'15/4/2017 ', N'K002', 61200)
INSERT [dbo].[HDBan] ([MaHDBan], [MaNhanVien], [NgayBan], [MaKhach], [TongTien]) VALUES (N'HDB005', N'NV002', N'15/5/2017 ', N'K001', 67500)
INSERT [dbo].[Khach] ([MaKhach], [TenKhach], [DiaChi], [DienThoai]) VALUES (N'K001', N'Huy', N'18DK', N'09133746353')
INSERT [dbo].[Khach] ([MaKhach], [TenKhach], [DiaChi], [DienThoai]) VALUES (N'K002', N'Minh', N'20LDC', N'01694857685')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [DiaChi], [DienThoai], [NgaySinh]) VALUES (N'NV001', N'TNQBAO', N'NỮ', N'12 DK', N'0912836364837', N'10/5/1996 ')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [DiaChi], [DienThoai], [NgaySinh]) VALUES (N'NV002', N'TNMINH', N'NAM', N'20LDC', N'091347837463', N'21/3/1997 ')
ALTER TABLE [dbo].[ChiTienHDBan]  WITH CHECK ADD  CONSTRAINT [FK_ChiTienHDBan_Hang] FOREIGN KEY([MaHang])
REFERENCES [dbo].[Hang] ([MaHang])
GO
ALTER TABLE [dbo].[ChiTienHDBan] CHECK CONSTRAINT [FK_ChiTienHDBan_Hang]
GO
ALTER TABLE [dbo].[ChiTienHDBan]  WITH CHECK ADD  CONSTRAINT [FK_ChiTienHDBan_HDBan] FOREIGN KEY([MaHDBan])
REFERENCES [dbo].[HDBan] ([MaHDBan])
GO
ALTER TABLE [dbo].[ChiTienHDBan] CHECK CONSTRAINT [FK_ChiTienHDBan_HDBan]
GO
ALTER TABLE [dbo].[Hang]  WITH CHECK ADD  CONSTRAINT [FK_Hang_ChatLieu] FOREIGN KEY([MaChatLieu])
REFERENCES [dbo].[ChatLieu] ([MaChatLieu])
GO
ALTER TABLE [dbo].[Hang] CHECK CONSTRAINT [FK_Hang_ChatLieu]
GO
ALTER TABLE [dbo].[HDBan]  WITH CHECK ADD  CONSTRAINT [FK_HDBan_Khach] FOREIGN KEY([MaKhach])
REFERENCES [dbo].[Khach] ([MaKhach])
GO
ALTER TABLE [dbo].[HDBan] CHECK CONSTRAINT [FK_HDBan_Khach]
GO
ALTER TABLE [dbo].[HDBan]  WITH CHECK ADD  CONSTRAINT [FK_HDBan_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[HDBan] CHECK CONSTRAINT [FK_HDBan_NhanVien]
GO
USE [master]
GO
ALTER DATABASE [QuanLyBanHang] SET  READ_WRITE 
GO
