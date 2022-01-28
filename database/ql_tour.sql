-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3308
-- Thời gian đã tạo: Th1 28, 2022 lúc 01:32 PM
-- Phiên bản máy phục vụ: 5.7.31
-- Phiên bản PHP: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ql_tour`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ct_phieudk`
--

DROP TABLE IF EXISTS `ct_phieudk`;
CREATE TABLE IF NOT EXISTS `ct_phieudk` (
  `maPhieu` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `maTour` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `soNguoi` int(11) NOT NULL,
  PRIMARY KEY (`maPhieu`,`maTour`),
  KEY `FK_03` (`maTour`),
  KEY `maPhieu` (`maPhieu`,`maTour`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ct_phieudk`
--

INSERT INTO `ct_phieudk` (`maPhieu`, `maTour`, `soNguoi`) VALUES
('P01', 'T1', 10),
('P02', 'T1', 5),
('P03', 'T2', 15),
('P04', 'T3', 10),
('P04', 'T4', 20),
('P05', 'T3', 2),
('P06', 'T4', 3),
('P06', 'T6', 12),
('P07', 'T2', 4),
('P08', 'T2', 10),
('P08', 'T3', 2),
('P08', 'T5', 50);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khach_hang`
--

DROP TABLE IF EXISTS `khach_hang`;
CREATE TABLE IF NOT EXISTS `khach_hang` (
  `maKH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenKH` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diaChi` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`maKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khach_hang`
--

INSERT INTO `khach_hang` (`maKH`, `tenKH`, `diaChi`) VALUES
('KH1', 'Công ty Thái Bình', 'Tân Bình'),
('KH2', 'Tran Diem Hong', 'Bình Chánh'),
('KH3', 'Công ty Xuân Phân', 'Quan 1'),
('KH4', 'Công ty Thành Dat', 'Quan 8'),
('KH5', 'Cao My Duyên', 'Thu Duc'),
('KH6', 'Trinh Quynh Dao', 'Phu Nhuan');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieu_dang_ky`
--

DROP TABLE IF EXISTS `phieu_dang_ky`;
CREATE TABLE IF NOT EXISTS `phieu_dang_ky` (
  `maPhieu` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngayDK` date NOT NULL,
  `maKH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`maPhieu`),
  KEY `FK_01` (`maKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieu_dang_ky`
--

INSERT INTO `phieu_dang_ky` (`maPhieu`, `ngayDK`, `maKH`) VALUES
('P01', '2013-09-02', 'KH1'),
('P02', '2013-10-22', 'KH3'),
('P03', '2013-12-25', 'KH2'),
('P04', '2013-01-15', 'KH4'),
('P05', '2014-02-03', 'KH5'),
('P06', '2014-02-19', 'KH1'),
('P07', '2014-03-08', 'KH5'),
('P08', '2022-01-20', 'KH6');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour`
--

DROP TABLE IF EXISTS `tour`;
CREATE TABLE IF NOT EXISTS `tour` (
  `maTour` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `loTrinh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hanhTrinh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `giaTour` int(11) NOT NULL,
  PRIMARY KEY (`maTour`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tour`
--

INSERT INTO `tour` (`maTour`, `loTrinh`, `hanhTrinh`, `giaTour`) VALUES
('T1', 'Tp.HCM – Da Nang', '3 ngày 2 dem', 3500000),
('T2', 'Tp.HCM – Phan Thiet', '2 ngày 1 dem', 2500000),
('T3', 'Tp.HCM – Da Lat', '4 ngày 5 dem', 5000000),
('T4', 'Tp.HCM – Hue', '6 ngày 7 dem', 10000000),
('T5', 'Tp.HCM – SaPa', '5 ngày 6 dem', 10000000),
('T6', 'Tp.HCM – Hoi An', '2 ngày 3 dem', 7500000),
('T7', 'Tp.HCM – Ha Long', '3 ngày 3 dem', 6000000);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `ct_phieudk`
--
ALTER TABLE `ct_phieudk`
  ADD CONSTRAINT `FK_02` FOREIGN KEY (`maPhieu`) REFERENCES `phieu_dang_ky` (`maPhieu`),
  ADD CONSTRAINT `FK_03` FOREIGN KEY (`maTour`) REFERENCES `tour` (`maTour`);

--
-- Các ràng buộc cho bảng `phieu_dang_ky`
--
ALTER TABLE `phieu_dang_ky`
  ADD CONSTRAINT `FK_01` FOREIGN KEY (`maKH`) REFERENCES `khach_hang` (`maKH`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
