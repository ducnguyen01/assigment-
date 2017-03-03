create database qlbh
use qlbh

create table TAI_KHOAN(
Username nvarchar(50) not null primary key,
Pass nvarchar(50) not null,
Vai_tro nvarchar(50) not null,
Ho_ten nvarchar(50) not null,
Dia_chi nvarchar(50) not null,
Email nvarchar(50) not null,
Sdt nvarchar (15) not null
)

create table LOAI_SP(
Ma_loai nchar(10) not null primary key,
Loai_sp nvarchar(50) not null,
)

create table SAN_PHAM(
Ma_sp nchar(10) not null primary key,
Ten_sp nvarchar(50) not null,
Mo_ta nvarchar(500) not null,
So_luong int not null,
Don_gia float not null,
Hinh_anh nvarchar(200) not null,
Nha_sx nvarchar(50) not null,
Ma_loai nchar(10) not null,
foreign key (Ma_loai) references LOAI_SP(Ma_loai)
)

create table DON_HANG(
Ma_don_hang nchar(10) not null primary key,
Username nvarchar(50) not null,
Ngay_mua datetime not null,
Trang_thai nchar(10),
foreign key (Username) references TAI_KHOAN(Username)
)

create table DON_HANG_CT(
Ma_don_hang_ct nchar(10) not null primary key,
Ma_don_hang nchar(10) not null,
Ma_sp nchar(10) not null,
So_luong int not null,
Gia_tien float not null,
foreign key (Ma_sp) references SAN_PHAM(Ma_sp),
foreign key (Ma_don_hang) references DON_HANG(Ma_don_hang),
)

-- Truy xuất nhập liệu
select * from TAI_KHOAN 
select * from LOAI_SP
select * from SAN_PHAM
SELECT * FROM SAN_PHAM WHERE Ma_loai = '" + Ma_loai + "'
insert into TAI_KHOAN values(
'nguyen','123456','admin','nguyen','111 NTT','nguyen@yahoo.com','11111111')
insert into TAI_KHOAN values(
'ducnguyen','123456','customer','nguyen','222 NTT','nguyen2@yahoo.com','22222222')




insert into LOAI_SP values(
'k01','So mi nam')
insert into LOAI_SP values(
'k02','So mi nu')




insert into SAN_PHAM values(
'sp001','So mi nam han quoc','Chất lượng vải cực tốt, theo xu hướng thời đại.',200, 5000000,'images/4.jpg','ASUS','k02')
insert into SAN_PHAM values(
'sp002','đồng hồ nam','điêu khắc cực đẹp, nam tính',200, 6000000,'','images/3.jpg','k02')
insert into SAN_PHAM values(
'sp003','sơ mi nam ấn độ',' Sắc màu thanh lịch, trẻ trung sôi động',200, 7000000,'','images/14.jpg','k02')
insert into SAN_PHAM values(
'sp004','áo len nữ','Hiện đang là xu hướng của thời đại',200, 8000000,'','images/pic7.jpg','k02')
insert into SAN_PHAM values(
'sp005','ba lô trẻ trung','mạnh mẽ, tràn đầy sức sống',200, 9000000,'','images/13.jpg','k02')
insert into SAN_PHAM values(
'sp006','Áo sơ mi nam châu âu','đẹp đẽ, mạnh mẽ, chất như trai tây',200, 6000000,'','images/11.jpg','k01')
insert into SAN_PHAM values(
'sp007','Sơ mi nữ đen','Toát lên vẻ đẹp lạnh lùng',200, 7000000,'','images/8.jpg','k01')
insert into SAN_PHAM values(
'sp008','Combo Áo ren, kính, dây chuyền','Sang chảnh từ mọi góc nhìn',200, 14000000,'','images/s1.jpg','k01')
insert into SAN_PHAM values(
'sp009','mũ len đỏ','đẹp',200, 10000000,'','images/pic7.jpg','k01')
insert into SAN_PHAM values(
'sp010','thắt lưng đen','độ nam tính cực cao, quyến rũ phái đẹp',200, 11000000,'','images/5.jpg','k01')
